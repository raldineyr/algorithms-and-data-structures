
public class HashTable {
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
}
