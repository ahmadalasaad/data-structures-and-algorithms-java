/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

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


}
