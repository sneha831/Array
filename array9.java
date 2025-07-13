import java.util.Scanner;

public class array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements at odd indices:");
        for(int i = 1; i < n; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}

