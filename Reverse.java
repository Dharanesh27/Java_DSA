import java.util.ArrayList;
import java.util.Scanner;
class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        int left = 0;
        int right = list.size()-1;
        while (left<right){
            int temp = list.get(left);
            list.set(left , list.get(right));
            list.set(right , temp);
            left++;
            right--;
        }
        System.out.println(list);
    }
}