package Tree;
public class TreeImplementation {
    public static void main(String[] args) {
//        Leaf n1 = new Leaf(1);
//        Leaf n2 = new Leaf(2);
//        Leaf n3 = new Leaf(3);
//        Leaf n4 = new Leaf(4);
//        Leaf n5 = new Leaf(5);
//        Leaf n6 = new Leaf(6);
//        Leaf n7 = new Leaf(7);
//        n1.left = n2;
//        n1.right =n3;
//        n2.left = n4;
//        n2.right = n5;
//        n3.left = n6;

        Tree myTree = new Tree(24);
    myTree.insertLeaf(34);
    myTree.insertLeaf(56);
    myTree.insertLeaf(67);
    myTree.insertLeaf(89);
        System.out.println("");
        Tree.levelOrderTraversal(myTree.root);
    }
    
}
