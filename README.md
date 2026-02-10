# Java Challenges - 100 Problem Solving Exercises

A comprehensive Java problem-solving project with **100 sequentially numbered problems** (p001 to p100) organized across 5 modules. Each problem includes a reference solution, a practice stub, unit tests, and a problem description.

## 📁 Modules

| Module | Package | Problems | Range |
|--------|---------|----------|-------|
| **Strings** | `com.java.challenges.strings` | 20 | p001-p020 |
| **Arrays** | `com.java.challenges.arrays` | 20 | p021-p040 |
| **Collections** | `com.java.challenges.collections` | 20 | p041-p060 |
| **Functional Programming** | `com.java.challenges.functional` | 20 | p061-p080 |
| **Machine Coding** | `com.java.challenges.machinecoding` | 20 | p081-p100 |

## 📂 Each Problem Contains

```
p001_reversestring/
├── Problem.md        # Problem description & examples
├── Solution.java     # Reference solution (for learning)
├── Practice.java     # YOUR code goes here (empty stub)
└── PracticeTest.java # Unit tests to validate your solution
```

## 🚀 Getting Started

### Prerequisites
- Java 17+
- Maven 3.8+

### How to Solve a Problem
1. Navigate to a problem's directory (e.g., `strings/p001_reversestring/`)
2. Read `Problem.md` to understand the problem
3. Open `Practice.java` and write your solution
4. Run the test to verify: `mvn -Dtest="com.java.challenges.strings.p001_reversestring.PracticeTest" test`

**💡 Tip:** Solve problems in sequential order (p001 → p100) for a structured learning path!

### Run All Tests
```bash
mvn test
```

### Run Tests for a Specific Module
```bash
mvn -Dtest="com.java.challenges.strings.**" test
mvn -Dtest="com.java.challenges.arrays.**" test
mvn -Dtest="com.java.challenges.collections.**" test
mvn -Dtest="com.java.challenges.functional.**" test
mvn -Dtest="com.java.challenges.machinecoding.**" test
```

## 📋 Problem Index

### Strings (p001-p020)
| # | Problem | Difficulty |
|---|---------|-----------|
| p001 | Reverse String | Easy |
| p002 | Palindrome Check | Easy |
| p003 | Anagram Check | Easy |
| p004 | Count Vowels | Easy |
| p005 | Remove Duplicates | Easy |
| p006 | Longest Substring Without Repeating | Medium |
| p007 | String Compression | Medium |
| p008 | First Non-Repeating Character | Easy |
| p009 | Longest Common Prefix | Easy |
| p010 | Reverse Words | Medium |
| p011 | Isomorphic Strings | Medium |
| p012 | Valid Palindrome II | Medium |
| p013 | Count and Say | Medium |
| p014 | String Rotation | Easy |
| p015 | Caesar Cipher | Easy |
| p016 | Title Case | Easy |
| p017 | Longest Word | Easy |
| p018 | Pangram Check | Easy |
| p019 | Character Frequency | Easy |
| p020 | Substring Count | Easy |

### Arrays (p021-p040)
| # | Problem | Difficulty |
|---|---------|-----------|
| p021 | Two Sum | Easy |
| p022 | Max Subarray Sum (Kadane's) | Medium |
| p023 | Merge Sorted Arrays | Easy |
| p024 | Rotate Array | Medium |
| p025 | Move Zeroes | Easy |
| p026 | Product Except Self | Medium |
| p027 | Contains Duplicate | Easy |
| p028 | Find Missing Number | Easy |
| p029 | Best Time to Buy & Sell Stock | Easy |
| p030 | Three Sum | Medium |
| p031 | Merge Intervals | Medium |
| p032 | Sort Colors (Dutch Flag) | Medium |
| p033 | Kth Largest Element | Medium |
| p034 | Subarray Sum Equals K | Medium |
| p035 | Jump Game | Medium |
| p036 | Max Product Subarray | Medium |
| p037 | Search in Rotated Array | Medium |
| p038 | Next Permutation | Medium |
| p039 | Spiral Matrix | Medium |
| p040 | Pair Sum Target | Easy |

### Collections (p041-p060)
| # | Problem | Difficulty |
|---|---------|-----------|
| p041 | Frequency Count | Easy |
| p042 | LRU Cache | Hard |
| p043 | Top K Frequent Elements | Medium |
| p044 | Group By Age | Easy |
| p045 | Merge K Sorted Lists | Medium |
| p046 | Find Duplicates | Easy |
| p047 | Intersection of Arrays | Easy |
| p048 | Sort Map By Value | Medium |
| p049 | Stack Using Queues | Medium |
| p050 | Queue Using Stacks | Medium |
| p051 | Min Stack | Medium |
| p052 | First Unique Character | Easy |
| p053 | Word Pattern | Medium |
| p054 | Remove All Occurrences | Easy |
| p055 | Two Sum Map | Easy |
| p056 | Subdomain Visit Count | Medium |
| p057 | Design HashSet | Easy |
| p058 | Ransom Note | Easy |
| p059 | Jewels and Stones | Easy |
| p060 | Uncommon Words | Easy |

### Functional Programming (p061-p080)
| # | Problem | Difficulty |
|---|---------|-----------|
| p061 | Filter and Map | Easy |
| p062 | Reduce Sum | Easy |
| p063 | FlatMap Nested | Easy |
| p064 | Group By Property | Medium |
| p065 | Custom Comparator | Medium |
| p066 | Optional Handling | Easy |
| p067 | Stream to Map | Easy |
| p068 | Predicate Chaining | Medium |
| p069 | Function Composition | Medium |
| p070 | Collector Grouping | Medium |
| p071 | Partition By | Easy |
| p072 | Reduce To Max | Easy |
| p073 | Stream Generate (Fibonacci) | Medium |
| p074 | Custom Collector (Joining) | Easy |
| p075 | Peek and ForEach | Easy |
| p076 | String Joining | Easy |
| p077 | Summary Statistics | Easy |
| p078 | Stream Distinct | Easy |
| p079 | Map and Collect to Set | Easy |
| p080 | Chained Operations | Medium |

### Machine Coding (p081-p100)
| # | Problem | Difficulty |
|---|---------|-----------|
| p081 | Rate Limiter | Medium |
| p082 | Parking Lot | Medium |
| p083 | Tic Tac Toe | Medium |
| p084 | Vending Machine | Medium |
| p085 | Elevator System | Medium |
| p086 | In-Memory File System | Hard |
| p087 | Splitwise (Expense Split) | Medium |
| p088 | Snake & Ladder | Medium |
| p089 | Logging Framework | Medium |
| p090 | Task Manager | Medium |
| p091 | URL Shortener | Medium |
| p092 | Library Management | Medium |
| p093 | ATM Machine | Medium |
| p094 | Online Voting | Medium |
| p095 | Inventory Management | Medium |
| p096 | Pub-Sub System | Medium |
| p097 | Simple Q&A (Stack Overflow) | Medium |
| p098 | Todo List | Easy |
| p099 | Calendar Scheduler | Medium |
| p100 | Shopping Cart | Medium |
