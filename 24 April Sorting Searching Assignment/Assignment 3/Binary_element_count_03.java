import java.util.Scanner;

class Binary_element_count_03 {
    public static int binarySearch(int arr[], int target) {

        int left = 0, right = arr.length - 1;

        int count = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                for (int i = mid; i <= right; i++) {
                    if (arr[i] == target) {
                        count++;
                    } else {
                        break;
                    }
                }

                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int length = sc.nextInt();
        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter the element on index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("\nEnter the targeted element you want to count : ");
        int target = sc.nextInt();
        sc.close();

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("\nSorry targeted element " + target + " does not exist");
        } else {
            System.out.println("\nTotal count of the element " + target + " is : " + result);
        }
    }
}