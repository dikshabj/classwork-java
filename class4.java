import java.util.*;

public class class4 {
    public static void main(String[] args) {
        int n = 5;
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

        // max number in array
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // min number in array
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max number in array is " + max);
        System.out.println("Min number in Array is : " + min);
        sc.close();
    }
}
