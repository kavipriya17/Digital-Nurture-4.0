import java.util.*;
public class Hashmap {
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        Map<Integer,String> hm=new HashMap<>();
        System.out.println("Enter the total number of Entries:");
        int n=sc.nextInt();
        System.out.println("Enter the IDs and Names:");
        for(int i=0;i<n;i++){
        hm.put(sc.nextInt(),sc.next());
        }
        System.out.println("Enter any one Id:");
        Integer id=sc.nextInt();
        System.out.print(hm.get(id));
    sc.close();
    
}
}
