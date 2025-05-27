import java.util.*;
public class Factorial {
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;
        for(;num!=0;num--){
            fact=fact*(num);
        }
        System.out.print(fact);
        sc.close();
    }
}
