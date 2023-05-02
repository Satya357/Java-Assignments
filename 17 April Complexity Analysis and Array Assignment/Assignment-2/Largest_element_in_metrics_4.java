import java.util.Scanner;

public class Largest_element_in_metrics_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = sc.nextInt();

        int metric[][] = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                System.out.print("Enter the element on index : " + row + " " + col + " : ");
                int element = sc.nextInt();
                metric[row][col] = element;
            }
        }

        sc.close();

        int max = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(metric[i][j] > max){
                    max = metric[i][j];
                }
            }
        }

        System.out.println("The largest element in the metrics is : " + max);
    }
}
