import java.util.Arrays;
import java.util.Scanner;

class Selection_passes_count_05 {
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

        int passes_count = 0;
        for (int i = 0; i < length - 1; i++) {
            int max_index = i;

            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[max_index]) {
                    max_index = j;
                }
            }

            passes_count++;

            int temp = arr[i];
            arr[i] = arr[max_index];
            arr[max_index] = temp;
        }

        System.out.println("Number of passes required is : " + passes_count);
        System.out.println("Selection sorted array is : " + Arrays.toString(arr));
    }
}