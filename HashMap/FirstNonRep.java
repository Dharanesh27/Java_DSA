import java.util.*;
class FirstNonRep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
        for(int i = 0; i < n; i++) {
            if(map.get(arr[i]) == 1) {
                System.out.println("First non repeating element is: " + arr[i]);
                break;
            }
        }
    }
}