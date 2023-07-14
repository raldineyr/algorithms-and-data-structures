public class SinglyLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.head = new ListNode(9);
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(0);
        list.print();
        list.head = list.removeDuplicates();
        list.print();
        list.head = list.insertSorted(8);
        list.print();
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

    public ListNode middleNode(){
        if (head == null){
            return null;
        }
        ListNode slowNode = head;
        ListNode fastNode = head;
        while(slowNode != null && fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return slowNode;
    }

    public ListNode getNthNodeFromEnd(int n){
        if(head == null){
            return null;
        }
        if(n <= 0){
            throw new IllegalArgumentException( n + " is an invalid value.");
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while (count < n){
            if(refPtr == null){
                throw new IllegalArgumentException(n + " is greater than number of nodes in list.");
            }
            refPtr = refPtr.next;
            count++;
        }
        while(refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }
    public ListNode removeDuplicates(){
        // TODO I need to verify why this algorithm does not work.
        if(head == null){
            return null;
        }
        ListNode current = head;
        while (current != null && current.next != null){
            if (current.data == current.next.data){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }
    public ListNode insertSorted(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            return newNode;
        }
        ListNode current = head;
        ListNode temp = null;

        while (current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }
}
