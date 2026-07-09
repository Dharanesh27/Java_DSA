
import java.util.*;

class Freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        for(Character ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Character key : map.keySet()){
            System.out.println(key + "=" + map.get(key));
        }
    }
}
