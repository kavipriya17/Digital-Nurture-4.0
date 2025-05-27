public class PatternMatch {

    public static void main(String[] args) {
        testType(42);
        testType("Hello");
        testType(3.14);
        testType(true);
    }

    static void testType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("It's an Integer: " + i);
            case String s -> System.out.println("It's a String: " + s);
            case Double d -> System.out.println("It's a Double: " + d);
            default -> System.out.println("Unknown type: " + obj);
        }
    }
}
