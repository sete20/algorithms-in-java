import java.util.*;

public class AnagramsGroup {
    public static void main(String[] args) {
        String[] list = { "act", "pots", "tops", "cat", "stop", "hat" };
        System.out.println(groupAnagrams(list));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> anagrams = new HashMap<>();
        for(String word: strs)
        {   
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

          if (!anagrams.containsKey(sortedWord)) { 
                anagrams.put(sortedWord, new ArrayList<>()); 
            }
            
            System.out.println(anagrams.get(sortedWord));
            anagrams.get(sortedWord).add(word);
        }
        
        List<List<String>> result = new ArrayList<>(); // Initialize the result list
        for (List<String> group : anagrams.values()) {
            System.out.println(group);
            result.add(group); // Add each group of anagrams to the result
        }
        for (String group : anagrams.keySet()) {
            System.out.println(group+ ": " + anagrams.get(group));
        }
      return result;
    }
}
