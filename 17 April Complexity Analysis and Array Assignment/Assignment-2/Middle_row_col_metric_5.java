import java.util.Scanner;

public class Middle_row_col_metric_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimension of metrix : ");
        int dimension = sc.nextInt();

        int metric[][] = new int[dimension][dimension];

        for (int row = 0; row < dimension; row++) {
            for (int col = 0; col < dimension; col++) {
                System.out.print("Enter the element on index : " + row + " " + col + " : ");
                int element = sc.nextInt();
                metric[row][col] = element;
            }
        }

        sc.close();

        System.out.print("\nMiddle row elements of metrix are : ");
        for (int col = 0; col < dimension; col++)
            System.out.print(metric[dimension / 2][col] + " ");

        System.out.print("\nMiddle column elements of metrix are : ");
        for (int row = 0; row < dimension; row++)
            System.out.print(metric[row][dimension / 2] + " ");

        System.out.println("\n");

    }
}
