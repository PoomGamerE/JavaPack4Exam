public class TypeConversionExample {
    public static void main(String[] args) {
        // long to int
        long longValue = 123456789L;
        int intValue = (int) longValue;
        System.out.println("Long to Int: " + intValue);

        // int to long
        int intValue2 = 987654321;
        long longValue2 = (long) intValue2;
        System.out.println("Int to Long: " + longValue2);

        // double to int
        double doubleValue = 1234.5678;
        int intValue3 = (int) doubleValue;
        System.out.println("Double to Int: " + intValue3);

        // int to double
        int intValue4 = 5678;
        double doubleValue2 = (double) intValue4;
        System.out.println("Int to Double: " + doubleValue2);

        // char to int
        char charValue = 'A';
        int intValue5 = (int) charValue;
        System.out.println("Char to Int: " + intValue5);

        // int to char
        int intValue6 = 66; // ASCII value of 'B'
        char charValue2 = (char) intValue6;
        System.out.println("Int to Char: " + charValue2);

        // boolean to String
        boolean boolValue = true;
        String stringValue = String.valueOf(boolValue);
        System.out.println("Boolean to String: " + stringValue);

        // double to float
        double doubleValue3 = 1234.5678;
        float floatValue = (float) doubleValue3;
        System.out.println("Double to Float: " + floatValue);

        // float to double
        float floatValue2 = 9876.543f;
        double doubleValue4 = (double) floatValue2;
        System.out.println("Float to Double: " + doubleValue4);

        // int to float
        int intValue7 = 12345;
        float floatValue3 = (float) intValue7;
        System.out.println("Int to Float: " + floatValue3);

        // float to int
        float floatValue4 = 67.89f;
        int intValue8 = (int) floatValue4;
        System.out.println("Float to Int: " + intValue8);
    }
}
