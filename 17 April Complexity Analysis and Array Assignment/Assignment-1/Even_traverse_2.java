import java.util.Scanner;

public class Even_traverse_2{
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

        System.out.println("\nElements which is having the even values : ");

        for(int element : arr){
            if(element % 2 == 0){
                System.out.println(element);
            }
        }

        sc.close();
    }
}