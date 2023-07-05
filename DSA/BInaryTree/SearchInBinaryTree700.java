package DSA.BInaryTree;

public class SearchInBinaryTree700 {
   static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

  static   TreeNode build() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(2), new TreeNode(5));
        root.right = new TreeNode(6, new TreeNode(7), new TreeNode(9));
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = build();
        search(root, 2);

    }

    private static TreeNode search(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        } else if (root.val > val) return search(root.left, val);
        else return search(root.right, val);
    }
}
