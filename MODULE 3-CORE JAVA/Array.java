import java.util.*;
public class Array {
    public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int []a=new int [n];
     int sum=0;
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        sum=sum+a[i];
     }
     int avg=sum/n;
     System.out.print("Sum: "+sum+"\n"+"Average: "+avg);
     sc.close();
    }
}
