public class Stack {
    private int[] stackArray;
    private int maxSize;
    private int index;

    public Stack(int n) {
        maxSize = n;
        stackArray = new int[maxSize];
        index = -1;
    }
    public static void main(String[] args){}

    public void push(int element) {
        stackArray[++index] = element;
    }

    public int pop() {
        return stackArray[index--];
    }

    public int peek() {
        return stackArray[index];
    }

    public boolean isEmpty() {
        return index == -1;
    }

    public boolean isFull() {
        return index == maxSize - 1;
    }
}