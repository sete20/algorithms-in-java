/**
 * A class to demonstrate the usage of the LinkedList class.
 */
public class LinkedListRunner {
    /**
     * The main method of the program.
     * 
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a new instance of the LinkedList.
        LinkedList linkedList = new LinkedList();

        // Insert integers from 0 to 10 into the linked list.
        for (int i = 0; i <= 10; i++) {
            linkedList.insert(i);
        }

        // Insert integers from 6 to 16 after each integer from 1 to 11 in the linked
        // list.
        for (int i = 0; i <= 10; i++) {
            linkedList.insertAfter(i + 1, i + 5);
        }

        // Attempt to find an item with the value 110 in the linked list.
        Link findFunctionOutput = linkedList.find(110);

        // Delete the first item (value 1) from the linked list.
        linkedList.delete(1);

        // Display the contents of the linked list.
        linkedList.display();

        // Check if the item with value 110 was found in the linked list.
        if (findFunctionOutput != null) {
            System.out.println(findFunctionOutput);
        } else {
            System.out.println("Item not found.");
        }
    }
}
