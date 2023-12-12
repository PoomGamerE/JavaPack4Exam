import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        // Example 1: Joining strings with a delimiter
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("Apple");
        joiner1.add("Banana");
        joiner1.add("Orange");
        String result1 = joiner1.toString();

        System.out.println("Example 1: " + result1);

        // Example 2: Joining strings with a delimiter and prefix/suffix
        StringJoiner joiner2 = new StringJoiner(" | ", "[", "]");
        joiner2.add("Red");
        joiner2.add("Green");
        joiner2.add("Blue");
        String result2 = joiner2.toString();

        System.out.println("Example 2: " + result2);

        // Example 3: Joining strings from an array
        String[] colors = {"Yellow", "Purple", "Brown"};
        StringJoiner joiner3 = new StringJoiner(" | ", "{", "}");
        
        for (String color : colors) {
            joiner3.add(color);
        }
        
        String result3 = joiner3.toString();

        System.out.println("Example 3: " + result3);
    }
}
