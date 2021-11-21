# Hashtables
<!-- Short summary or background information -->
hash table (hash map) is a data structure that implements an associative array abstract data type, a structure that can map keys to values. A hash table uses a hash function to compute an index, also called a hash code, into an array of buckets or slots, from which the desired value can be found. During lookup, the key is hashed and the resulting hash indicates where the corresponding value is stored.
## Challenge30
<!-- Description of the challenge -->

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
get()
Time O(1) this case if there is no collision and the worst is all item in same index will be O(n)
space:O(1)
add() 
Time : O(n^2) because there is nested loop
space:O(n) will add a null values for all value in array 
## API
<!-- Description of each method publicly available in each of your hashtable -->

Implement a Hashtable Class with the following methods:

* add
- Arguments: key, value
- Returns: nothing

This method should hash the key, and add the key and value pair to the table, handling collisions as needed.

* get
- Arguments: key
- Returns: Value associated with that key in the table

* contains
- Arguments: key
- Returns: Boolean, indicating if the key exists in the table already.

* hash
- Arguments: key
- Returns: Index in the collection for that key.
