import java.util.Scanner;

public class MinMaxFinder {

    public static int setMin(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(min>arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int setMax(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Minimum element is :"+ setMin(arr, n));
        System.out.println("Maximum element is :"+ setMax(arr, n));
        sc.close();
    }

}
