import java.util.*;

class Possible_Permutations_02{
    public static void possiblePermutation(int num[], ArrayList temp , ArrayList<ArrayList<Integer>> result){
        if(temp.size() == num.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<num.length; i++){
            if(temp.contains(num[i])){
                continue;
            }

        temp.add(num[i]);
        possiblePermutation(num, temp, result);
        temp.remove(temp.size()-1);
        }
    };

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        possiblePermutation(arr , new ArrayList<>() , result);
        System.out.println(result);
    }
}