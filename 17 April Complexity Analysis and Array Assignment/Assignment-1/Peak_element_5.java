import java.util.Scanner;
import java.util.Arrays;

public class Peak_element_5{
    public static int firstPeakElement(int[] arr){
        for(int i=1; i<arr.length-1; i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                return i;
            }
        }
        return -1;
    }
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

        int peak_result = firstPeakElement(arr);

        System.out.println("\nThe Peak element in the array is : " + arr[peak_result]);
        sc.close();
    }
}