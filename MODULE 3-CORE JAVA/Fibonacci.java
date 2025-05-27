import java.util.*;
public class Fibonacci {
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(fib(n));
        sc.close();
    }
       static int fib(int n){
        if(n==0||n==1)
        return n;
        else{
        return fib(n-1)+fib(n-2);
       }
        
}
}
