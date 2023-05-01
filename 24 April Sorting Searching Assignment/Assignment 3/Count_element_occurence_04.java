import java.util.Scanner;

public class Count_element_occurence_04 {
    public static int elementOccurence(int arr[] , int target){
        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                count++;
                
                if(arr[i] != target){
                    break;
                } 
            }
        }

        return count;
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
        
        System.out.print("\nEnter the targeted element you want to know occurence : ");
        int target = sc.nextInt();
        sc.close();

        int result = elementOccurence(arr , target);

        if(result == -1){
            System.out.println("\nSorry targeted element " + target + " does not exist");
        }else{
            System.out.println("\n Target" + target + " occurs " + result + " times ");
        }
    }
}
