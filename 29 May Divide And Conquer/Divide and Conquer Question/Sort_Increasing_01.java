import java.util.Arrays;

public class Sort_Increasing_01 {
    public static void mergeProcedure(int arr[] , int s , int middle , int e){
        int i,j,k;

        int m = middle - s + 1;
        int n = e - middle;

        int[] leftArr = new int[m];
        int[] rightArr = new int[n];
        
        for(i=0; i<m; i++){
            leftArr[i] = arr[s+i];
        }
        for(j=0; j<n; j++){
            rightArr[j] = arr[middle+1+j];
        }

        i=0;
        j=0;
        k=s;

        while(i<m && j<n){
            if(leftArr[i] <= rightArr[j]){
                arr[k++] = leftArr[i++];
            }else{
                arr[k++] = rightArr[j++];
            }
        }

        while(i<m){
            arr[k++] = leftArr[i++];
        }

        while(j<n){
            arr[k++] = rightArr[j++];
        }
    }
    public static void mergeSort(int[] arr , int s , int e){
        if(s < e){
            int middle = s + (e-s)/2;
            mergeSort(arr, s, middle);
            mergeSort(arr, middle+1, e);
            mergeProcedure(arr , s , middle , e);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,8,6,7,5,9,10};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr , 0 , 6);
        System.out.println(Arrays.toString(arr));
    }
}
