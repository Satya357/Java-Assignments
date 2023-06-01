public class Segregate_Signs_02 {
    public static void segregatePositiveNegative(int[] arr) {
        int left = 0; 
        int right = arr.length - 1; 

        while (left <= right) {
            while (left <= right && arr[left] < 0) {
                left++;
            }

            while (left <= right && arr[right] >= 0) {
                right--;
            }

            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {19, -20, 7, -4, -13, 11, -5, 3};
        segregatePositiveNegative(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
