package Arrays;

public class MultidimesionalArray {
    public static void main(String[] args) {
        int marks[][] = {{10, 11, 12, 13, 14, 15}, {21, 22, 23, 24, 25,}, {31, 32, 33, 34, 35}};

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
/*
Multidimesional Arrays in Java

Multidimensional Arrays can be defined in simple words as array of arrays. Data in multidimensional arrays are stored in tabular form (in row major order).
 */