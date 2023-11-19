package Arrays;

public class Main {
    public static void main(String[] args) {
        // Creating instances of Student class
        Student student1 = new Student(1, "Alice", 20);
        Student student2 = new Student(2, "Bob", 21);

        // Displaying student information
        System.out.println("Student 1:");
        student1.displayInfo();

        System.out.println("\nStudent 2:");
        student2.displayInfo();
    }
}
