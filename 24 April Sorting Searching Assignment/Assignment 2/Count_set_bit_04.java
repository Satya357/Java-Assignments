import java.util.Scanner;

class Count_set_bit_04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to count the set bits : ");
        int number = sc.nextInt();
        sc.close();

        int count = 0;

        while(number > 0){
            count += number & 1;
            number>>=1;
        }

        System.out.println("The total set bit in the number is : " + count);
    }
}