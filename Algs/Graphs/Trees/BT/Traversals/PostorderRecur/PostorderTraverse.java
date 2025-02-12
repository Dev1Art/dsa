public class PostorderTraverse {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        // Function call
        System.out.println(
                "Inorder traversal of binary tree is: ");
        Traversal.traverse(root);
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int v) {
            data = v;
            left = right = null;
        }
    }

    static class Traversal {
        public static void traverse(Node node) {
            if (node == null)
                return;

            // First recur on left subtree
            traverse(node.left);

            // Then recur on right subtree
            traverse(node.right);

            // Now deal with the node
            System.out.print(node.data + " ");
        }
    }
}
