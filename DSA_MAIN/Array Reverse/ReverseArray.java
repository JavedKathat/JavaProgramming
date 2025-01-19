import java.util.Scanner;

public class ReverseArray {
    static void reverseArray(int[] arr) {
        int n = arr.length;

        // Iterate over the first half and for every index i,
        // swap arr[i] with arr[n - i - 1]
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
//        int[] arr = { 1, 4, 3, 2, 6, 5 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Array's size :");
        int n = sc.nextInt();
        System.out.println("Array's elements :");
        int[] arr = new int[n];
        for(int i=0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("Original Array");
        for (int j : arr) System.out.print(j + " ");
        reverseArray(arr);

        System.out.println("\nReversed Array");
        for (int j : arr) System.out.print(j + " ");
    }
}
