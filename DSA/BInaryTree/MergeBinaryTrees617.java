package DSA.BInaryTree;     // SUBMITTED

import static DSA.BInaryTree.InvertTree226.BinaryTree.buildTree;
import static DSA.BInaryTree.InvertTree226.BinaryTree.idx;

public class MergeBinaryTrees617 {
    public static void main(String[] args) {
        int[] node1 = {1, 2, 4, -1, -1, -1, -1};
        int[] node2 = {1, 2, 4, -1, -1, -1, -1};
        Implementation.Node root1 = buildTree(node1);
        idx = -1;
        Implementation.Node root2 = buildTree(node2);

        mergeTrees(root1, root2);
    }

    private static Implementation.Node mergeTrees(Implementation.Node root1, Implementation.Node root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        if (root1 != null && root2 == null) {
            return root1;
        }
        if (root1 == null && root2 != null) {
            return root2;
        }
        Implementation.Node sum = new Implementation.Node(root1.data + root2.data);
        sum.left = mergeTrees(root1.left, root2.left);
        sum.right = mergeTrees(root1.right, root2.right);

        return sum;
    }
}
