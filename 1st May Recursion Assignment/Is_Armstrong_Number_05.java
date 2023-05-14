public class Is_Armstrong_Number_05 {
    public static int sumOfNumber(int num , int length){
        if(num/10 == 0){
            return (int) Math.pow(num%10 , length);
        }

        return (int) Math.pow(num%10, length) + sumOfNumber(num/10 , length);
    }
    public static void main(String[] args) {
        int number = 153;
        int length = String.valueOf(number).length();
        int result = sumOfNumber(number , length);
        
        if(number == result)
            System.out.println("Yes " + number + " is an armstrong number");
        else 
            System.out.println("No " + number + " is not an armstrong number");
    }
}
