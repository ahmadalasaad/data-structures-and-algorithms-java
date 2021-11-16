Blog
##ch26
## Insertion Sort

Using insertion sort, sorts array items from least to biggest number.

Pseudocode

InsertionSort(int[] arr)

```
FOR i = 1 to arr.length

  int j <-- i - 1
  int temp <-- arr[i]
  
  WHILE j >= 0 AND temp < arr[j]
    arr[j + 1] <-- arr[j]
    j <-- j - 1
    
  arr[j + 1] <-- temp
```

## Trace

```
Sample Array: [4, 25, 30, 15, 16]
```

Pass 1

The array will be traversed first, and the numbers in the array will be compared. The array will be
divided into two parts: sorted and unsorted. In the next passes, the unsorted numbers will be
selected and placed in the appropriate locations.

Pass 2

The second pass will swap the 15 and the 30.

Pass 3

The second pass will swap the 15 and the 25.

Pass 4

The second pass will swap the 16 and the 25.

Pass 5

The second pass will swap the 16 and the 30.


##ch27

### Trace
Sample Array: [8,4,23,42,16,15]
Pass 1

First will pass through the array, and then split the array in two.

Pass 2

The array is split into two seperate arrays.

Pass 3

The two arrays will split again.

Pass 4

The left side will be sorted.

Pass 5

The right side will be sorted

Pass 6

Both sides will merge once the sorting is done.

Pass 7

Final iteration will the finished merged array.

##ch28


### Trace

```
Sample Array: [8,4,23,42,16,15]
```

Pass 1

To begin, we define the position as the result of a call to partition on the whole array, with the
pivot value set to 15.

Pass 2

Because 8 and 4 are the only numbers smaller than 15, they are "usefully" exchanged.

Pass 3

The number 15 is replaced with the number 23, resulting in a partition index of two. The section of
the array to the left of the partition (15) is then quicksorted, with 4 as the pivot value. There
are no swaps since 8 is not smaller than 4. The number 4 is replaced with the number 8, resulting in
a partition index of 0.

Pass 4

Then, using 0 as the left value and -1 as the right value, we call quicksort. Nothing is done since
0 is not less than left (0).

Pass 5

Then, with 1 as the left and right values, we call quicksort. Nothing is done since 1 is not smaller
than 1.

Pass 6

The section of the array to the right of the partition (15) is then quicksorted, with 23 as the
pivot value. There is no swap because 42 is more than 23. Because 16 is less than 23, it is replaced
with the low index of 3. The partition index of 4 is defined by swapping 23 with 42. Then, using 3
as the left and right values, we call quicksort. Nothing is done since 3 is not less than 3. Then,
with 5 as the left and right values, we call quicksort. Nothing is done because 5 is not less than

5. We've completed the right half of 15!

Pass 7

Sorted Array: [4, 8, 15, 16, 23, 42]