// Java Program to left rotate the array by d positions
// by rotating one element at a time

import java.util.Scanner;

public class arrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of Rotation: ");
        int d = sc.nextInt(); 
        
        //o/p -> {3,4,5,6,1,2}
        while (d != 0) {
            int temp = arr[0];

            for (int i = 0; i < n-1; i++) {
                arr[i] = arr[i+1];
            }
            arr[n-1] = temp;
            --d;
        }

        for(int x: arr) {
            System.out.print(x+" ");
        }
        sc.close();
    }
}
