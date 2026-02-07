import java.util.*;

public class class2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array ka size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("I am even " + arr[i]);
            } else {
                System.out.println("I am odd " + arr[i]);
            }
        }

        // searching
        boolean found = false;
        System.out.println("Enter element you want to find:");
        int num = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Element not found.");
        }

        // print array
        System.out.println("Array hai:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
    

