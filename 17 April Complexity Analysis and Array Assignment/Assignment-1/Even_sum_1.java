import java.util.Scanner;

public class Even_sum_1 {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element on index " + i + " : ");
            int element = sc.nextInt();
            arr[i] = element;
        }

        int sum = 0;

        for (int i=0; i<size; i+=2) {
                sum += arr[i];
        }

        System.out.println("\nSum of the even elements is : " + sum);

        sc.close();
    }
}