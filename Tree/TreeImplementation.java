public class TreeImplementation {
    public static void main(String[] args) {
        Tree myTree = new Tree(23);
        // System.out.println(
        //     "my tree is"+ myTree
        // );
        // System.out.println(myTree.printTree());
        myTree.printTree(myTree.root);
    }
    
}
