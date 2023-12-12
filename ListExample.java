import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Original list:");
        printList(names);

        increaseListElements(names, "!");
        System.out.println("List after increasing elements with '!':");
        printList(names);

        decreaseListElements(names, "!");
        System.out.println("List after decreasing elements with '!':");
        printList(names);

        List<String> newList = new ArrayList<>(List.of("Alice", "Bob", "Charlie")); // New list for comparison
        System.out.println("Are the lists equal? " + areListsEqual(names, newList));
    }

    private static void printList(List<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }

    private static void increaseListElements(List<String> list, String value) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + value);
        }
    }

    private static void decreaseListElements(List<String> list, String value) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).replace(value, ""));
        }
    }

    private static boolean areListsEqual(List<String> list1, List<String> list2) {
        return list1.equals(list2);
    }
}
