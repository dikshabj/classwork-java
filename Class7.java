public class Class7 {
    public static void main(String[] args) {
        // 1. Declaration and Initialization
        // Syntax: dataType[][] arrayName = new dataType[rows][columns];
        int[][] matrix = new int[2][3]; // 2 rows and 3 columns

        // 2. Assigning values
        matrix[0][0] = 10;
        matrix[0][1] = 20;
        matrix[0][2] = 30;
        matrix[1][0] = 40;
        matrix[1][1] = 50;
        matrix[1][2] = 60;

        // 3. Directly initializing with values
        int[][] anotherMatrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // 4. Accessing and Printing elements using Nested Loops
        System.out.println("2D Array Elements:");
        for (int i = 0; i < anotherMatrix.length; i++) { // Loop for rows
            for (int j = 0; j < anotherMatrix[i].length; j++) { // Loop for columns
                System.out.print(anotherMatrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        // 5. Total number of rows and columns
        System.out.println("Rows: " + anotherMatrix.length);
        System.out.println("Columns in 1st row: " + anotherMatrix[0].length);
    }
}
