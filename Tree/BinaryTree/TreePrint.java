package Tree.BinaryTree;

public class TreePrint {
    public static void main(String[] args) {
        BinaryTree myTree = new BinaryTree();
//        myTree.insertVal(23);
//        myTree.insertVal(45);
//        myTree.insertVal(50);
//        myTree.insertVal(1);
//        myTree.insertVal(7);
//        myTree.insertVal(10);

//        BinaryTree.preOrder(myTree.root);
        myTree.insert(23);
        myTree.insert(34);
        myTree.insert(45);
        myTree.insert(67);
        System.out.println("pre order is"+ myTree.root.value);
        BinaryTree.levelOrderTraversal(myTree.root);
    }
}
