import java.util.Scanner;

public class Above_sec_diagonal_2 {
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

        System.out.println("\nElements above the secondary diagonal are : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns - 1 - i; j++) {
                System.out.print(metric[i][j] + " ");
            }
            System.out.println("\n");
        }
        
        sc.close();
    }
}
