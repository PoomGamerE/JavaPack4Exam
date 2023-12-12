/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilPhiravit;

public class Tool072 {

    public static boolean isUsable072(String input) {
        return input != null && !input.trim().isEmpty();
    }

    public static boolean isUsable072(Object[] inputArray) {
        return inputArray != null && inputArray.length > 0;
    }

    public static int count072(Object[] inputArray) {
        // Check if the input array is usable
        if (!isUsable072(inputArray)) {
            return -1;
        }

        // Return the number of objects in the array
        return inputArray.length;
    }
}
