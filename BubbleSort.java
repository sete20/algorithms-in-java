public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 5, 6, 12, 14, 15, 51, 954, 654, 641654, 84942, 89465, 6486, 44512121, 2154, 54642389, 311,0, 7, 3, 20 };
        
        // Iterate through the array to perform bubble sort
        for (int k = 0; k < arr.length-1; k++) {
            // Iterate through the array elements
            // The inner loop runs from the first element to the last unsorted element
            for (int i = 0; i < arr.length- 1 - k; i++) {
                // Compare current element with the next element
                if (arr[i] > arr[i+1]) {
                    // If the condition is true, swap the elements
                    swap(arr, i, i + 1);
                }
            }
        }

        // Print the final sorted array
        System.out.println("Final Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void swap(int[] arr, int m, int n) {
        // Function to swap two elements in the array
        int tmp = arr[m];
        arr[m] = arr[n];
        arr[n] = tmp;
    }
}
