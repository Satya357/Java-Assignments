class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class KthLargestBST {
    Node root;
    int count = 0;
    int largest = Integer.MIN_VALUE;

    KthLargestBST() {
        root = null;
    }

    int kthLargest(Node node, int k) {
        if (node == null)
            return Integer.MIN_VALUE;

        kthLargest(node.right, k);
        count++;

        if (count == k)
            largest = node.key;

        kthLargest(node.left, k);
        return largest;
    }

    public static void main(String[] args) {
        KthLargestBST bst = new KthLargestBST();

        bst.root = new Node(15);
        bst.root.left = new Node(10);
        bst.root.right = new Node(20);
        bst.root.left.left = new Node(8);
        bst.root.left.right = new Node(12);
        bst.root.right.left = new Node(17);
        bst.root.right.right = new Node(25);
        bst.root.right.left.right = new Node(18);
        bst.root.right.left.right.right = new Node(19);

        int k = 1;
        int kthLargest = bst.kthLargest(bst.root, k);
        System.out.println("The " + k + "th largest node in the BST is: " + kthLargest);
    }
}
