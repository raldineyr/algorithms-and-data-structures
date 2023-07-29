public class StackArrays {
    public static void main(String[] args){
        StackArrays stackArray = new StackArrays(5);
        stackArray.push(5);
        stackArray.push(4);
        stackArray.push(3);
        stackArray.push(2);
        stackArray.push(0);
        stackArray.print();
    }
    private int top;
    private int[] arr;

    public StackArrays(int capacity) {
        this.top = -1;
        this.arr = new int[capacity];
    }

    public void push(int data) {
        if (isFull()) {
            throw new RuntimeException("ERROR: STACK IS FULL.");
        }
        top++;
        arr[top] = data;
    }
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("ERROR: STACK IS EMPTY.");
        }
        int result = arr[top];
        top--;
        return result;
    }
    public void print(){
        if(isEmpty()){
            throw new RuntimeException("ERROR: STACK IS EMPTY.");
        }

        while(top >= 0){
            System.out.print(arr[top] + " ");
            top--;
        }
    }

    public boolean isEmpty(){
        return top < 0;
    }

    public boolean isFull() {
        return arr.length == size();
    }

    public int size() {
        return top + 1;
    }

}
