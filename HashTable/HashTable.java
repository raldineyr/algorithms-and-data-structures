public class HashTable {
    public static void main(String[] args){
        HashTable table = new HashTable(10);
        table.put(105,"RALDINEY");
        table.put(21,"MARIO");
        System.out.println(table.size());
    }
    private HashNode[] buckets;
    private int numOfBuckets;
    private int size;

    public HashTable(){
        this(10);
    }

    public HashTable (int capacity){
        this.numOfBuckets = capacity;
        buckets = new HashNode[capacity];
    }
    private class HashNode{
        private Integer key;
        private String value;
        private HashNode next;

        public HashNode(Integer key, String value){
            this.key = key;
            this.value = value;
        }
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public void put(Integer key, String value){
        if(key == null || value == null ){
            throw new IllegalArgumentException("A chave ou o valor não podem ser nulos!");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head != null){
            if(head.key.equals(key)){
                head.value = value;
                return ;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucketIndex];
        HashNode node = new HashNode(key, value);
        node.next = head;
        buckets[bucketIndex] = node;
    }

    public int getBucketIndex(Integer key){
        return key % numOfBuckets;
    }
}
