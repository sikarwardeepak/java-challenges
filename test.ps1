param(
    [string]$Module,
    [string]$Problem
)

# Build the Maven command
$testPath = if ($Module -and $Problem) {
    "com.java.challenges.$Module.$Problem.**"
} elseif ($Module) {
    "com.java.challenges.$Module.**"
} else {
    $null
}

Write-Host ""
Write-Host "Running Tests..." -ForegroundColor Cyan
Write-Host ""

# Run Maven (NOT quiet mode) and capture output
$cmd = if ($testPath) { "mvn test -Dtest=`"$testPath`"" } else { "mvn test" }
$output = Invoke-Expression $cmd 2>&1

# Parse test results
$passedTests = New-Object System.Collections.ArrayList
$failedTests = New-Object System.Collections.ArrayList
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
        
        if ($currentClass) {
            [void]$failedTests.Add($currentClass)
        }
    }
    elseif ($lineStr -match 'Tests run:\s+(\d+),\s+Failures:\s+0,\s+Errors:\s+0') {
        $runs = [int]$matches[1]
        $totalTests += $runs
        
        if ($currentClass) {
            [void]$passedTests.Add($currentClass)
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
    foreach ($test in $passedTests) {
        Write-Host "  + $test" -ForegroundColor Green
    }
    Write-Host ""
}

# Show failed tests
if ($failedTests.Count -gt 0) {
    $failedMsg = "FAILED (" + $failedTests.Count + " problems):"
    Write-Host $failedMsg -ForegroundColor Red
    foreach ($test in $failedTests) {
        Write-Host "  X $test" -ForegroundColor Red
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
