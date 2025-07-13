import java.util.Scanner;

public class array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int pos = 0, neg = 0;
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] >= 0)
                pos++;
            else
                neg++;
        }

        System.out.println("Positive numbers: " + pos);
        System.out.println("Negative numbers: " + neg);
    }
}

