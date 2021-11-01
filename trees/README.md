# Trees
<!-- Short summary or background information -->
A binary search tree is a rooted binary tree with 
labelled nodes. The nodes are labelled with representations 
of the members of the set. Each node except the root has
an incoming branch from its parent. For uniformity, each 
node is considered to have two outgoing branches, 
called left and right.

## Challenge
<!-- Description of the challenge -->
Create a Node class that has properties for the value stored in 
the node, the left child node, and the right child node.

Create a Binary Tree class
Define a method for each of the depth first traversals:
* pre order
* in order
* post order

Create a Binary Search Tree class
This class is sub-class from binary Tree class  
the Binary Tree Class, with the following additional methods:
Add
Arguments: value
Return: nothing
Adds a new node with that value in the correct location in the binary search tree.
Contains
Argument: value
Returns: boolean indicating whether or not the value is in the tree at least once.


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

 Big O
 insert  log(n)  because there is a loop but each itarate i ignore halve of the tree
 contain  log(n)  because there is a loop but each itarate i ignore halve of the tree

## API
<!-- Description of each method publicly available in each of your trees -->

Add
Arguments: value
Return: nothing
Adds a new node with that value in the correct location in the binary search tree.
Contains
Argument: value
Returns: boolean indicating whether or not the value is in the tree at least once.

# Challenge Summary 16 
<!-- Description of the challenge -->
Find the Maximum Value in a Binary Tree
## Whiteboard Process
<!-- Embedded whiteboard image -->
![white board](https://ahmadalasaad.github.io/data-structures-and-algorithms-java/trees/max.jpg?raw=true)

## Approach & Efficiency

<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Time   O(n)  because we iterate inside while loop
space  O(1) because we didn't assign more than one in the same time

## Solution
<!-- Show how to run your code, and examples of it in action -->
you can run the library and see the output from there

# Challenge Summary
<!-- Description of the challenge -->
Write a function called breadth first
Arguments: tree
Return: list of all values in the tree, in the order they were encountered
## Whiteboard Process
<!-- Embedded whiteboard image -->
![white board](https://ahmadalasaad.github.io/data-structures-and-algorithms-java/trees/bre.jpg?raw=true)


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
explaind in white board
## Solution
<!-- Show how to run your code, and examples of it in action -->
you can run the library and see the output from there
