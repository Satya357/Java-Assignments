public class Segregate_Relative_Order_03 {
    public static void segregatePositiveNegative(int[] arr) {
        int index = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                index++;
                swap(arr , index , i);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {19, -20, 7, -4, -13, 11, -5, 3};
        segregatePositiveNegative(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
