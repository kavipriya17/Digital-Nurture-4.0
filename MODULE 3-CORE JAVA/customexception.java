import java.util.*;
class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
public class customexception {
    public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    try{
        check(age);
        System.out.println("Valid Age");
    }
    catch(InvalidAgeException e){
        System.out.println(e.getMessage());
    }
    sc.close();
    }
   public static void check(int a) throws InvalidAgeException{
        if(a<18)
        throw new InvalidAgeException("Invalid Age-Age must be greater than 18");
    }
    
}
