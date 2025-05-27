import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        // Use Stream API to filter even numbers and collect them into a list
        List<Integer> eNum = num.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        // Display the even numbers
        System.out.println("Even numbers: " + eNum);
    }
}
