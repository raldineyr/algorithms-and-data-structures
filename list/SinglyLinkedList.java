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
        SinglyLinkedList singlyL = new SinglyLinkedList();
        singlyL.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        singlyL.head.next = second;
        second.next = third;
        third.next = fourth;

        singlyL.printList();
        System.out.println("Hello world!");
    }
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print("|"+current.data);
            current = current.next;
        }
        System.out.println("|null");
    }
}
