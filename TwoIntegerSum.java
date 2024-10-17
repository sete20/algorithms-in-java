public class TwoIntegerSum {
        // دالة للعثور على مؤشرات العددين الذين يضفوا ليعطوا العدد المستهدف
        public static int[] twoSum(int[] nums, int target) {
            // الخطوة 1: المرور عبر كل عنصر في المصفوفة
            for (int i = 0; i < nums.length; i++) {
                // الخطوة 2: حساب القيمة المفقودة
                int complement = target - nums[i];
                System.out.println("Checking nums[" + i + "] = " + nums[i] + ", complement = " + complement);

                // الخطوة 3: البحث عن القيمة المفقودة في بقية المصفوفة
                for (int j = i + 1; j < nums.length; j++) {
                    System.out.println("Comparing with nums[" + j + "] = " + nums[j]);

                    if (nums[j] == complement) {
                        System.out.println("Found: nums[" + i + "] + nums[" + j + "] = " + nums[i] + " + " + nums[j] + " = " + target);
                        // الخطوة 4: إرجاع المؤشرات كمصفوفة
                        return new int[] { i, j };
                    }
                }
            }
            // إرجاع مصفوفة فارغة إذا لم يتم العثور على حل (ليس متوقعًا حسب شرط المشكلة)
            return new int[0];
        }
    
        // الدالة الرئيسية لاختبار دالة twoSum
        public static void main(String[] args) {
            // مثال على حالة الاختبار
            int[] nums = {2, 11,7, 15};
            int target = 9;
            int[] result = twoSum(nums, target);
            
            // طباعة النتيجة
            System.out.println("Indices: " + result[0] + ", " + result[1]); // الناتج: Indices: 0, 1
        }
}
