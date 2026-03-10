import java.util.*;

public class class5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

        // to find armstrong number without using pow function
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int sum = 0;
            int count = 0;
            while (num > 0) {
                int digit = num % 10;
                count++;
                num = num / 10;

            }
            num = arr[i];
            while (num > 0) {
                int digit = num % 10;
                int power = 1;
                for (int j = 0; j < count; j++) {
                    power *= digit;
                }
                sum += power;
                num = num / 10;

            }
            if (sum == arr[i]) {
                System.out.println("Armstrong number" + arr[i]);
            } else {
                System.out.println("Not an Armstrong number" + arr[i]);
            }

        }

    }
}
