import java.util.*;
public class Trycatch {
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Error:Trying to Divide by Zero");
        }
        finally{
            System.out.print("Program runned succesfully");
        }
        sc.close();
    }
}
