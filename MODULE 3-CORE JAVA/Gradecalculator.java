import java.util.*;
public class Gradecalculator {
   public static void main(String x[]){
    Scanner sc=new Scanner (System.in);
    int m=sc.nextInt();
    if(m>=90 && m<=100)
     System.out.print("A");
    else if(m>=80 && m<=89)
     System.out.print("B");
     else if(m>=70 && m<=79)
     System.out.print("C");
     else if(m>=60 && m<=69)
     System.out.print("D");
     else
     System.out.print("F");
     sc.close();
}
   } 
   
