package interview.cracking_the_code_interview.data_structure;

/**
 * For the purposes of this challenge, we define a binary search tree to be a binary tree with the following ordering properties:
 * <p>
 * The  value of every node in a node's left subtree is less than the data value of that node.
 * The  value of every node in a node's right subtree is greater than the data value of that node.
 * Given the root node of a binary tree, can you determine if it's also a binary search tree?
 * <p>
 * Complete the function in your editor below, which has  parameter: a pointer to the root of a binary tree. It must return a boolean denoting whether or not the binary tree is a binary search tree. You may have to write one or more helper functions to complete this challenge.
 * <p>
 * Note: A binary tree is not a binary search if there are duplicate values.
 * <p>
 * Input Format
 * <p>
 * You are not responsible for reading any input from stdin. Hidden code stubs will assemble a binary tree and pass its root node to your function as an argument.
 * <p>
 * Constraints
 * <p>
 * <p>
 * Output Format
 * <p>
 * You are not responsible for printing any Output to stdout. Your function must return true if the tree is a binary search tree; otherwise, it must return false. Hidden code stubs will print this result as a Yes or No answer on a new line.
 * <p>
 * Sample Input
 * <p>
 * tree
 * <p>
 * Sample Output
 * <p>
 * No
 * Explanation
 * <p>
 * The tree in the diagram does not satisfy the ordering property for a Binary Search Tree, so we print No.
 */
public class IsThisaBinarySearchTree {

    private class Node {
        Node left, right;
        int data;
    }

/*    public static boolean checkBST(Node root) {
        if (root.left != null && root.left.data >= root.data) {
            return false;
        } else {
            if (root.left == null) {
                if (root.right != null && root.right.data <= root.data) {
                    return false;
                } else {
                    if (root.right == null) {
                        return true;
                    }
                }
                checkBST(root.right);
            } else {
                checkBST(root.left);
            }
        }
        return true;
    }*/

    static int MIN = Integer.MIN_VALUE;
    static int MAX = Integer.MAX_VALUE;

    public static boolean checkBST(Node root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.data < min || root.data > max) {
            return false;
        } else {
            return (checkBST(root.left, min, root.data - 1) && checkBST(root.right, root.data + 1, max));
        }

    }

    public static boolean checkBST(Node root) {
        return checkBST(root, MIN, MAX);
    }
}