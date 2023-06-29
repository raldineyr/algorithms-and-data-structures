public class SinglyLinkedList {
    
    private ListNode head;
    
    private static class ListNode {

        private int data;
        private ListNode next;

        public ListNode(int data) {
            
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFinal(10);
        list.insertFirst(5);
        list.print();
        System.out.println(list.length());
    }
    public void print() {
        ListNode current = head;
        while (current != null) {
            System.out.print("|"+ current.data);
            current = current.next;
        }
        System.out.println("|null");
    }
    public int length(){
        if(head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
         return count;
    }
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;

    }

    public void insertFinal(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
}
