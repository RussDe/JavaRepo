package interview.solutions;

public class Mock {

    public static void main(String[] args) {
        //initial array
//        int[] array = {4, 2, 7, 8, 8, 2, 3, 1, 9, 0, 5};
//        System.out.println(Arrays.toString(array) + " -> Initial Array");

        //**************
//        //1. QuickSort
//        //System.out.println(Arrays.toString(QuickSort.quickSort(array)));

//        ****************
//        //2. Node
//        Node node = new Node();
//        for (int i = 0; i < array.length; i++) {
//            node.addToTail(array[i]);
//        }
//        System.out.println(node.toString() + " -> LinkedList Array");
//        //deleting a head
//        node.deleteHead();
//        System.out.println(node.toString());
//        //deleting a tail
//        node.deleteTail();
//        System.out.println(node.toString());
//        //adding a node
//        node.addNode(3, 4);
//        System.out.println(node.toString());
//        //deleting a node
//        node.deleteNode(2);
//        System.out.println(node.toString());

        //*****************
        //3. CharCount
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input your string: ");
//        String givenString = sc.next();
//        CharCount cc = new CharCount();
        //System.out.print(givenString+" -> ");
//        System.out.println(cc.compress(givenString));

        //*****************
        //4. Reverse string
        //System.out.println(ReverseString.reverse(givenString));
        //4.1. Reversing words in a string
        //System.out.println(ReverseString.reverseWords("I go to school"));

        //*****************
        //5.1. StringPermutations
        //StringPermutations.permutate("abc");

        //5.2. StringPermutations
//        String string = "abc";
//        Perm.stringPermutation(string);
//        System.out.println(string);

        //5. Substrings of a given String
//        String answer = (Substring.isRotation("forinterviewscoding", "codingforinterviews")) ? "Yes" : "No";
//        System.out.println(answer);
//        String answer1 = (Substring.isSubstring("forinterviewscoding", "interviews")) ? "Yes" : "No";
//        System.out.println(answer1);

        //*****************
        //6. Determine if one string is a permutation of another
//        String answer = (PermutationOfAnother.isPermutation("abcd", "bacf")) ? "Yes" : "No";
//        System.out.println(answer);

        //*****************
        //7. Write a method to replace all whitespaces in a string with #20.
        System.out.println(ReplaceWhitespaces.replaceWhitespaces("I go to school"));

        //System.out.println(Perm.permutation);
        //8. Reverse a string using recursion
        //System.out.println(ReverseStringRecursion.reverse("muha"));
    }
}
