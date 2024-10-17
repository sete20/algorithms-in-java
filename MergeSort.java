public class MergeSort {

    /**
     * Main method to test the merge sort algorithm by merging two arrays.
     * This method initializes two integer arrays, merges them, and prints the result.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Example arrays to be merged (these should be sorted for merge to work correctly)
        int[] a = { 0, 1, 3, 7, 311, 2154, 6486, 89465, 44512121, 54642389 };
        int[] b = { 5, 5, 6, 12, 14, 15, 20, 51, 654, 954 ,2000000000};

        // Array to hold the result of merging a and b
        int[] c = new int[a.length + b.length];

        // Merging arrays a and b into array c
        merge(a, b, c);

        // Print the merged array
        System.out.println("Merged Array: ");
        for (int i : c) {
            System.out.print(i + " ");
        }
    }

    /**
     * Merges two sorted arrays a and b into a new array c.
     * This is the merging process used in the merge sort algorithm.
     * 
     * @param a First sorted array
     * @param b Second sorted array
     * @param c Resultant array after merging a and b
     */
    public static void merge(int[] a, int[] b, int[] c) {
        int aIndex = 0, bIndex = 0, cIndex = 0;

        // Compare elements from both arrays and merge them into array c
        while (aIndex < a.length && bIndex < b.length) {
            if (a[aIndex] <= b[bIndex]) {
                c[cIndex++] = a[aIndex++]; // Add the smaller element from a
            } else {
                c[cIndex++] = b[bIndex++]; // Add the smaller element from b
            }
        }

        // Add remaining elements from array a, if any
        while (aIndex < a.length) {
            c[cIndex++] = a[aIndex++];
        }

        // Add remaining elements from array b, if any
        while (bIndex < b.length) {
            c[cIndex++] = b[bIndex++];
        }
    }
}
