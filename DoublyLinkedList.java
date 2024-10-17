class DoublyLinkedList {
    int value;
    DoublyLinkedList next;
    DoublyLinkedList previous;

    /**
     * Constructor to initialize a node with a given value.
     * 
     * @param value the value of the node.
     */
    public DoublyLinkedList(int value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public void display() {
        System.out.println(value);
    }
}