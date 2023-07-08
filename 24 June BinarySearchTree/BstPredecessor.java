class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class InorderPredecessor {
    Node root;

    Node inorderPredecessor(Node root, int key) {
        Node predecessor = null;
        while (root != null) {
            if (key <= root.key) {
                root = root.left;
            } else {
                predecessor = root;
                root = root.right;
            }
        }
        return predecessor;
    }

    public static void main(String[] args) {
        InorderPredecessor bst = new InorderPredecessor();

        bst.root = new Node(15);
        bst.root.left = new Node(10);
        bst.root.right = new Node(20);
        bst.root.left.left = new Node(8);
        bst.root.left.right = new Node(12);
        bst.root.right.left = new Node(16);
        bst.root.right.right = new Node(25);

        int key = 10;
        Node predecessor = bst.inorderPredecessor(bst.root, key);

        if (predecessor != null)
            System.out.println("The inorder predecessor of " + key + " is: " + predecessor.key);
        else
            System.out.println("No inorder predecessor found for " + key);
    }
}
