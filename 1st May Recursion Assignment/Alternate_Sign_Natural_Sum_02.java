import java.util.Scanner;

public class Alternate_Sign_Natural_Sum_02 {
    public static int alternateSignSum(int number){
        if(number == 1){
            return 1;
        }

        if(number % 2 == 0){
            return alternateSignSum(number-1) - number;
        }else{
            return alternateSignSum(number-1) + number; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the natural sum : ");
        int num = sc.nextInt();
        sc.close();

        int result = alternateSignSum(num);
        System.out.println("The natural sum having alternate sign is : " + result);
    }
}
