import java.util.*;
public class Methodover {
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(add(a,b));
        System.out.println(add(10.5,4.7));
        System.out.print(add(a,b,c));
        sc.close();
    }
        static int add(int a,int b){
            return a+b;
        }
        static double add(double a,double b){
           return a+b;
        }
       static int add(int a, int b,int c){
           return a+b+c;
        }
}
