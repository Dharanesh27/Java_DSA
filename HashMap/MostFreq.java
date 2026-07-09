
import java.util.*;

class MostFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        while(num > 0) {
            int n = num % 10;
            map.put(n,map.getOrDefault(n,0)+1);
            num = num / 10;
        }
        System.out.println(map);
        int maxF = 0;
        int maxD = 0;
        for(int c : map.keySet()){
            if(map.get(c) > maxF){
                maxF = map.get(c);
                maxD = c; 
            }
        }
        System.out.println(maxD);

    }
}