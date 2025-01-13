//Reverse an Array using Recursion

public class ReverseArray2 {
    private static void reverseArrayRec(int[] arr, int i, int n) {
        if(i >= n)
        return;

        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        reverseArrayRec(arr, i+1, n-1);
    }

    public static void reverseMyArray(int[] arr) {
        int n = arr.length;

        reverseArrayRec(arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };
        System.out.println("Reverse this given array : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        reverseMyArray(arr);

        System.out.println("\n\nReversed Array using Recursion is : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}