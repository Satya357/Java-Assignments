import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Two_String_05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the RansomNote String : ");
        String ransomNote = sc.next();
        System.out.print("Enter the Magazine String : ");
        String magazine = sc.next();
        sc.close();

        HashMap<Character,Integer> hm1 = new HashMap<>();
        for(int i=0; i<ransomNote.length(); i++){
            hm1.put(ransomNote.charAt(i) , hm1.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }

        HashMap<Character,Integer> hm2 = new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            hm2.put(magazine.charAt(i) , hm2.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        boolean flag = true;
        for(Map.Entry<Character,Integer> e : hm1.entrySet()){
            char character = e.getKey();
            int frequency = e.getValue();

            if(hm2.containsKey(character) && frequency > hm2.get(character)){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("Yes ransomNote string can be created using magazine string");
        }else{
            System.out.println("No ransomNote string can not be created using magazine string");
        }
    }
}