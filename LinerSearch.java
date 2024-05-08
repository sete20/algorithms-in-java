
public class LinerSearch {

    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e"};
        String key = "ca";

        System.out.println("index key is = " + linerSearch(arr, key));
    }

    public static int linerSearch(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (key.equals(arr[i])) return i;
        }
        return -1;
    }
}
