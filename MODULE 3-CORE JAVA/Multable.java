import java.util.*;
public class Multable {
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
        sc.close();
    }
}
