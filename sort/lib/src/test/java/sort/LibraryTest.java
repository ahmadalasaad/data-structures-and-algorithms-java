/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
/*-----------------ch26---------------------*/
    @Test
    public void testInsertionSortEmpty() {
        int[] emptyArr=new int[0];
        Sort emptySort=new Sort();

        assertArrayEquals(new int[]{}, emptySort.insertionSort(emptyArr));
    }

    @Test
    public void testInsertionSortMultNum() {
        Sort integerSort = new Sort();
        int[] integerArr = new int[]{4, 25, 30, 15, 16};

        assertArrayEquals(new int[]{4, 15, 16, 25, 30}, integerSort.insertionSort(integerArr));
    }

    @Test
    public void testInsertionSortNeg() {
        int[] integerNegArr = new int[]{4, -25, 30, 15, -15, 99, 3, 0};
        Sort integerNegSort = new Sort();
        assertArrayEquals(new int[]{-25, -15, 0, 3, 4, 15, 30, 99},
                integerNegSort.insertionSort(integerNegArr));
    }
/*------------------------------------ch27----------------------------------*/
@Test
public void testInsertionSortEmptyMergeSort() {
    int[] emptyArr=new int[0];
    Sort emptySort=new Sort();
    assertArrayEquals(new int[]{}, emptySort.mergeSort(emptyArr));
}

    @Test
    public void testInsertionSortMultNumMergeSort() {
        Sort integerSort = new Sort();
        int[] integerArr = new int[]{4, 25, 30, 15, 16};
        assertArrayEquals(new int[]{4, 15, 16, 25, 30}, integerSort.mergeSort(integerArr));
    }

    @Test
    public void testInsertionSortNegMergeSort() {
        int[] integerNegArr = new int[]{4, -25, 30, 15, -15, 99, 3, 0};
        Sort integerNegSort = new Sort();
        assertArrayEquals(new int[]{-25, -15, 0, 3, 4, 15, 30, 99},
                integerNegSort.mergeSort(integerNegArr));
    }

    @Test
    public void testUniquesIntegerSortMergeSort() {
        int[] uniquesIntegerArr = new int[]{5, 12, 7, 5, 5, 7};
        Sort uniquesIntegerSort = new Sort();
        assertArrayEquals(new int[]{5, 5, 5, 7, 7, 12},uniquesIntegerSort.mergeSort(uniquesIntegerArr));
    }
    /*ch28*/
    @Test
    public void testInsertionSortEmptyQuickSort() {
        int[] emptyArr=new int[0];
        Sort emptySort=new Sort();
        assertArrayEquals(new int[]{},
                emptySort.quicksort(emptyArr, 0, (emptyArr.length - 1)));
    }

    @Test
    public void testInsertionSortMultNumQuickSort() {
        Sort integerSort = new Sort();
        int[] integerArr = new int[]{4, 25, 30, 15, 16};
        assertArrayEquals(new int[]{4, 15, 16, 25, 30},
                integerSort.quicksort(integerArr, 0, (integerArr.length - 1))
        );
    }

    @Test
    public void testInsertionSortNegQuickSort() {
        int[] integerNegArr = new int[]{4, -25, 30, 15, -15, 99, 3, 0};
        Sort integerNegSort = new Sort();
        assertArrayEquals(new int[]{-25, -15, 0, 3, 4, 15, 30, 99},
                integerNegSort.quicksort(integerNegArr, 0, (integerNegArr.length - 1))
        );
    }

    @Test
    public void testUniquesIntegerSortQuickSort() {
        int[] uniquesIntegerArr = new int[]{5, 12, 7, 5, 5, 7};
        Sort integerNegSort = new Sort();
        assertArrayEquals(new int[]{5, 5, 5, 7, 7, 12},
                integerNegSort.quicksort(uniquesIntegerArr, 0, (uniquesIntegerArr.length - 1))
        );
    }

}
