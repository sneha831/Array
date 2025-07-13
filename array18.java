import java.util.Scanner;

public class array18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to find its index: ");
        int key = sc.nextInt();
        int index = -1;

        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                index = i;
                break;
            }
        }

        if(index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found.");
    }
}

