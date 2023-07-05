package DSA.BInaryTree;     //  SUBMITTED

import DSA.ListNode;
import lombok.val;

import java.util.LinkedList;
import java.util.Queue;

import static DSA.BInaryTree.CountOfNodes.BinaryTree.buildTree;
import static DSA.BInaryTree.CountOfNodes.BinaryTree.idx;

public class IsSymmetric101 {
    static class Node {
        int data;
        Node left;

        Node right;

        Node() {

        }

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {2, 3, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 4, -1, -1};
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(isSymmetric(root));

    }

    private static boolean isSymmetric(Node root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    public static boolean isSymmetric(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }if (node1 == null || node2 == null) {
            return false;
        }
        return node1.data == node2.data && isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left);
    }
}
