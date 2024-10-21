import java.util.HashMap;

public class CountLettersInString {
    public static void main(String[] args) {
        System.out.println(CountLetters("aasasjcfjjcjcjlaaaaaaaa"));
    }

    public static String CountLetters(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // Build the result string in the desired format.
        StringBuilder result = new StringBuilder();
        for (char c : map.keySet()) {
            result.append(c).append(map.get(c));
        }
        return result.toString();
    }
}
