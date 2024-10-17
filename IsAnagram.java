public class IsAnagram {

    // Function to check if two strings are anagrams
    public static boolean isAnagram(String s, String t) {
        System.out.println("Input String s: " + s);
        System.out.println("Input String t: " + t);

        // Step 1: Check if the lengths are different
        if (s.length() != t.length()) {
            System.out.println("Strings are of different lengths.");
            return false;
        }

        // Step 2: Create two arrays to count the frequency of each character
        int[] countS = new int[26];  // To count characters in string s
        int[] countT = new int[26];  // To count characters in string t

        // Step 3: Count the frequency of each character in both strings
        for (int i = 0; i < s.length(); i++) {
            char charInS = s.charAt(i);
            char charInT = t.charAt(i);
            
            // Update counts for both strings
            countS[charInS - 'a']++;
            countT[charInT - 'a']++;
        }

        // Step 4: Print arrays to show character counts
        System.out.println("Character counts for String s:");
        printArray(countS);
        System.out.println("Character counts for String t:");
        printArray(countT);

        // Step 5: Compare character counts for both strings
        for (int i = 0; i < 26; i++) {
            System.out.println("Comparing countS[" + i + "] = " + countS[i] + " with countT[" + i + "] = " + countT[i]);
            if (countS[i] != countT[i]) {
                System.out.println("Mismatch found at index " + i + ": countS[" + i + "] != countT[" + i + "]");
                return false;
            }
        }

        // Step 6: If no mismatches, the strings are anagrams
        System.out.println("Strings are anagrams.");
        return true;
    }

    // Helper function to print the character count array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            char character = (char) (i + 'a'); // Convert index back to character
            System.out.println(character + ": " + arr[i]);
        }
    }

    // Main function to test the anagram function
    public static void main(String[] args) {
        // Example 1: Should return true
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Anagram check result: " + isAnagram(s1, t1));  // Output: true

        // Example 2: Should return false
        String s2 = "rat";
        String t2 = "car";
        System.out.println("Anagram check result: " + isAnagram(s2, t2));  // Output: false
    }
}
