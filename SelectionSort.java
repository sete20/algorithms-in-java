public class SelectionSort {
    public static void main(String[] args) {
        // The array to be sorted
        int[] arr = { 20, 5, 5, 6, 12, 14, 15, 51, 954, 654, 641654, 84942, 89465, 6486, 44512121, 2154, 54642389, 311, 0, 7, 3, 1 };

        // Printing the original array
        System.out.println("Original Array:");
        for (int h : arr)
            System.out.println(h);

        // Sorting the array using Selection Sort
        selectionSort(arr);

        // Printing the sorted array
        System.out.println("\nSorted Array:");
        for (int h : arr)
            System.out.println(h);
    }

    // Function to swap two elements in the array
    public static void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // Function to perform Selection Sort
    public static void selectionSort(int[] array) {
        int min;
        // Traverse through all elements of the array
        for (int out = 0; out < array.length - 1; out++) {
            min = out;
            // Find the minimum element in the unsorted part of the array
            for (int in = out + 1; in < array.length; in++) {
                if (array[in] < array[min])
                    min = in;
            }
            // Swap the found minimum element with the first element of the unsorted part
            swap(min, out, array);
        }
    }
}
