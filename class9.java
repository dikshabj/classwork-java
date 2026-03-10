import java.util.*;

public class class9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // sum of primary diagonal elements in matrix
        System.out.println("Enter no of rows: ");
        int n1 = sc.nextInt();
        System.out.println("Enter no of columns: ");
        int n2 = sc.nextInt();
        int arr[][] = new int[n1][n2];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of primary diagonal elements is: " + sum);
    }
}
