// MainProgram.java
public class MainProgram {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John", 25);

        // Display initial details
        System.out.println("Initial details:");
        displayPersonDetails(person);

        // Celebrate birthday
        person.celebrateBirthday();

        // Display updated details
        System.out.println("Details after celebrating birthday:");
        displayPersonDetails(person);
    }

    private static void displayPersonDetails(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println();
    }
}
