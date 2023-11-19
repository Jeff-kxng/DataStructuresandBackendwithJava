package Arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {

        // Declear and Assign
        int[] marks = new int[]{10, 20, 30, 40, 50};

        for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("^^^^^^^^^^^^^^^");

        for (int value : marks){
            System.out.println(value);
        }
    }
}
/*
One Dimensional Array in Java

A one-dimensional array in Java is a collection of similar types of elements stored at contiguous memory locations. The data is stored in a continuous manner, which makes operations like search, delete, insert etc., much easier.
 */