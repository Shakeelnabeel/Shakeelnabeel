package DSA.BInaryTree;

import static DSA.BInaryTree.CountOfNodes.BinaryTree.buildTree;

public class DiameterOfTree {
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        TreeInfo treeInfo = diameterTree(buildTree(nodes));
        System.out.println(treeInfo.diam);
        System.out.println(treeInfo.ht);
    }

    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    private static TreeInfo diameterTree(Implementation.Node root ) {
        if (root == null) {
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameterTree(root.left);
        TreeInfo right = diameterTree(root.right);
        int largerHt = Math.max(left.ht, right.ht) + 1;
        int largerDiam = Math.max(Math.max(left.diam, right.diam), left.ht + right.ht + 1);

        return new TreeInfo(largerHt, largerDiam);
    }
}
