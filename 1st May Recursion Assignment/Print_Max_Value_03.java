import java.util.Arrays;

public class Print_Max_Value_03 {
    public static void main(String[] args) {
        int arr[] = {13, 1, -3, 22, 5};

        int maxIndex = 0;

        for(int i=1; i<arr.length; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }

        System.out.println("The maximum value of the array " + Arrays.toString(arr) + " is : " + arr[maxIndex]);
    }
}
