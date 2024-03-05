package Tree.BinaryTree;

import Tree.Leaf;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Leaf root;

//    Insert Using while loop
//    public void insertVal(int val){
//        Leaf newLeaf= new Leaf(val);
//        if(root==null){
//            root=newLeaf;
//        }else{
//            Leaf currentNode = root;
////            System.out.println(currentNode.value+"hey I am node");
//            while (currentNode!=null){
//                if(newLeaf.value<currentNode.value&&currentNode.left==null){
//                    currentNode.left=newLeaf;
//                    break;
//                }
//                if(newLeaf.value>currentNode.value&&currentNode.right==null){
//                    currentNode.right=newLeaf;
//                    break;
//                }
//                if(newLeaf.value<currentNode.value){
//                    currentNode= currentNode.left;
//                }else{
//                    currentNode= currentNode.right;
//                }
//            }
//            System.out.println("my node is "+currentNode);
//        }
//    }


    private Leaf insert(Leaf currentNode, int value){
        if (currentNode==null){
            Leaf newLeaf = new Leaf(value);
//            currentNode = newLeaf;
            System.out.println("node inserted");
            return newLeaf;
        }
        if(value<=currentNode.value) {
           currentNode.left= insert(currentNode.left, value);
            return currentNode;
        }else{
            currentNode.right=insert(currentNode.right,value);
            return currentNode;
        }
    }

     void insert(int val){
        if(root==null){
            root= new Leaf(val);
        }else {
            insert(root, val);
        }
    }

    public static void preOrder(Leaf root){
        if(root==null) return;
        preOrder(root.left);
        preOrder(root.right);
        System.out.println("my values are"+root.value);
    }

    public static void inOrder(Leaf root){
        if(root==null) return;
        preOrder(root.left);
        preOrder(root.right);
        System.out.println("my values are"+root.value);
    }

    public  static  void levelOrderTraversal(Leaf root){
        Queue<Leaf> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Leaf currentNode = queue.remove();
            System.out.println("my val is "+currentNode.value);
            if(currentNode.left!=null){
                queue.add(currentNode.left);
            }
            if(currentNode.right!=null){
                queue.add(currentNode.right);
            }
        }
    }
}
