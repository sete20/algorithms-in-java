/**
 * This class demonstrates the usage of the Stack class by performing various stack operations.
 */
public class StackApp {

    /**
     * The main method, which is the entry point of the application.
     * It creates an instance of the Stack class and performs various stack operations.
     * @param args The command-line arguments (unused).
     */
    public static void main(String[] args) {
        // Create an instance of Stack with a capacity of 4
        Stack stack = new Stack(4);

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Push elements onto the stack
        stack.push(8);
        stack.push(4);
        stack.push(10);
        stack.push(11);

        // Check if the stack is full
        System.out.println("Is stack full? " + stack.isFull());

        // Pop an element from the stack
        stack.pop();

        // Check if the stack is full after popping an element
        System.out.println("Is stack full after popping an element? " + stack.isFull());
    }
}