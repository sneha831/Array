import java.util.Scanner;

public class array11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Replace negatives with 0
        for(int i = 0; i < n; i++) {
            if(arr[i] < 0) {
                arr[i] = 0;
            }
        }

        System.out.println("Array after replacing negatives with 0:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

