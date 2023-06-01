import java.util.HashMap;
import java.util.Scanner;

public class Detect_Duplicate_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the element : ");
            int ele = sc.nextInt();
            arr[i] = ele;
        }

        boolean isDuplicate = false;
        for(int i=0; i<n; i++){
            if(hashmap.containsKey(arr[i])){
                isDuplicate = true;
            }
            hashmap.put(arr[i], i);
        }

        if(isDuplicate){
            System.out.println("Duplicate is found in array.");
        }else{
            System.out.println("No duplicate found in array.");
        }

        sc.close();

    }
}
