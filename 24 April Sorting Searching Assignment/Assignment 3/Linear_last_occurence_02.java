import java.util.Scanner;

class Linear_last_occurence_02{
    public static int linearSearch(int arr[] , int target){

        int resultantIndex = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                resultantIndex = i;;
            }
        }

        return resultantIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int length = sc.nextInt();
        int arr[] = new int[length];

        for(int i=0; i<length; i++){
            System.out.print("Enter the element on index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        
        System.out.print("\nEnter the targeted element you want to search : ");
        int target = sc.nextInt();
        sc.close();

        int result = linearSearch(arr , target);

        if(result == -1){
            System.out.println("\nSorry targeted element " + target + " does not exist");
        }else{
            System.out.println("\nLast occurence of the element " + target + " exist on index : " + result);
        }
    }
}