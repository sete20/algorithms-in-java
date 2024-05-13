/**
 * This class demonstrates the usage of the Stack class by performing various
 * stack operations,
 * specifically to reverse a word.
 */
public class StackReverseWord {

    /**
     * The main method, which is the entry point of the application.
     * It creates an instance of the Stack class and performs various stack
     * operations to reverse a word.
     * 
     * @param args The command-line arguments (unused).
     */
    public static void main(String[] args) {
        // The word to be reversed
        String word = "abdelrhman";

        // Create an instance of Stack with a capacity equal to the length of the word
        Stack stack = new Stack(word.length());

        // Push each character of the word onto the stack
        for (int i = 0; i < word.length(); i++) {
            stack.push((int) word.charAt(i)); // Convert the character to its ASCII value and push onto the stack
            System.out.println((int) word.charAt(i));
            System.out.println(word.charAt(i));
        }

        // Check if the stack is full
        System.out.println("Is stack full? " + stack.isFull());

        // Pop all elements from the stack (emptying it)
        while (!stack.isEmpty()) {
            stack.pop();
        }

        // Check if the stack is empty after popping all elements
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
