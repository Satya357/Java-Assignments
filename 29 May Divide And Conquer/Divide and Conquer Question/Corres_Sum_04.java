public class Corres_Sum_04 {
    public static void checkPermutationSum(int[] a, int[] b, int k) {
        for(int i=0; i<a.length; i++){
            boolean swipeFlag = false;
            for(int j=i; j<a.length; j++){
                if(a[i] + b[j] == k){
                    int temp = b[j];
                    b[j] = b[i];
                    b[i] = temp;
                    swipeFlag = true;
                    break;
                }
            }
            if(!swipeFlag){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    public static void main(String[] args) {
        int[] a1 = {2, 1, 3};
        int[] b1 = {7, 8, 9};
        int k1 = 10;
        checkPermutationSum(a1, b1, k1); // Yes

        int[] a2 = {1, 2, 2, 1};
        int[] b2 = {3, 3, 3, 4};
        int k2 = 5;
        checkPermutationSum(a2, b2, k2); // No
    }
}
