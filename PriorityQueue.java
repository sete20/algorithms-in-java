public class PriorityQueue {
    private int[] QueueArray; // Array to store queue elements
    private int maxSize; // Maximum capacity of the queue
    private int itemsCount; // Current number of elements in the queue

    /**
     * Constructor to initialize the queue with a specific size.
     * 
     * @param size The size of the queue.
     */
    public PriorityQueue(int size) {
        this.maxSize = size;
        QueueArray = new int[maxSize];
        itemsCount = 0;
    }

    /**
     * Inserts an element at the rear of the queue.
     * 
     * @param element The element to be inserted.
     */
    public void insert(int element) {
        if (isFull()) {
            System.out.println("No space available in this queue");
            return;
        }
        if (itemsCount == 0) {
            QueueArray[itemsCount++] = element;
        } else {
            int k;
            for (k = itemsCount - 1; k >= 0; k--) {
                if (element > QueueArray[k]) {
                    QueueArray[k + 1] = QueueArray[k];
                } else {
                    break;
                }
            }
            QueueArray[k + 1] = element;
            itemsCount++;
        }
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // or throw an exception
        }
        return QueueArray[--itemsCount];
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
