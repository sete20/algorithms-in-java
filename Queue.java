/**
 * A class that implements a circular queue using an array.
 */
public class Queue {
    private int[] QueueArray; // Array to store queue elements
    private int maxSize; // Maximum capacity of the queue
    private int itemsCount; // Current number of elements in the queue
    private int front; // Index of the front element
    private int rear; // Index of the rear element

    /**
     * Constructor to initialize the queue with a specific size.
     * 
     * @param size The size of the queue.
     */
    public Queue(int size) {
        maxSize = size;
        QueueArray = new int[maxSize];
        itemsCount = 0;
        front = 0;
        rear = -1;
    }

    /**
     * Inserts an element at the rear of the queue.
     * 
     * @param element The element to be inserted.
     */
    public void insert(int element) {
        if (isFull()) {
            System.out.println("No space available in this queue");
        } else {
            rear = (rear + 1) % maxSize; // Wrap around using modulo
            QueueArray[rear] = element;
            itemsCount++;
        }
    }

    /**
     * Removes and returns the front element from the queue.
     * 
     * @return The front element or -1 if the queue is empty.
     */
    public int pop() {
        if (isEmpty()) {
            System.out.println("No elements in this queue");
            return -1;
        } else {
            int temp = QueueArray[front];
            front = (front + 1) % maxSize; // Wrap around using modulo
            itemsCount--;
            return temp;
        }
    }

    /**
     * Returns the current size of the queue.
     * 
     * @return The number of elements in the queue.
     */
    public int size() {
        return itemsCount;
    }

    /**
     * Returns the front element of the queue without removing it.
     * 
     * @return The front element or -1 if the queue is empty.
     */
    public int peek() {
        if (isEmpty()) {
            System.out.println("No elements in this queue");
            return -1;
        }
        return QueueArray[front];
    }

    /**
     * Checks if the queue is empty.
     * 
     * @return True if the queue is empty, otherwise false.
     */
    public boolean isEmpty() {
        return itemsCount == 0;
    }

    /**
     * Checks if the queue is full.
     * 
     * @return True if the queue is full, otherwise false.
     */
    public boolean isFull() {
        return itemsCount == maxSize;
    }

    /**
     * Returns the array representing the queue elements (for debugging purposes).
     * 
     * @return The array of queue elements.
     */
    public int[] queueItems() {
        return QueueArray;
    }
}
