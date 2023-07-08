import java.util.HashSet;
import java.util.Set;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BSTPairSum {
    Node root;

    boolean pairSumExists(Node root, int sum) {
        Set<Integer> set = new HashSet<>();
        return pairSumUtil(root, sum, set);
    }

    boolean pairSumUtil(Node node, int sum, Set<Integer> set) {
        if (node == null)
            return false;

        if (pairSumUtil(node.left, sum, set))
            return true;

        if (set.contains(sum - node.key))
            return true;
        else
            set.add(node.key);

        return pairSumUtil(node.right, sum, set);
    }

    public static void main(String[] args) {
        BSTPairSum bst = new BSTPairSum();

        bst.root = new Node(15);
        bst.root.left = new Node(10);
        bst.root.right = new Node(20);
        bst.root.left.left = new Node(8);
        bst.root.left.right = new Node(12);
        bst.root.right.left = new Node(20);
        bst.root.right.right = new Node(30);
        bst.root.left.left.left = new Node(6);
        bst.root.left.left.right = new Node(9);

        int sum = 14;
        boolean pairExists = bst.pairSumExists(bst.root, sum);
        if (pairExists)
            System.out.println("Pair found with the given sum: " + sum);
        else
            System.out.println("No pair found with the given sum: " + sum);
    }
}
