package Arrays;

import java.util.Scanner;

public class OneDimensionalArrayInput {
    public static void main(String[] args) {
        // Creating object of scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of Array: ");
        int arrLength = sc.nextInt();

        int[] anArray = new int[arrLength];
        System.out.println("Enter the elements of the Array");
        for (int i = 0; i < arrLength; i++){
            // taking array input
            anArray[i] =sc.nextInt();
        }

        System.out.println("One dimensional arrays elements are : ");
        for (int i = 0; i < arrLength; i++){
            // printing array elements
            System.out.print(anArray[i] + " ");
        }
    }
}
