package DSA.BInaryTree;

import static DSA.BInaryTree.CountOfNodes.BinaryTree.buildTree;

public class CountOfNodes {
    static class BinaryTree {
        static int idx = -1;

        public static Implementation.Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Implementation.Node newNode = new Implementation.Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        for (int a : nodes) {
            System.out.print(a + " ");
        }
        int i = countNodes(buildTree(nodes));
        System.out.println(i);

    }

    static int countNodes(Implementation.Node root) {
        if (root == null) {
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);

        return left + right + 1;
    }
}
