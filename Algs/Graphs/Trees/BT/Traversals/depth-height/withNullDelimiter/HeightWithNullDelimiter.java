import java.util.LinkedList;
import java.util.Queue;

public class HeightWithNullDelimiter {
    public static void main(String[] args) {

        // Representation of the input tree:
        //     12
        //    /  \
        //   8   18
        //  / \
        // 5   11
        Node root = new Node(12);
        root.left = new Node(8);
        root.right = new Node(18);
        root.left.left = new Node(5);
        root.left.right = new Node(11);

        System.out.println(height(root));
    }

    // Function to find the height of the tree
    static int height(Node root) {
        if (root == null) return 0;

        // Initializing a variable to count
        // the depth of the tree
        int depth = 0;

        Queue<Node> q = new LinkedList<>();

        // Pushing the first level element
        // along with null
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curr = q.poll();

            // When null is encountered, update the depth
            if (curr == null) {
                depth++;

                // If queue still has elements left,
                // push null again to the queue
                if (!q.isEmpty()) {
                    q.add(null);
                }
            }
            else {

                // If null is not encountered,
                // keep moving
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
        return depth - 1;
    }

    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }
}
