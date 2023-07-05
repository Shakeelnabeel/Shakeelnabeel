package DSA.BInaryTree;

import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree897 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static TreeNode build() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(9);
        return root;
    }

    public static void main(String[] args) {
        temp(build());
    }

    static List<TreeNode> result = new ArrayList<>();
    private static TreeNode temp(TreeNode root) {
        if (root == null) {
            return null;
        }
        temp(root.left);
        temp(root.right);
        root.left = null;
        return result.get(0);
    }
}
