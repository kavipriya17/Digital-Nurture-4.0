import java.util.*;
public class Leapyear {
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0 || year%400==0){
            if(year%100!=0){
            System.out.print("The year "+year+" is LeapYear");
            }
        }
        else
         System.out.print("The year "+year+" is Not a LeapYear");
            
         sc.close();
    }
}
