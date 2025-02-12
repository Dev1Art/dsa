import java.util.ArrayList;
import java.util.Stack;

class PostorderTraverseIterative {
    // Function to do post-order traversal
    // using two stacks
    static ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        // Create two stacks
        Stack<Node> stk1 = new Stack<>();
        Stack<Node> stk2 = new Stack<>();

        // Push root to first stack
        stk1.push(root);
        Node curr;

        // Run while first stack is not empty
        while (!stk1.isEmpty()) {

            // Pop from stk1 and push it to stk2
            curr = stk1.pop();
            stk2.push(curr);

            // Push left and right children of
            // the popped node
            if (curr.left != null) {
                stk1.push(curr.left);
            }
            if (curr.right != null) {
                stk1.push(curr.right);
            }
        }

        // Collect all elements from second stack
        while (!stk2.isEmpty()) {
            curr = stk2.pop();
            result.add(curr.data);
        }

        return result;
    }

    static void printArray(ArrayList<Integer> arr) {
        for (int data : arr) {
            System.out.print(data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Representation of input binary tree:
        //           1
        //         /   \
        //        2     3
        //      /  \
        //     4    5
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> result = postOrder(root);

        printArray(result);
    }

    static class Node {
        int data;
        Node left, right;

        Node(int x) {
            data = x;
            left = right = null;
        }
    }
}

