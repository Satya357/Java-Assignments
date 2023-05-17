class Duplicate_Deletion_LList_03{
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

    public void removeDuplicates() {
        Node previousNode = head;
        Node currentNode = head.next;
    
        while (currentNode != null) {
            if (previousNode.data == currentNode.data) {
                currentNode = currentNode.next;
            } else {
                previousNode.next = currentNode;
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }
    
        previousNode.next = null;
    
        System.out.println();
        printLList();
    }
    

    public void printLList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Duplicate_Deletion_LList_03 llist = new Duplicate_Deletion_LList_03();
        llist.insertAtEnd(10);
        llist.insertAtEnd(20);
        llist.insertAtEnd(20);
        llist.insertAtEnd(30);
        llist.insertAtEnd(30);
        llist.insertAtEnd(30);
        llist.insertAtEnd(30);
        llist.insertAtEnd(30);
        llist.insertAtEnd(30);

        System.out.println("Linked List before removing duplicate nodes : ");
        llist.printLList();

        System.out.println("Linked List after removing duplicate nodes : ");
        llist.removeDuplicates();

    }
}