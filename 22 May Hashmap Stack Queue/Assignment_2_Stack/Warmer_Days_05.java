import java.util.Arrays;
import java.util.Stack;

class Warmer_Days_05 {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<temperatures.length; i++){
            while(!stack.isEmpty() && (temperatures[i] > temperatures[stack.peek()])){
                temperatures[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            temperatures[stack.pop()] = 0;
        }

        return temperatures;
    }

    public static void main(String[] args) {
        int[] temperatures1 = {73,74,75,71,69,72,76,73};
        int[] result1 = dailyTemperatures(temperatures1);
        System.out.println("Number of days to wait for warmer temperature : " + Arrays.toString(result1));

        int[] temperatures2 = {30,40,50,60};
        int[] result2 = dailyTemperatures(temperatures2);
        System.out.println("Number of days to wait for warmer temperature : " + Arrays.toString(result2));

        int[] temperatures3 = {30,60,90};
        int[] result3 = dailyTemperatures(temperatures3);
        System.out.println("Number of days to wait for warmer temperature : " + Arrays.toString(result3));

    }
}