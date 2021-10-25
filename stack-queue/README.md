# Stacks and Queues
<!-- Short summary or background information -->
I make stack and queue classes :
Stacks follow these concepts:
FILO
First In Last Out
This means that the first item added in the stack will be the last item popped out of the stack.
LIFO
Last In First Out
This means that the last item added to the stack will be the first item popped out of the stack.
Queues follow these concepts:
FIFO
First In First Out
This means that the first item in the queue will be the first item out of the queue.
LILO
Last In Last Out

## Challenge
<!-- Description of the challenge -->

* Node : Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.
* Stack : Create a Stack class that has a top property. It creates an empty Stack when instantiated.
  This object should be aware of a default empty value assigned to top when the stack is created.
* Queue : Create a Queue class that has a front property. It creates an empty Queue when instantiated.
  This object should be aware of a default empty value assigned to front when the queue is created.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

| **Method**| **Time complixty** | **space complixty** |
| ----------------- | ------------- | ------------- |
| push|O(1)|O(1)|
| pop| O(1)|O(1)|
| isEmpty |O(1) |O(1)|
| peek | o(1) | O(1)
| enqueue queue | o(1) | O(1)
| dequeue queue | o(1) | O(1)
| enqueue Pseudodqueue | O(1) | O(1)
| dequeue Pseudodqueue | o(n) | O(n)


For all of them it's O(1) because there is no loops

## API
<!-- Description of each method publicly available to your Stack and Queue-->
push:
to add node to the stack
pop:
remove node from stack
isEmpty:
if empty return true
peek:
return top to stack and front for queue
enqueue:
add node to the queue
dequeue:
remove node from queue
enqueue pseudo:
add node to the queue
dequeue pseudo:
remove node from queue

# white board to challenge 11
![white board](https://ahmadalasaad.github.io/data-structures-and-algorithms-java/stack-queue/pseudo.jpg?raw=true)
# white board to challenge 11
![white board](https://ahmadalasaad.github.io/data-structures-and-algorithms-java/stack-queue/animal.jpg?raw=true)


