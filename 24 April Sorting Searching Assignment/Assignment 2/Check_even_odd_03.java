import java.util.Scanner;

class Check_even_odd_03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int number = sc.nextInt();
        sc.close();

        if((number & 1) == 0){
            System.out.println(number + " is a even number");
        }else{
            System.out.println(number + " is a odd number");
        }
    }
}