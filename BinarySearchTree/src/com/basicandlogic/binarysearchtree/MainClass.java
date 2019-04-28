package com.basicandlogic.binarysearchtree;

public class MainClass {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("The key of root : " + (tree.searchByRootAndKey(tree.root, 50)).key);
        System.out.println("The key of left root : " + ((tree.searchByRootAndKey(tree.root, 50)).left).key);
        System.out.println("The key of right root : " + ((tree.searchByRootAndKey(tree.root, 50)).right).key);

        // print inorder traversal of the BST
        tree.inorder();
    }
}

