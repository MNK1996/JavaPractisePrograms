package DSA.Trees;


import java.util.HashMap;

public class BinaryTree {
    Node root;

    class Node {
        Node left;
        Node right;
        int value;

        Node(int value) {
            this.value = value;
        }

    }
    HashMap<String,Integer> hp= new HashMap<>();


    public Node getRoot() {
        return root;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < root.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else if (newNode.value > root.value) {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {

        if (root == null) return false;
        Node temp = root;

        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else if (temp.value == value) {
                return true;
            }
        }
        return false;
    }

}