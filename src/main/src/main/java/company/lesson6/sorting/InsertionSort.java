package company.lesson6.sorting;

public class InsertionSort implements Sort {
  @Override
  public void sort(int[] array) {
    int min = array[0];
    for (int i = 1; i < array.length; i++) {
      for (int j = i; j > 0; j--) {
        if (array[j] < array[j - 1]) {
          swap(array, j - 1);
        }
      }
    }
  }
}
