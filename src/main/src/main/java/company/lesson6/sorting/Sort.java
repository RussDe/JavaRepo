package company.lesson6.sorting;

public interface Sort {
  void sort(int[] array);

  default void swap(int[] array, int j) {
    int temp = array[j + 1];
    array[j + 1] = array[j];
    array[j] = temp;
  }
}
