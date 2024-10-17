/**
 * The DoublyLinkedListRunner class demonstrates the usage of the
 * DoublyLinkedListInitializer class.
 */
class DoublyLinkedListRunner {
    public static void main(String[] args) {
        DoublyLinkedListInitializer doublyLinkedListInitializer = new DoublyLinkedListInitializer();

        // Insert elements at the beginning using a loop
        int[] valuesToInsertFirst = { 1, 2, 3, 4, 5 };
        for (int value : valuesToInsertFirst) {
            doublyLinkedListInitializer.insertFirst(value);
        }
        // Display the list from the beginning to the end
        // System.out.print("List from first to last: ");
        // doublyLinkedListInitializer.displayFirst();

        // // Display the list from the end to the beginning
        // System.out.print("List from last to first: ");
        // doublyLinkedListInitializer.displayLast();

        // doublyLinkedListInitializer = new DoublyLinkedListInitializer();
        // // Insert elements at the end using a loop
        // int[] valuesToInsertLast = { 6, 7, 8, 9, 10 };
        // for (int value : valuesToInsertLast) {
        //     doublyLinkedListInitializer.insertLast(value);
        // }

        // // Display the list from the beginning to the end
        // System.out.print("List from first to last: ");
        // doublyLinkedListInitializer.displayFirst();

        // // Display the list from the end to the beginning
        // System.out.print("List from last to first: ");
        // doublyLinkedListInitializer.displayLast();
        // doublyLinkedListInitializer.deleteLast();
        // System.out.print("List from last to first: ");
        // doublyLinkedListInitializer.displayLast();

        // System.out.print("List from first to last: ");
        // doublyLinkedListInitializer.displayFirst();
        // doublyLinkedListInitializer.deleteFirst();
        // System.out.print("List from first to last: ");
        // doublyLinkedListInitializer.displayFirst();
        doublyLinkedListInitializer.insertAfter(1, 100);
        doublyLinkedListInitializer.displayFirst();

    }
}
