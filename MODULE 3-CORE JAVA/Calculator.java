import java.util.*;
public class Calculator {
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String op=sc.next();
        System.out.print(result(a,b,op));
        sc.close();
    }
    public static int result(int a, int b, String op){
        switch(op){
           case "+":
              return a+b;
           case "-":
             return a-b;
           case "*":
              return a*b;
        case "/":
            return a/b;
        case "%":
             return a%b;
        default:
         return 0;
    }
}
    }
