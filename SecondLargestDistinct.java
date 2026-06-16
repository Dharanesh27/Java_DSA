import java.util.*;
class SecondLargestDistinct{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<2){
            System.out.println("Invalid input: ");
            return;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }            
        int largest = list.get(0);
        Integer secondLargest = null;
        for (int i = 0; i < list.size(); i++) {
                if(list.get(i) > largest){
                    secondLargest = largest;
                    largest = list.get(i); 
                }
                else if(list.get(i) != largest && (secondLargest == null ||  list.get(i)>secondLargest)){
                    secondLargest = list.get(i);
                    
                }            
            }
            if(secondLargest!=null){
                System.out.println("The Second Largest element is:  " + secondLargest);
            }
            else{
                System.out.println("No second largest element");
            }
        }
    }