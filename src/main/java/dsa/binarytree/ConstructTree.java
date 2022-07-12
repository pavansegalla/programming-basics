package dsa.binarytree;

import java.util.Scanner;

public class ConstructTree {

    private static Scanner scanner = new Scanner(System.in);

    /*
     * Using recursion to
     * construct a tree
     * */
    public static Node constructTree() {
        Node root = null;

        System.out.println("Enter value: ");
        int value = scanner.nextInt();
        if (value == -1)
            return null;
        root = new Node(value);

        System.out.println("Enter left value for  " + value);
        root.left = constructTree();

        System.out.println("Enter right value for " + value);
        root.right = constructTree();

        return root;
    }

    public static void main(String[] args) {
        Node root = constructTree();
        System.out.println("Root is " + root);
    }
}
