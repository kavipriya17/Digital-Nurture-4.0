import java.util.*;
public class Arraylist {
    public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
     ArrayList<String> arr=new ArrayList<>();
     while(sc.hasNext()){
        arr.add(sc.next());
     }
     for(int i=0;i<arr.size();i++){
     System.out.println(arr.get(i));
     }
     sc.close();
    }
}
