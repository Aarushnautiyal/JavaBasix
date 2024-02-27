public class Tree {
    Leaf root;

    Tree(int val) {
        Leaf leaf = new Leaf(val);
        root = leaf;
    }

    public void printTree(Leaf leaf) {
        if (leaf == null)
            return;

        // First recur on left child
        printTree(leaf.left);

        // Then print the data of leaf
        System.out.print(leaf.value + "this is the value");

        // Now recur on right child
        printTree(leaf.right);
        // return this.root.value+"Value is this";
    }

    public void insert(int val){
        Leaf leaf = new Leaf(val);
    }
}