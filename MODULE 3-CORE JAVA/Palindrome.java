import java.util.*;
public class Palindrome {
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        String ss="",s,s1;
        s=sc.next();
        s1=s;
        for(int i=s.length()-1;i>=0;i--){
            ss+=s.charAt(i);
        }
       if(s1.equals(ss))
       System.out.print("Palindrome");
       else
       System.out.print("Not a palindrome");
       sc.close();
    }
}
