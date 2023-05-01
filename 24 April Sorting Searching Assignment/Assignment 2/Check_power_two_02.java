import java.util.Scanner;

class Check_power_two_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the decimal number : ");
        int decimal_num = sc.nextInt();
        int power = 0;
        int binary_num = (int) Math.pow(2, power);
        boolean isBinaryPower = false;
        sc.close();

        while (binary_num <= decimal_num) {
            if (binary_num == decimal_num) {
                isBinaryPower = true;
            }
            power++;
            binary_num = (int) Math.pow(2, power);
        }

        if (isBinaryPower) {
            System.out.println("\nTrue , it is the power of two");
        } else {
            System.out.println("\nFalse , it is not the power of two");
        }
    }
}