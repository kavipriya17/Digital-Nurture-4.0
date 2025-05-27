import java.util.*;

public class Lambda{
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("Banana", "Apple", "Mango", "Cherry", "Date"));
        Collections.sort(fruits, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted list: " + fruits);
    }
}
