import java.util.Scanner;

public class Square_root_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number : ");
        int num = sc.nextInt();
        sc.close();

        int sqrt = (int) Math.sqrt(num);

        if((sqrt*sqrt) == num){
            System.out.println("Yes it is the perfect square.");
        }else{
            System.out.println("No it is not a perfect square.");
        }
    }
}
