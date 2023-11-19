package Arrays;

public class TwoDArray {

    public static void main(String[] args) {
        int rows = 4;
        int columns = 4;

        int[][] arr = new int[rows][columns];

        int value = 1;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                arr[i][j] = value;
                value++;
            }
        }
        System.out.println("The 2D arrays is : ");

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
