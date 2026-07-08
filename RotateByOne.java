import java.util.*;
class RotateByOne {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        System.out.print("Enter times to rotate: ");
        int rotate = sc.nextInt();
        //int last = list.size()-1;
        for(int count = 0; count < rotate; count++){

            int last = list.get(list.size()-1);
            list.add(0,last);
            list.remove(list.size()-1);
        }
        System.out.println(list);
    }
}