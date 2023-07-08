class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    void search(int key) {
        Node current = root;
        Node parent = null;
        String side = "";

        while (current != null) {
            if (key == current.key) {
                System.out.println(
                        "The given key " + key + " is the " + side + " node of the node with key " + parent.key);
                return;
            } else if (key < current.key) {
                parent = current;
                current = current.left;
                side = "left";
            } else {
                parent = current;
                current = current.right;
                side = "right";
            }
        }

    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(15);
        bst.insert(10);
        bst.insert(20);
        bst.insert(8);
        bst.insert(12);
        bst.insert(16);
        bst.insert(25);

        int searchElement = 10;
        bst.search(searchElement);
    }
}
