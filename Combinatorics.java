public class Combinatorics {

    public static void main(String[] args) {
        int num = 10; // عدد الدرجات
        int ways = calculateWays(num);
        System.out.println("Total ways to reach step " + num + ": " + ways);
    }

    public static int calculateWays(int num) {
        if (num <= 0)
            return 0;
        if (num == 1)
            return 1;

        int prev2 = 1; // عدد الطرق للوصول للدرجة 1
        int prev1 = 2; // عدد الطرق للوصول للدرجة 2
        int current = 0;

        System.out.println("Step 1: " + prev2 + " way(s)");
        System.out.println("Step 2: " + prev1 + " way(s)");

        // نبدأ من الخطوة الثالثة ونحسب لحد الخطوة المطلوبة
        for (int i = 3; i <= num; i++) {
            current = prev1 + prev2; // حساب الطرق للدرجة الحالية
            // تحديث القيم السابقة
            prev2 = prev1;
            prev1 = current;
            System.out.println("Step " + i + ": " + current + " way(s) " + " prev1 " + +prev1 + " prev2 " + prev2);

        }

        return current;
    }
}
