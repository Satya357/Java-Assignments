import java.util.Arrays;
import java.util.Scanner;

class Bubble_passes_count_04 {
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

        int bubble_passes = 0;
        for (int i = 0; i < length - 1; i++) {
            boolean sorted_flag = true;

            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted_flag = false;
                }
            }
            bubble_passes++;

            if (sorted_flag == true) {
                break;
            }
        }

        System.out.println("Number of passes required is " + bubble_passes);
        System.out.println("Bubble sorted array is : " + Arrays.toString(arr));
    }
}