package com.mycompany.kkexampletest1;

import utilPhiravit.*;
import valuePhiravit.*;

/**
 *
 * @author Phiravit
 */
public class KKExampleTest1 {

    public static void main(String[] args) {
        testTool072();
        testItem072();
        testContainer072();
    }

    public static void testTool072() {
        // Test isUsable072 with String
        String strInput = "Hello, World!";
        System.out.println("isUsable072(String): " + Tool072.isUsable072(strInput));  // Should print true

        // Test isUsable072 with Object[]
        Object[] arrayInput = {1, 2, 3};
        System.out.println("isUsable072(Object[]): " + Tool072.isUsable072(arrayInput));  // Should print true

        // Test count072 with Object[]
        System.out.println("count072(Object[]): " + Tool072.count072(arrayInput));  // Should print 3

        // Test count072 with unusable Object[]
        Object[] emptyArray = {};
        System.out.println("count072(Unusable Object[]): " + Tool072.count072(emptyArray));  // Should print -1

       
    }

    public static void testItem072() {
        // Test create method in Item072
        Item072 item1 = Item072.create("Item1", 10);
        Item072 item2 = Item072.create("Item2", 20);
        Item072 item3 = Item072.create("Item1", 30);

        System.out.println("Item1: " + item1); // Should print "(Item1, 10)"
        System.out.println("Item2: " + item2); // Should print "(Item2, 20)"
        System.out.println("Item3: " + item3); // Should print null

        // Test add method in Item072
        item1.add(item2);
        System.out.println("Item1 after adding Item2: " + item1.getAmount()); // Should print 30

        // Test isMatched method in Item072
        System.out.println("Item1 matches Item3: " + item1.isMatched(item3)); // Should print true
    }

    public static void testContainer072() {
        // Test your Container072 class here

        // Create a container
        Container072 container = new Container072();

        // Display the initial state
        System.out.println("Initial Container State:");
        System.out.println(container);

        // Create some items for testing
        Item072 item1 = Item072.create("Item1", 10);
        Item072 item2 = Item072.create("Item2", 20);
        Item072 item3 = Item072.create("Item3", 30);

        // Add items to the container
        container.add(item1);
        container.add(item2);
        container.add(item3);

        // Display the container state after adding items
        System.out.println("Container State After Adding Items:");
        System.out.println(container);

        // Remove an item from the container
        container.remove(item2);

        // Display the container state after removing an item
        System.out.println("Container State After Removing Item2:");
        System.out.println(container);

    }
}
