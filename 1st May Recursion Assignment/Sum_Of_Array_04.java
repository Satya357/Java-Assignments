public class Sum_Of_Array_04 {
    public static int recursionSum(int arr[] , int index){
        if(arr.length == index){
            return 0;
        }

        return arr[index] + recursionSum(arr , index+1);
    }
    public static void main(String[] args) {
        int arr[] = {92, 23, 15, -20, 10};

        int result = recursionSum(arr, 0);
        System.out.println("The sum of the array is : " + result);
    }
}
