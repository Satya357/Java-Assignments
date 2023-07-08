class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class LowestCommonAncestor {
    Node root;

    Node findLCA(Node root, int x, int y) {
        if (root == null)
            return null;

        if (root.key > x && root.key > y)
            return findLCA(root.left, x, y);
        else if (root.key < x && root.key < y)
            return findLCA(root.right, x, y);
        else
            return root;
    }

    public static void main(String[] args) {
        LowestCommonAncestor bst = new LowestCommonAncestor();

        bst.root = new Node(15);
        bst.root.left = new Node(10);
        bst.root.right = new Node(20);
        bst.root.left.left = new Node(8);
        bst.root.left.right = new Node(12);
        bst.root.right.left = new Node(16);
        bst.root.right.right = new Node(25);

        int x = 8;
        int y = 12;

        Node lca = bst.findLCA(bst.root, x, y);

        if (lca != null)
            System.out.println("Lowest Common Ancestor of " + x + " and " + y + " is: " + lca.key);
        else
            System.out.println("Either " + x + " or " + y + " is not present in the tree.");
    }
}
