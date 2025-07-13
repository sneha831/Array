import java.util.Scanner;

public class array19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Replace even numbers with -1
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = -1;
            }
        }

        System.out.println("Array after replacing even numbers with -1:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

