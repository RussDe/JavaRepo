package interview.solutions.sort;

//all sorting algorithms
public class Sort {
    public static void main(String[] args) {

        //creating simple array
        int[] array = {13, 3, 9, 6, 12, 7, 2, 0, 18, 4, 6};
        //int[] array = {1,2,3,4,5};
        printArray(array);
        //System.out.println(Arrays.toString(array));


        // 1.Selection
        //printArray(Selection.sortSelection(array));
       // printArray(Selection_2.sortIt(array));

        //2. Bubble
        printArray(Buble.sortBubble(array));

        //3. Insertion
        //printArray(Insertion.sortInsertion(array));

        //4. Merge
        //printArray(Merge.sortMerge(array));

        //5. Quick sort
        //printArray(Quick.sortQuick(array));
    }

    //print out array's items
    static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println("\n");
    }

    static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
