package Tree.BinaryTree;

public class TreePrint {
    public static void main(String[] args) {
        BinaryTree myTree = new BinaryTree();
        myTree.insertVal(23);
        myTree.insertVal(45);
        myTree.insertVal(50);
        myTree.insertVal(1);
        myTree.insertVal(7);
        myTree.insertVal(10);

        BinaryTree.levelOrderTraversal(myTree.root);
        System.out.println("pre order is");
        BinaryTree.preOrder(myTree.root);
    }
}
