package DSA.BInaryTree;

public class RangeSum938 {
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
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(2), new TreeNode(5));
        root.right = new TreeNode(6, new TreeNode(7), new TreeNode(9));
        return root;
    }

    public static void main(String[] args) {
        TreeNode build = build();
        int low = 6;
        int high = 10;
        range(build, low, high);
    }

    private static int range(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val < low) {
            return  range(root.right, low, high);
        }
        if (root.val > high) {
            return  range((root.left), low, high);
        }
        return root.val + range(root.left, low, high) + range(root.right, low, high);
    }

}
