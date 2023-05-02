import java.util.Arrays;
import java.util.Scanner;

public class Metrics_elements_info_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = sc.nextInt();

        int metric[][] = new int[rows][columns];

        for(int row=0; row<rows; row++){
            for(int col=0; col<columns; col++){
                System.out.print("Enter the element on index : " + row + " " + col + " : ");
                int element = sc.nextInt();
                metric[row][col] = element;
            }
        }

        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int zeroes = 0;

        for(int row=0; row<rows; row++){
            for(int col=0; col<columns; col++){
                int element = metric[row][col];

                if(element > 0){
                    positiveNumbers++;
                }
                else if(element < 0){
                    negativeNumbers++;
                }else if(element == 0){
                    zeroes++;
                }

                if(element % 2 == 0){
                    evenNumbers++;
                }else{
                    oddNumbers++;
                }
            }
        }

        System.out.println("\nPositive numbers in the metrics : " + positiveNumbers);
        System.out.println("Negative numbers in the metrics : " + negativeNumbers);
        System.out.println("Zeroes in the metrics : " + zeroes);
        System.out.println("Even numbers in the metrics : " + evenNumbers);
        System.out.println("Odd numbers in the metrics : " + oddNumbers);

        sc.close();
    }
}