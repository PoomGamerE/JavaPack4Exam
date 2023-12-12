public class TrafficLightExample {
    public static void main(String[] args) {
        TrafficLightColor color = TrafficLightColor.RED;

        System.out.println("Current Traffic Light Color: " + color);

        // Switch-case statement to simulate traffic light transitions
        switch (color) {
            case RED -> {
                System.out.println("Stop! The light is red.");
                color = TrafficLightColor.GREEN;
            }
            case YELLOW -> {
                System.out.println("Prepare to stop. The light is yellow.");
                color = TrafficLightColor.RED;
            }
            case GREEN -> {
                System.out.println("Go! The light is green.");
                color = TrafficLightColor.YELLOW;
            }
        }

        System.out.println("Next Traffic Light Color: " + color);

        // Example of using var for type inference
        var message = "This is an example of var.";
        System.out.println(message);

        // Uncommenting the line below would result in a compilation error
        // message = 42; // Error: incompatible types: int cannot be converted to java.lang.String
    }
}

// Enum to represent traffic light colors
enum TrafficLightColor {
    RED, YELLOW, GREEN
}
