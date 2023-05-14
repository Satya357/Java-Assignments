import java.util.Scanner;

class Sum_Of_Numbers_01{
    public static int sum(int number){
        if(number/10 == 0)
            return number%10;

        return number % 10 + sum(number/10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the sum : ");
        int num = sc.nextInt();
        sc.close();

        int result = sum(num);
        System.out.println("The sum of the digits of " + num + " is : " + result);
    }
}