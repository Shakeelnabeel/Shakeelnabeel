package DSA.BInaryTree;     //  CORRECT CODE

import static DSA.BInaryTree.CountOfNodes.BinaryTree.buildTree;

public class SumOfNodes {
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int i = sumOfNodes(buildTree(nodes));
        System.out.println(i);

    }

    private static int sumOfNodes(Implementation.Node root) {
        if (root == null) {
            return 0;
        }
        int left = sumOfNodes(root.left);
        int right = sumOfNodes(root.right);

        return left + right + root.data;
    }

}
