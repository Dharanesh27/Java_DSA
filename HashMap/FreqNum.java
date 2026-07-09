
import java.util.*;

class FreqNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        int num = sc.nextInt();
        while(num > 0){
            int n = num %10;
            map.put(n,map.getOrDefault(n,0)+1);
            num = num/10;
        }
        System.out.println(map);
    }
}