package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    Leaf root;

    Tree(int val){
        root = new Leaf(val);
    }

    //Inorder Traversal
    public static void printTreeInorder(Leaf leaf) {
        if (leaf == null)
            return;

        // First recur on left child
        printTreeInorder(leaf.left);

        // Then print the data of leaf
        System.out.print(leaf.value + " ");

        // Now recur on right child
        printTreeInorder(leaf.right);
        // return this.root.value+"Value is this";
    }

   public static void levelOrderTraversal(Leaf root){
    Queue<Leaf> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
        Leaf currentLeaf = queue.remove();
        System.out.print(currentLeaf.value+" ");
        if(currentLeaf.left!=null){
            queue.add(currentLeaf.left);
        }
        if(currentLeaf.right!=null){
            queue.add(currentLeaf.right);
        }
    }
   }

   public void insertLeaf(int val){
        Queue<Leaf> queue = new LinkedList<>();
        queue.add(this.root);
        Leaf newLeaf = new Leaf(val);
        while(!queue.isEmpty()){
            Leaf currentLeaf = queue.remove();
            if(currentLeaf.left==null){
                currentLeaf.left=newLeaf;
                System.out.print("Value Inserted at left->");
            }else if(currentLeaf.right==null){
                System.out.print("Value Inserted at right->");
                currentLeaf.right = newLeaf;
            }else {
                queue.add(currentLeaf.left);
                queue.add(currentLeaf.right);
            }
        }

   }

}