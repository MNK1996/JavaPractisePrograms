package DSA.Trees;

public class Tress {
    public static void main(String[] args) {
        var newTree = new BinaryTree();
        newTree.insert(5);
        newTree.insert(3);
        newTree.insert(1);
        newTree.insert(9);
        newTree.insert(7);

        System.out.println(newTree.getRoot().right.right.value);

        System.out.println(newTree.getRoot().value);


    }
}