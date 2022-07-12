package dsa.binarytree;

/*
* Node contains some data and
* may a left and right child
* node.
* */
public class Node {
    int data;
    Node left, right;

    /*
    * Creates a new node with given
    * data, it has no left and right
    * children.
    * */
    public Node(int data) {
        this.data = data;
    }
}
