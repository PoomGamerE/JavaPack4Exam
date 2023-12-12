public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        printArray(numbers);

        increaseArrayElements(numbers, 2);
        System.out.println("Array after increasing elements by 2:");
        printArray(numbers);

        decreaseArrayElements(numbers, 1);
        System.out.println("Array after decreasing elements by 1:");
        printArray(numbers);

        int[] newArray = {1, 2, 3, 4, 5}; // New array for comparison
        System.out.println("Are the arrays equal? " + areArraysEqual(numbers, newArray));
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void increaseArrayElements(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += value;
        }
    }

    private static void decreaseArrayElements(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= value;
        }
    }

    private static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
