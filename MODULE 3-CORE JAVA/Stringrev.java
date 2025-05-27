import java.util.*;
public class Stringrev {
   public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String ss="";
    for(int i=s.length()-1;i>=0;i--){
       ss+=s.charAt(i);
    }
    System.out.print(ss);
    sc.close();
   } 
}
