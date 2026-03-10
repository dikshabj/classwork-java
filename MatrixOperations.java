import java.util.*;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rows and Columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // 1. Sum of all elements
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("\n1. Sum of all elements: " + sum);

        // 2. Finding Maximum Element
        int max = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("2. Maximum element: " + max);

        // 3. Search for a number
        System.out.println("\nEnter a number to search in matrix: ");
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("3. Found " + target + " at position: (" + i + "," + j + ")");
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }
        if (!found)
            System.out.println("3. Number not found!");

        // 4. Transpose (Best for logic building)
        // Rows columns ban jayenge, aur columns rows.
        System.out.println("\n4. Original Matrix:");
        printMatrix(matrix);

        System.out.println("Transpose of Matrix (Rows <-> Columns):");
        for (int j = 0; j < cols; j++) { // Column loop outer ban gaya
            for (int i = 0; i < rows; i++) { // Row loop inner ban gaya
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Helper method to print matrix
    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
