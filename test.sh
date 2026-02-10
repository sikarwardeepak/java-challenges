#!/bin/bash
# Simple wrapper to run Maven tests with clean output

# Run Maven in quiet mode and filter output
mvn -q test "$@" 2>&1 | grep -E "Tests run:|Running|FAILURE|BUILD"
