import java.util.Scanner;

class Odd_duplicate_05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of an array : ");
        int length = sc.nextInt();
        int arr[] = new int[length];

        for(int i=0; i<length; i++){
            System.out.print("Enter the element on positiom " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        int result = 0;

        for(int i=0; i<length; i++){
            result ^= arr[i];
        }

        System.out.println("\nThe odd occuring element is : " + result);
    }
}