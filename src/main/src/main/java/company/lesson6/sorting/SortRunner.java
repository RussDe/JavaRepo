package company.lesson6.sorting;

import java.util.Arrays;

public class SortRunner {
  public static void main(String[] args) {
//    Sort bubbleSort = new BubbleSort();
    Sort insertionSort = new InsertionSort();
    int[] array = {1, 5, 3, 4, 9, 2, -1, 0};
    System.out.println("Before");
    printArray(array);
    System.out.println("After");
//    bubbleSort.sort(array);
    insertionSort.sort(array);
    printArray(array);
  }

  private static void printArray(int[] array) {
    //Arrays.stream(array).forEach(x-> System.out.print(x+" "));
    System.out.println(Arrays.toString(array));

  }
}
