public class Kth_Largest {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int s, int e) {
        int pivot = arr[s];
        int i = s;
    
        for (int j = i + 1; j <= e; j++) {
            if (arr[j] > pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, s, i);
        return i;
    }    

    public static int procedureSelection(int[] arr, int s, int e, int k) {
        if (s <= e) {
            int m = partition(arr, s, e);
            if (m == k - 1) {
                return arr[m];
            } else if (m < k - 1) {
                return procedureSelection(arr, m + 1, e, k);
            } else {
                return procedureSelection(arr, s, m - 1, k);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 3, 2, 1};
        int k = 5;
        int result = procedureSelection(arr, 0, arr.length - 1, k);
        System.out.println(result);
    }
}
