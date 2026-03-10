import java.util.*;

public class class11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target: ");
        int target = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found at indices: " + i + " " + j);

                }
            }

        }
    }
}
