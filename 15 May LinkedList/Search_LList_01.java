class Search_LList_01 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insertAtEnd(int d) {
        Node newNode = new Node(d);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }

    public boolean searchInLList(int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public void printLList() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Search_LList_01 llist = new Search_LList_01();
        llist.insertAtEnd(14);
        llist.insertAtEnd(21);
        llist.insertAtEnd(11);
        llist.insertAtEnd(30);
        llist.insertAtEnd(10);
        int target = 14;
        // int target = 13;
        boolean result = llist.searchInLList(target);

        if (result) {
            System.out.println(target + " is present in the linked list.");
        } else {
            System.out.println(target + " is not present in the linked list.");
        }
    }
}