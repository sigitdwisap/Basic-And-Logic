package com.basicandlogic.containsvalue;

import java.util.Objects;

class Node {
    final int value;
    final Node left;
    final Node right;

    Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearchTree {

    private static int t = 0;

    private static boolean contains(Node root, int value) {
        System.out.println(++t);
        boolean result = false;
        if (root != null && root.value == value) {
            result = true;
        } else if (Objects.requireNonNull(root).left != null && root.value > value) {
            return contains(root.left, value);
        } else if (root.right != null) {
            return contains(root.right, value);
        }
        return result;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);

        System.out.println(contains(n2, 3));
    }
}