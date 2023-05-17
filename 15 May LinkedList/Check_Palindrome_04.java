class Check_Palindrome_04{
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

    public void isPalindrome(Node temp){
        String str = "";
        String reverseStr = "";

        while(temp != null){
            str += temp.data;
            temp = temp.next;
        }

        for(int i=str.length()-1; i>=0; i--){
            reverseStr = reverseStr + str.charAt(i);
        }

        System.out.println("Original String : " + str);
        System.out.println("Reverse String : " + reverseStr);

        if(str.equals(reverseStr)){
            System.out.println("Yes it is palindrome.");
        }else{
            System.out.println("No it is not a palindrome.");
        }

    }

    public void printLList() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Check_Palindrome_04 llist = new Check_Palindrome_04();

        //Test case
        llist.insertAtEnd(1);
        llist.insertAtEnd(2);
        llist.insertAtEnd(2);
        llist.insertAtEnd(1);
        
        llist.isPalindrome(llist.head);

    }
}