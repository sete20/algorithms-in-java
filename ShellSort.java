/**
 * ShellSort algorithm implementation in Java
 * 
 * This method sorts an array using the Shell Sort algorithm, which is an
 * optimized version of insertion sort.
 * Shell Sort allows for the exchange of elements that are far apart, reducing
 * the overall number of shifts needed.
 * 
 * Time Complexity:
 * - Best Case: O(n log n) when the array is nearly sorted.
 * - Average Case: O(n^(3/2)) depending on the gap sequence.
 * - Worst Case: O(n^2), though it's generally more efficient than basic
 * insertion sort in practice.
 * 
 * Space Complexity: O(1), as it is an in-place sorting algorithm.
 * 
 * Arabic
 * الدالة دي بترتب مصفوفة أرقام باستخدام خوارزمية Shell Sort، اللي تعتبر نسخة
 * متطورة من Insertion Sort.
 * خوارزمية Shell Sort بتخليك تقارن عناصر بعيدة عن بعضها في الأول، وده بيساعد
 * على تقليل عدد النقلات أو التحريكات اللي محتاجينها
 * عشان نوصل للترتيب النهائي.
 * 
 * تعقيد الوقت (Time Complexity):
 * - أفضل حالة (Best Case): O(n log n) لما المصفوفة تكون شبه مرتبة من الأول.
 * - الحالة المتوسطة (Average Case): O(n^(3/2)) على حسب ترتيب الفجوات (gap
 * sequence).
 * - أسوأ حالة (Worst Case): O(n^2)، بس في الغالب بتكون أسرع من Insertion Sort
 * في الاستخدام العملي.
 * 
 * تعقيد المساحة (Space Complexity): O(1)، لأنها بتشتغل في مكانها وما بتحتاجش
 * مساحة إضافية.
 */
public class ShellSort {

    public static void main(String[] args) {
        // Array to be sorted
        int[] arr = { 1, 2, 3, 4, 3, 2, 10, 8, 6, 5, 7, 13, 11, 12, 16, 14, 15 };

        // Sort the array using Shell Sort
        shellSort(arr);

        // Print the sorted array
        for (int i : arr)
            System.out.println(i);
    }

    /**
     * Shell Sort algorithm
     * 
     * This function sorts an array of integers using the Shell Sort algorithm.
     * It works by gradually reducing the gap between compared elements until the
     * array is fully sorted.
     * 
     * Time Complexity:
     * - Best Case: O(n log n)
     * - Average Case: O(n^(3/2))
     * - Worst Case: O(n^2)
     * 
     * Space Complexity: O(1)
     * 
     * @param arr The array of integers to be sorted.
     * 
     *            Arabic
     *            الخوارزمية دي بترتب المصفوفة باستخدام Shell Sort، وبتشتغل عن طريق
     *            تقليل المسافة (gap) بين العناصر اللي بنقارنها
     *            بالتدريج، لحد ما نوصل لترتيب كامل.
     * 
     *            الخطوات اللي الخوارزمية بتمشي عليها:
     *            1. بتبدأ بمسافة كبيرة (gap) بين العناصر، والمسافة دي بتقل كل مرة.
     *            2. كل مرة بنعمل مقارنة بين العناصر اللي بعدهم المسافة دي، ونعمل
     *            تحريك ليهم لو هما مش في ترتيب صح.
     *            3. لما المسافة بتوصل لـ 1، بنعمل مقارنة زي Insertion Sort على كل
     *            المصفوفة.
     * 
     *            تعقيد الوقت (Time Complexity):
     *            - أفضل حالة: O(n log n) لما المصفوفة تكون شبه مرتبة.
     *            - الحالة المتوسطة: O(n^(3/2)).
     *            - أسوأ حالة: O(n^2)، لكن في الغالب الخوارزمية بتكون أسرع من الـ
     *            Insertion Sort.
     * 
     *            تعقيد المساحة (Space Complexity): O(1) عشان الخوارزمية بتشتغل على
     *            نفس المصفوفة من غير ما تستخدم مساحة إضافية.
     */
    public static void shellSort(int[] arr) {
        int h = 1;

        // Find the maximum gap size (h) based on the array length
        while (h <= arr.length / 3) {
            h = h * 3 + 1;
        }

        // Perform the sorting with decreasing gap sizes
        while (h > 0) {
            for (int i = h; i < arr.length; i++) {
                int tmp = arr[i];
                int inner = i;

                // Compare and shift elements by the gap size (h)
                while (inner >= h && tmp < arr[inner - h]) {
                    arr[inner] = arr[inner - h];
                    inner -= h;
                }
                arr[inner] = tmp;
            }
            // Decrease the gap size
            h = (h - 1) / 3;
        }
    }
}
