import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCount {
    public static void main(String[] args) {
        String input = "aaaabbbaaccb";
        String output = countLetters(input);
        System.out.println(output); // Output: a6b4c2
    }

    public static String countLetters(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        // Using a map to track the count of each character
        Map<Character, Integer> letterCounts = new HashMap<>();
        // Iterate through the characters and update their counts in the map
        for (char c : str.toCharArray()) {
            // System.out.println(c);
            letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
            // System.out.println(letterCounts);
        }
        System.out.println("im the array"+letterCounts);

        // Build the result string
        StringBuilder result = new StringBuilder();
        
        for (Map.Entry<Character, Integer> entry : letterCounts.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }
}
