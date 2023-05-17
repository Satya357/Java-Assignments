class Linked_List_Sum_05{
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

    public int listData(Node temp){
        String data = "";

        while(temp != null){
            data += temp.data;
            temp = temp.next;
        }

        int dataValue = Integer.parseInt(data);

        return dataValue;
    }

    public static String listSum(int l1 , int l2){
        int sum = l1 + l2;
        String sumStr = String.valueOf(sum);
        return sumStr;
    }

    public static void main(String[] args) {
        Linked_List_Sum_05 llist1 = new Linked_List_Sum_05();
        llist1.insertAtEnd(1);
        llist1.insertAtEnd(2);
        llist1.insertAtEnd(3);
        llist1.insertAtEnd(4);
        int list1 = llist1.listData(llist1.head);

        Linked_List_Sum_05 llist2 = new Linked_List_Sum_05();
        llist2.insertAtEnd(5);
        llist2.insertAtEnd(6);
        llist2.insertAtEnd(7);
        llist2.insertAtEnd(8);
        int list2 = llist2.listData(llist2.head);
        
        String resultantSum = listSum( list1 , list2);

        Linked_List_Sum_05 llist3 = new Linked_List_Sum_05();

        for(int i=0; i<resultantSum.length(); i++){
            llist3.insertAtEnd(Character.getNumericValue(resultantSum.charAt(i)));
        }

        int list3 = llist3.listData(llist3.head);
        System.out.println("First list : " + list1);
        System.out.println("Second list : " + list2);
        System.out.println("Resultant list : " + list3);
        
    }
}