import java.util.Scanner;

public class array13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] original = new int[n];
        int[] copy = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }

        // Copy
        for(int i = 0; i < n; i++) {
            copy[i] = original[i];
        }

        System.out.println("Copied array:");
        for(int i = 0; i < n; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}

