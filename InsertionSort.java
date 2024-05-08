public class InsertionSort {
    /**
     * Main method to test the insertion sort algorithm.
     * 
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        // The array to be sorted
        int[] arr = { 20, 5, 5, 6, 12, 14, 15, 51, 954, 654, 641654, 84942, 89465, 6486, 44512121, 2154, 54642389, 311,
                0, 7, 3, 1 };

        // System.out.println("Original Array:");
        // for (int h : arr)
        // System.out.println(h);

        insertionSort(arr);

        // System.out.println("\nInsertion Sorted Array:");
        // for (int h : arr)
        // System.out.println(h);
    }

    /**
     * Swaps two elements in the array.
     * 
     * @param arr The array containing the elements
     * @param i   Index of the first element to be swapped
     * @param j   Index of the second element to be swapped
     */
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * Sorts an array using the insertion sort algorithm.
     * 
     * @param array The array to be sorted
     */
    public static void insertionSort(int[] array) {
        // Start iterating from the second element
        for (int i = 1; i < array.length; i++) {
            int current = array[i]; // Store the current element
            int j = i - 1; // Initialize a pointer to the previous element

            // Move elements of array[0..i-1], that are greater than current,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current; // Place the current element at its correct position
            for (int h : array)
                System.out.println(h);
            System.out.println("");  
        }
    }
}
