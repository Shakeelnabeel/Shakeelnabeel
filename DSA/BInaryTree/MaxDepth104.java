package DSA.BInaryTree;     // SUBMITTED

public class MaxDepth104 {
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1,-1, -1};
        Implementation.Node node = Implementation.BinaryTree.buildTree(nodes);
        System.out.println(maxDepth(node));
    }

    private static int maxDepth(Implementation.Node root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;

    }
}
