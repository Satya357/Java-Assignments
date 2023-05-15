import java.util.ArrayList;

class K_Divisible_Subsets_01 {
    public static void sequence(int arr[], int index, ArrayList<Integer> tempArray, int target,
            ArrayList<ArrayList<Integer>> result) {
        if (index == arr.length) {
            if (result.contains(tempArray)) {
                return;
            }
            if (tempArray.size() > 0) {
                int sum = 0;

                for (int ele : tempArray) {
                    sum += ele;
                }

                if (sum == target) {
                    result.add(new ArrayList<>(tempArray));
                }
            }

            return;
        }

        sequence(arr, index + 1, tempArray, target, result);
        tempArray.add(arr[index]);

        sequence(arr, index + 1, tempArray, target, result);
        tempArray.remove(tempArray.size() - 1);
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int arr[] = { 1, 3, 2, 2 };
        int target = 5;

        sequence(arr, 0, new ArrayList<>(), target, result);

        if (result.isEmpty()) {
            System.out.println("Sorry no subset found whose sum is equals to the targeted value.");
        } else {
            System.out.println("\nYes subset found whose sum is equals to the targeted value.");
            System.out.println("Subsets are : ");
            System.out.println(result);
        }

    }
}
