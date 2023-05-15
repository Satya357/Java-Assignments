import java.util.ArrayList;

public class Unique_duplicate_permutation_03 {

    public static String swap(String str, int i, int j) {
        char charArr[] = str.toCharArray();
        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;

        return String.valueOf(charArr);
    }

    public static void permutate(String str, int s, int e, ArrayList<String> result) {
        if (s == e) {
            if (result.contains(str)) {
                return;
            }
            result.add(str);
        } else {
            for (int i = s; i <= e; i++) {
                str = swap(str, s, i);
                permutate(str, s + 1, e, result);
                str = swap(str, i, s);
            }
        }
    }

    public static void main(String[] args) {
        String str = "123";
        int n = str.length();
        ArrayList<String> result = new ArrayList<>();

        System.out.println("For the string " + str + " permutation are : ");
        permutate(str, 0, n - 1, result);
        System.out.println(result);

    }
}
