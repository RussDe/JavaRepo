package company.lesson6.sorting;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {
  @Test
  public void shouldSortArray() {
    int arr[] = {-3, 2, -11, 0, 5};
    int expectedArr[] = {-11, -3, 0, 2, 5};
    Sort bubbleSort = new BubbleSort();
    bubbleSort.sort(arr);
    //Assertions.assertThat(arr).isSorted();
   Assert.assertArrayEquals(arr,expectedArr);
  }
}