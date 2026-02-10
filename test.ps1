param(
    [string]$Module,
    [string]$Problem
)

# Build the Maven command
$testPath = $null

if ($Problem) {
    # If problem starts with just a number, add 'p' prefix
    if ($Problem -match '^\d+$') {
        $Problem = "p" + $Problem.PadLeft(3, '0')
    }
    # If problem doesn't have wildcard and doesn't end with full name, add wildcard
    if (-not $Problem.Contains('*') -and $Problem -match '^p\d+$') {
        $Problem = $Problem + '_*'
    }
    
    if ($Module) {
        $testPath = "com.java.challenges.$Module.$Problem.**"
    } else {
        Write-Host "Error: Module is required when specifying a problem" -ForegroundColor Red
        exit 1
    }
} elseif ($Module) {
    $testPath = "com.java.challenges.$Module.**"
}

Write-Host ""
Write-Host "Running Tests..." -ForegroundColor Cyan
Write-Host ""

# Run Maven and capture output
$cmd = if ($testPath) { "mvn test -Dtest=`"$testPath`"" } else { "mvn test" }
$output = Invoke-Expression $cmd 2>&1

# Parse test results - use hashtable to avoid duplicates
$passedTests = @{}
$failedTests = @{}
$totalTests = 0
$totalFailures = 0
$totalErrors = 0
$currentClass = ""

foreach ($line in $output) {
    $lineStr = $line.ToString()
    
    # Extract class name from "Running" line
    if ($lineStr -match '\[INFO\] Running com\.java\.challenges\.(\w+)\.(p\d+_\w+)\.PracticeTest') {
        $currentClass = $matches[2]
    }
    
    # Extract summary for each test class
    if ($lineStr -match '\[ERROR\] Tests run:\s+(\d+),\s+Failures:\s+(\d+),\s+Errors:\s+(\d+)') {
        $runs = [int]$matches[1]
        $fails = [int]$matches[2]
        $errs = [int]$matches[3]
        
        $totalTests += $runs
        $totalFailures += $fails
        $totalErrors += $errs
        
        if ($currentClass -and -not $failedTests.ContainsKey($currentClass)) {
            $failedTests[$currentClass] = $true
        }
    }
    elseif ($lineStr -match 'Tests run:\s+(\d+),\s+Failures:\s+0,\s+Errors:\s+0' -and $lineStr -notmatch '\[ERROR\]') {
        $runs = [int]$matches[1]
        $totalTests += $runs
        
        if ($currentClass -and -not $passedTests.ContainsKey($currentClass)) {
            $passedTests[$currentClass] = $true
        }
    }
}

# Display results
Write-Host "Test Results" -ForegroundColor Cyan
Write-Host "================================================================" -ForegroundColor DarkGray
Write-Host ""

# Show passed tests
if ($passedTests.Count -gt 0) {
    $passedMsg = "PASSED (" + $passedTests.Count + " problems):"
    Write-Host $passedMsg -ForegroundColor Green
    $passedTests.Keys | Sort-Object | ForEach-Object {
        Write-Host "  + $_" -ForegroundColor Green
    }
    Write-Host ""
}

# Show failed tests
if ($failedTests.Count -gt 0) {
    $failedMsg = "FAILED (" + $failedTests.Count + " problems):"
    Write-Host $failedMsg -ForegroundColor Red
    $failedTests.Keys | Sort-Object | ForEach-Object {
        Write-Host "  X $_" -ForegroundColor Red
    }
    Write-Host ""
}

# Summary
Write-Host "Summary" -ForegroundColor Cyan
Write-Host "----------------------------------------------------------------" -ForegroundColor DarkGray
$passedCount = $totalTests - $totalFailures - $totalErrors
Write-Host "Total:   $totalTests tests"
Write-Host "Passed:  $passedCount" -ForegroundColor Green
Write-Host "Failed:  $totalFailures" -ForegroundColor Red

if ($totalErrors -gt 0) {
    Write-Host "Errors:  $totalErrors" -ForegroundColor Yellow
}

Write-Host ""

if ($totalFailures -gt 0 -or $totalErrors -gt 0) {
    exit 1
} else {
    exit 0
}
