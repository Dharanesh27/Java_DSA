import java.util.*;
class MaximumElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<Integer>();
        int n = sc.nextInt();
        if(n ==0){
            System.out.println("Invalid Input");
        }
        else{
        for (int i =0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        int largest = list.get(0);
        for (int num = 0;num < list.size();num++){
            if(list.get(num) > largest){
                largest = list.get(num);
            }
        }
        System.out.println("Largest: " + largest);
        }
    }
}