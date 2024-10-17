/**
 * The DoublyLinkedListInitializer class provides methods to initialize,
 * manipulate, and display a doubly linked list.
 * 
 * This class allows you to:
 * - Check if the list is empty.
 * - Insert elements at the beginning or end of the list.
 * - Display the list from the beginning or end.
 * 
 * Example Usage:
 * 
 * DoublyLinkedListInitializer list = new DoublyLinkedListInitializer();
 * list.insertFirst(10);
 * list.insertFirst(20);
 * list.insertLast(30);
 * list.displayFirst(); // Output: 20 10 30
 * list.displayLast(); // Output: 30 10 20
 */
class DoublyLinkedListInitializer {
    private DoublyLinkedList first;
    private DoublyLinkedList last;

    /**
     * Constructor to initialize an empty doubly linked list.
     */
    public DoublyLinkedListInitializer() {
        first = null;
        last = null;
    }

    /**
     * Checks if the doubly linked list is empty.
     * 
     * @return true if the list is empty, false otherwise.
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Inserts a new element at the beginning of the doubly linked list.
     * 
     * @param value the value to be inserted.
     */
    public void insertFirst(int value) {
        DoublyLinkedList newNode = new DoublyLinkedList(value);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first.previous = newNode;
            first = newNode;
        }
    }

    /**
     * Inserts a new element at the end of the doubly linked list.
     * 
     * @param value the value to be inserted.
     */
    public void insertLast(int value) {
        DoublyLinkedList newNode = new DoublyLinkedList(value);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
        }
    }

    /**
     * Inserts a new element after element in the doubly linked list.
     * 
     * @param linkValue the value to be inserted.
     */
    public boolean insertAfter(int key, int linkValue) {
        DoublyLinkedList current = first;
        while (current.value != key) {
            current = current.next;
            if (current == null)
                return false;
        }
        DoublyLinkedList link = new DoublyLinkedList(linkValue);
        if (current == last) {
            link.next = null;
            last = link;
        } else {
            current.next = link.next;
            current.next.previous = link;
        }
        link.previous = current;
        current.next = link;
        return true;
    }

    // /**
    // * Inserts a new element before element in the doubly linked list.
    // *
    // * @param value the value to be inserted.
    // */
    // public boolean insertBefore(int key, int value) {

    // }

    /**
     * Displays the elements of the doubly linked list from the beginning to the
     * end.
     */
    public void displayFirst() {
        DoublyLinkedList current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println("");
    }

    /**
     * Displays the elements of the doubly linked list from the end to the
     * beginning.
     */
    public void displayLast() {
        DoublyLinkedList current = last;
        while (current != null) {
            current.display();
            current = current.previous;
        }
        System.out.println("");
    }

    /**
     * delete the elements of the doubly linked list from the beginning to the end.
     */
    public DoublyLinkedList deleteFirst() {
        DoublyLinkedList current = first;
        if (first.next != null) {
            first = first.next;
            first.next.previous = null;
        } else {
            last = null;
        }
        return current;

    }

    /**
     * delete the elements of the doubly linked list from the end to the beginning.
     */
    public DoublyLinkedList deleteLast() {
        DoublyLinkedList current = last;
        if (first.next != null) {
            last.previous.next = null;
            last = last.previous;
        } else {
            first = null;
        }
        return current;
    }
}