import java.util.ArrayList;

class Subset_Equal_Target_04 {
    public static void sequence(int arr[], int index, ArrayList<Integer> tempArray, int target,
            ArrayList<ArrayList<Integer>> result) {
        if (index == arr.length) {
            if (result.contains(tempArray)){
                return;
            }
                if (tempArray.size() > 0) {
                    int product = 1;

                    for (int ele : tempArray) {
                        product = product * ele;
                    }

                    if (product == target) {
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
        int arr[] = { 1, 2, 3 };
        int target = 6;

        sequence(arr, 0, new ArrayList<>(), target, result);

        if(result.isEmpty()){
          System.out.println("Sorry no subset found whose product is equals to the targeted value.");  
        }else{
            System.out.println("Yes subset found whose product is equals to the targeted value.");
            System.out.println("\nSubsets are : ");
            System.out.println(result);
        }

    }
}
