public class class12 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        System.out.println("Spiral Matrix Traversal:");

        while (top <= bottom && left <= right) {
            // 1. Traverse Right →
            for (int i = left; i <= right; i++)
                System.out.print(matrix[top][i] + " ");
            top++;

            // 2. Traverse Down ↓
            for (int i = top; i <= bottom; i++)
                System.out.print(matrix[i][right] + " ");
            right--;

            // 3. Traverse Left ←
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(matrix[bottom][i] + " ");
                bottom--;
            }

            // 4. Traverse Up ↑
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(matrix[i][left] + " ");
                left++;
            }
        }
    }
}
