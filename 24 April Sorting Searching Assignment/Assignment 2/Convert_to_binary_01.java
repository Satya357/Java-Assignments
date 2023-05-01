import java.util.Scanner;

class Convert_to_binary_01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int decimal = sc.nextInt();
        sc.close();
        int binary_number[] = new int[32];
        int index = 0;

        while(decimal>0){
            binary_number[index++] = decimal % 2;
            decimal /= 2;
        }

        System.out.print("Binary representation of a number : " );
        for(int i=index-1; i>=0; i--){
            System.out.print(binary_number[i]);
        }
        
        System.out.println("\n");
    }
}