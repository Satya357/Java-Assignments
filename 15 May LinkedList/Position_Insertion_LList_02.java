class Position_Insertion_LList_02 {
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

    public void insertAtPosition(int position , int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(position == 0){
            newNode.next = head;
            head = newNode;
            return;
        }

        for(int i=1; i<position - 1 && temp != null ; i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        return;
    }

    public void printLList() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Position_Insertion_LList_02 llist = new Position_Insertion_LList_02();
        llist.insertAtEnd(10);
        llist.insertAtEnd(20);
        llist.insertAtEnd(30);
        llist.insertAtEnd(40);
        llist.insertAtEnd(50);
        llist.insertAtPosition(3,5); //here pass the position by position not by index.
        llist.printLList();

    }
}