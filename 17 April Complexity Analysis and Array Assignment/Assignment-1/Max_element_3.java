import java.util.Scanner;

public class Max_element_3{
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

        int max = 0;

        for(int ele : arr){
            if(ele > max){
                max = ele;
            }
        }

        System.out.println("\nThe maximum element in the array is : " + max);

        sc.close();
    }
}