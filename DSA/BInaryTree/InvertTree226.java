package DSA.BInaryTree;     //SUBMITTED

public class InvertTree226 {
    static class Node {
        int data;
        Node left;

        Implementation.Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Implementation.Node buildTree(int nodes[]) {
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
        Implementation.Node node = Implementation.BinaryTree.buildTree(nodes);
        invert(node);
    }

    private static Implementation.Node invert(Implementation.Node root) {
        if (root == null) {
            return root;
        }
        invert(root.left);
        invert(root.right);
        Implementation.Node temp = root.left;
        root.left = root.right;
        root.right = temp;
return root;
    }
}
