class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void increaseAge(int years) {
        this.age += years;
    }

    public void decreaseAge(int years) {
        this.age -= years;
    }

    public boolean isEqual(Person otherPerson) {
        return this.name.equals(otherPerson.name) && this.age == otherPerson.age;
    }
}

public class ObjectExample {
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 25);

        System.out.println("Original person details:");
        person1.displayInfo();

        person1.increaseAge(2);
        System.out.println("Person details after increasing age by 2 years:");
        person1.displayInfo();

        person1.decreaseAge(1);
        System.out.println("Person details after decreasing age by 1 year:");
        person1.displayInfo();

        Person person2 = new Person("John Doe", 26); // New person for comparison
        System.out.println("Are the persons equal? " + person1.isEqual(person2));
    }
}
