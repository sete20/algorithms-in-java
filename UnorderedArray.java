public class UnorderedArray {
    private long[] a;
    private int nElems;

    public UnorderedArray(int n) {
        a = new long[n];
        nElems = 0;
    }

    public int find(long value) {
        for (int i = 0; i < nElems; i++) {
            if (a[i] == value)
                return i;
        }
        return -1; // Move this line outside the loop
    }

    public boolean insert(long value) {
        if (nElems == a.length)
            return false;
        else {
            a[nElems] = value;
            nElems++;
            return true;
        }
    }

    public boolean delete(long value) {
        int pos = find(value);
        if (pos == -1)
            return false;
        else {
            for (int i = pos; i < nElems - 1; i++) {
                a[i] = a[i + 1];
            }
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.println(a[i]);
        }
    }
}

class UnorderedArrayApp {
    public static void main(String[] args) {
        UnorderedArray unorderedArray = new UnorderedArray(10); // Changed variable name to lowercase
        unorderedArray.insert(3);
        unorderedArray.insert(4);
        unorderedArray.insert(0);
        unorderedArray.insert(5);
        unorderedArray.insert(8);
        unorderedArray.insert(9);
        unorderedArray.insert(7);
        unorderedArray.insert(10);
        unorderedArray.insert(55);
        unorderedArray.insert(18);
        unorderedArray.display();
        unorderedArray.delete(5);
        unorderedArray.display();
        int orderedValue = unorderedArray.find(9);
        if (orderedValue == -1) { // Fixed typo in variable name
            System.out.println("Not Found"); // Corrected method call to System.out.println
        } else {
            System.out.println("Deleted"); // Corrected method call to System.out.println
        }
    }
}