import java.util.Stack;

public class Baseball_Score_03 {
    public static int scoreCalculator(String[] ops){
        Stack<Integer> stack = new Stack<>();
        int totalScore = 0;

        for(String c : ops){
            if(c.equals("C")){
                stack.pop();
            }else if(c.equals("D")){
                int doubleScore = 2 * stack.peek();
                stack.push(doubleScore);
            }else if(c.equals("+")){
                int score1 = stack.pop();
                int score2 = stack.pop();
                int scoreSum = score1 + score2;
                stack.push(score2);
                stack.push(score1);
                stack.push(scoreSum);
            }else{
                int num = Integer.parseInt(c);
                stack.push(num);
            }
        }

        while(!stack.isEmpty()){
            totalScore += stack.pop();
        }
        return totalScore;
    }
    public static void main(String[] args) {
        String[] ops1 = {"5" , "2" , "C" , "D" , "+"};
        int result1 = scoreCalculator(ops1);
        System.out.println("Total score in baseball is : " + result1);

        String[] ops2 = {"5" , "-2" , "4" , "C" , "D" , "9", "+" , "+"};
        int result2 = scoreCalculator(ops2);
        System.out.println("Total score in baseball is : " + result2);

        String[] ops3 = {"1" , "C"};
        int result3 = scoreCalculator(ops3);
        System.out.println("Total score in baseball is : " + result3);
    }
}
