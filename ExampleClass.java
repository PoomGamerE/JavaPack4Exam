public class ExampleClass {
    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        // Calling a static method
        ExampleClass.staticMethod();

        // Creating an instance of the class
        ExampleClass instance = new ExampleClass();

        // Calling a non-static method using the instance
        instance.nonStaticMethod();

        // Note: You can also call a static method using an instance, but it's recommended to use the class name.
        instance.staticMethod(); // Valid, but not recommended
    }
}
