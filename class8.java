import java.util.*;

public class class8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        // max element
        int max = arr[0][0];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        int min = arr[0][0];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        System.out.println("Max element is: " + max);
        System.out.println("Min element is: " + min);
        System.out.println("The given matrix is: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
