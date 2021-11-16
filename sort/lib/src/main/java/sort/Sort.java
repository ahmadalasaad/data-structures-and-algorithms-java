package sort;

import java.util.Arrays;
/*ch26*/
public class Sort {
    public int[] insertionSort(int[] arr) {
        if (arr.length > 1) {
            for (int i = 1; i < arr.length; i++) {
                int j = i - 1;
                int temp = arr[i];
                while (j >= 0 && temp<arr[j] ) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = temp;
            }
        }

        return arr;
    }

    /*ch27*/
    public int[] mergeSort(int[] arr) {

        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);
            mergeSort(left);
            mergeSort(right);
            merge(left, right, arr);
        }

        return arr;
    }

    private void merge(int[] left, int[] right, int[] original) {
        int leftIndex = 0;
        int rightIndex = 0;
        int originalIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {

            if (left[leftIndex]<=right[rightIndex]) {
                original[originalIndex] = left[leftIndex];
                leftIndex++;
            } else {
                original[originalIndex] = right[rightIndex];
                rightIndex++;
            }

            originalIndex++;
        }

        if (leftIndex == left.length) {

            while (rightIndex < right.length) {
                original[originalIndex] = right[rightIndex];
                originalIndex++;
                rightIndex++;
            }

        } else {
            while (leftIndex < left.length) {
                original[originalIndex] = left[leftIndex];
                originalIndex++;
                leftIndex++;
            }
        }
    }

    /*ch28*/
    public int[] quicksort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quicksort(arr, left, partitionIndex - 1);
            quicksort(arr, partitionIndex + 1, right);
        }
        return arr;
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[right];

        int low = left - 1;

        for (int i = left; i < right; i++) {
            if (arr[i]<=pivot) {
                low++;
                swap(arr, i, low);
            }
        }

        swap(arr, right, low + 1);

        return low + 1;
    }

    private void swap(int[] arr, int i, int low) {
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }

}

