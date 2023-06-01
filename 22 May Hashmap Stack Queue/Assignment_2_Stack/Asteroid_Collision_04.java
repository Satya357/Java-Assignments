import java.util.Stack;

public class Asteroid_Collision_04 {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            if (stack.isEmpty() || asteroid > 0) {
                stack.push(asteroid);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -asteroid) {
                    stack.pop();
                }

                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroid);
                } else if (stack.peek() == -asteroid) {
                    stack.pop();
                }
            }
        }

        int[] remainingAsteroids = new int[stack.size()];
        for (int i = remainingAsteroids.length - 1; i >= 0; i--) {
            remainingAsteroids[i] = stack.pop();
        }

        return remainingAsteroids;
    }

    public static void main(String[] args) {
        int[] asteroids = {10,2,-5};
        int[] remainingAsteroids = asteroidCollision(asteroids);
        for (int asteroid : remainingAsteroids) {
            System.out.print(asteroid + " ");
        }
        System.out.println();
    }
}
