import java.util.Arrays;
import java.util.Scanner;

class Insertion_sort_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int length = sc.nextInt();
        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter the element on position " + (i + 1) + " : ");
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        sc.close();

        System.out.println("\nEntered array is : " + Arrays.toString(arr));

        for (int i = 0; i < length - 1; i++) {

            for (int j = i + 1; (j > 0 && arr[j] > arr[j - 1]); j--) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }
        }

        System.out.println("Insertion sorted array is : " + Arrays.toString(arr));
    }
}