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
  Write a function called repeated word that finds the first word to occur more than once in a string

- Arguments: string
- Return: string

## Challenge 31
Write a function called repeated word that finds the first word to occur more than once in a string
- Arguments: string
- Return: string
## Whiteboard Process
![wb](./ch31.png)

## Approach & Efficiency
The idea is to splite the string and store each word and its count in hashmap. Then traverse the string again and for each word of string, check its count in created hashtable.

Time Complexity:  O(n^2): two for loop

Space Complexity:  O(n)

## Challenge 32
Find all values found to be in 2 binary trees
Write a function called tree intersection
- Arguments: two binary trees
- Return: array


## Whiteboard Process
![wb](./ch32.png)

## Approach & Efficiency
Check all the nodes in each tree, if the value of the node in the first tree has the same value 
of the second tree, would add in the third tree.

Time Complexity:  O(n^2)

Space Complexity:  O(n)

## Challenge 33

Write a function called left join Return: The returned data structure that holds the results 
is up to you. It doesn’t need to exactly match the output below, so long as it achieves the LEFT JOIN logic


## Whiteboard Process

![wb](./ch33.png)

## Approach & Efficiency
Create a method that takes two hashmaps. Declare two list, the first one 
to hold the key and the value of that key for the first and second hashmap, and the second one to hold all of these lists.

Time Complexity: O(n): for loop

Space Complexity: O(n)
