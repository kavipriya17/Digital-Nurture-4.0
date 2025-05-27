import java.util.*;
public class Numberguess {
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Guess the number!");
        Random r=new Random();
        int num = r.nextInt(100) + 1;  
        int a=sc.nextInt();
        while(a!=num){
            if(a>num)
            System.out.println("It is too high...");
            else if(a< num)
            System.out.println("You can guess a number bigger than it...");
            a=sc.nextInt();

        }
        System.out.print("Yes...You find it correctly");
        sc.close();
    }
    
}
