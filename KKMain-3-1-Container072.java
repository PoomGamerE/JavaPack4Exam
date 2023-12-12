package valuePhiravit;

public class Container072 {

    private final Item072[] items = new Item072[72];

    // Constructor (optional, depending on your needs)
    public Container072() {
        // Initialize the items array or perform other setup if needed
        // For example, you can loop through the array and initialize each element
        for (int i = 0; i < items.length; i++) {
            items[i] = new Item072();
        }
    }

    // Other methods can be added here based on your requirements
    // For example, methods to manipulate or retrieve items in the container
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Number of Item072 objects: ").append(items.length).append("\n");

        for (Item072 item : items) {
            if (item != null) {
                result.append(item.toString()).append("\n");
            }
        }

        return result.toString();
    }

    public boolean add(Item072 item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null || items[i].equals(item)) {
                items[i] = item;
                return true;
            }
        }
        return false; // If no match is found and no empty slots are available
    }

    public boolean remove(Item072 item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item)) {
                // If item matches an existing item, remove it from the array
                items[i] = null;
                return true;
            }
        }

        // If no match is found, return false
        return false;
    }
}
