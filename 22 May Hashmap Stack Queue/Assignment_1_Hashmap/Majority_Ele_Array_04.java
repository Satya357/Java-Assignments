import java.util.Scanner;
import java.util.TreeMap;

public class Majority_Ele_Array_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer,Integer> hashmap = new TreeMap<>();
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.print("Enter the element : ");
            int ele = sc.nextInt();
            hashmap.put(ele, ele);
        }
        sc.close();

        System.out.println("The largest element of map is " + hashmap.lastKey());
    }
}
