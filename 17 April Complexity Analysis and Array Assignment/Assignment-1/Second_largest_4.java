import java.util.Scanner;
import java.util.Arrays;

public class Second_largest_4{
    public static void main(String[] args){
        System.out.print("Enter the size of an array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element on index " + i + " : ");
            int element = sc.nextInt();
            arr[i] = element;
        }

        for(int i=0; i<size-1; i++){
            int temp =0;
            for(int j=0; j<size-1-i; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("\nThe second largest element in the array is : " + arr[arr.length - 2]);
        sc.close();
    }
}