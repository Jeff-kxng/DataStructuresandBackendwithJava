package Arrays;

public class Student {

    // Attributes of the student class
    private int rollNumber;

    private String name;

    private int age;

    // Constructor to initialize Student attributes
    public Student(int rollNumber, String name, int age){

        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;

    }

    // Getter and Setter methods for attributes
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display student information
    public void displayInfo() {

        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);

    }
}
