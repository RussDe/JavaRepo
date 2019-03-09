package company.lesson6.sorting;

// 1,5,6,8,9, 2
public class BubbleSort implements Sort {

  @Override
  public void sort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          swap(array, j);
        }
      }
    }
  }
}
