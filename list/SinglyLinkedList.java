public class SinglyLinkedList {
    public static void main(String[] args) {
        
        SinglyLinkedList list = new SinglyLinkedList();
        list.head = new ListNode(10);
        list.insertFinal(12);
        list.insertFirst(5);
        list.print();
        SinglyLinkedList reversedList = new SinglyLinkedList();
        reversedList.head = list.reverse(list.head);
        reversedList.print();
    }

    private ListNode head;
    private static class ListNode {

        private int data;
        private ListNode next;

        public ListNode(int data) {

            this.data = data;
            this.next = null;
        }
    }

    public void print() {
        ListNode current = head;
        while (current != null) {
            System.out.print("|"+ current.data);
            current = current.next;
        }
        System.out.println("|null");
    }

    public int length() {
        if(head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;

    }

    public void insertFinal(int value) {
        ListNode newNode = new ListNode(value);
        if(head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return head;
    }

    public ListNode deleteLast() {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null;
        return current;
    }

    public void delete(int position){
        if(head.data == 1){
            head = head.next;
        } else{
            ListNode previous = head;
            int count = 1;
            while(count < position -1){
                count++;
                previous = previous.next;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    public boolean hasNode(ListNode head, int target){
        if(head == null){
            return false;
        }
        ListNode current = head;
        while(current.next != null){
            if(current.data == target){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public ListNode reverse(ListNode head){
        if(head == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
