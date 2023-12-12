package valuePhiravit;

public class Item072 {

    // Private final field "name" of type String
    private final String name;

    // Private field "amount" of type int
    private int amount;

    // Public constructor with name and amount arguments
    public Item072(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    // Private constructor for direct setting of name and amount without checking
    private Item072(String name, int amount, boolean directSet) {
        this.name = name;
        this.amount = amount;
    }

    // Public static method to create Item072 objects
    public static Item072 create(String name, int amount) {
        // Check if the name is usable according to your requirements in 1.2
        if (isNameUsable(name) && amount > 0) {
            return new Item072(name, amount);
        } else {
            return null;
        }
    }

    Item072() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getter method for the "name" field
    public String getName() {
        return name;
    }

    // Getter method for the "amount" field
    public int getAmount() {
        return amount;
    }

    // Setter method for the "amount" field
    public void setAmount(int amount) {
        this.amount = amount;
    }

    // Method to display information about the item
    public void displayItemInfo() {
        System.out.println("Item Name: " + name);
        System.out.println("Amount: " + amount);
    }

    // Example of a method to check if the name is usable (replace with your logic)
    private static boolean isNameUsable(String name) {
        // Replace this with your logic to check if the name is usable
        return name != null && !name.trim().isEmpty();
    }

    // Override toString method
    @Override
    public String toString() {
        return "(" + name + "," + amount + ")";
    }

    // Public method to add amounts of two items
    public int add(Item072 item) {
        // Add the amounts and update the current object's amount
        int sum = this.amount + item.getAmount();
        this.amount = sum;
        return sum;
    }

    public boolean isMatched(Item072 item) {
        // Check if the names match
        return this.name.equals(item.getName());
    }
}
