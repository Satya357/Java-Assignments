import java.util.Scanner;
import java.util.TreeMap;

public class Hashmap_Key_01 {
    public static void main(String[] args) {
        Hashmap student = new Hashmap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of key-value pairs: ");
        int length = sc.nextInt();

        for (int i = 0; i < length; i++) {
            System.out.print("Enter the key: ");
            int key = sc.nextInt();
            System.out.print("Enter the value: ");
            String value = sc.next();
            student.addEntry(key, value);
        }
        sc.close();

        student.printHashMap();
    }
}

class Hashmap {
    public TreeMap<Integer, String> hashmap = new TreeMap<>();

    public void addEntry(int key, String value) {
        hashmap.put(key, value);
    }

    public void printHashMap() {
        System.out.println("The stored values in hashmap: " + hashmap);
    }
}
