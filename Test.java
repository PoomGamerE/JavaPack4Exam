public class Test {
    public static void main(String[] args) {
        testArrayExample();
        testExampleClass();
        testListExample();
        testObjectExample();
        testStringJoinerExample();
        testTrafficLightExample();
        testTypeConversionExample();
    }

    private static void testArrayExample() {
        System.out.println("=== Testing ArrayExample ===");
        ArrayExample.main(new String[0]);
        System.out.println("===========================");
    }

    private static void testExampleClass() {
        System.out.println("=== Testing ExampleClass ===");
        ExampleClass.main(new String[0]);
        System.out.println("============================");
    }

    private static void testListExample() {
        System.out.println("=== Testing ListExample ===");
        ListExample.main(new String[0]);
        System.out.println("===========================");
    }

    private static void testObjectExample() {
        System.out.println("=== Testing ObjectExample ===");
        ObjectExample.main(new String[0]);
        System.out.println("============================");
    }

    private static void testStringJoinerExample() {
        System.out.println("=== Testing StringJoinerExample ===");
        StringJoinerExample.main(new String[0]);
        System.out.println("=============================");
    }

    private static void testTrafficLightExample() {
        System.out.println("=== Testing TrafficLightExample ===");
        TrafficLightExample.main(new String[0]);
        System.out.println("===============================");
    }

    private static void testTypeConversionExample() {
        System.out.println("=== Testing TypeConversionExample ===");
        TypeConversionExample.main(new String[0]);
        System.out.println("===============================");
    }
}
