# Rate Limiter

## Problem
Design a simple Rate Limiter that restricts a client to a certain number of requests within a time window.
For this problem, implement a `RateLimiter` class that allows `maxRequests` per `timeWindowInSeconds`.

## Requirements
- The constructor should accept `maxRequests` and `timeWindowInSeconds`.
- The `boolean allowRequest(String clientId)` method should return `true` if the request is allowed, and `false` otherwise.
- In a real interview, you might need to consider concurrency. For this basic practice, you can start with a non-thread-safe or simple synchronized solution, but `PracticeTest` might run in parallel if configured (default JUnit is sequential for methods usually). Standard thread-safety (synchronized) is recommended.

## Example
RateLimiter limiter = new RateLimiter(2, 5); // 2 requests per 5 seconds
limiter.allowRequest("user1"); // true
limiter.allowRequest("user1"); // true
limiter.allowRequest("user1"); // false (limit reached)
// after 5 seconds...
limiter.allowRequest("user1"); // true
