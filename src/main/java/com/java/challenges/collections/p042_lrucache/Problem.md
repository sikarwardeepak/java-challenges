# LRU Cache
## Problem
Design a data structure that follows the constraints of a Least Recently Used (LRU) cache. Implement get(key) and put(key, value).
## Example
LRUCache cache = new LRUCache(2);
cache.put(1, 1); cache.put(2, 2);
cache.get(1); // returns 1
cache.put(3, 3); // evicts key 2
cache.get(2); // returns -1