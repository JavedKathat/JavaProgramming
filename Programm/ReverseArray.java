public class ReverseArray {
    public static void reverseMyArray(int[] arr) {
        int l = arr.length;

        for (int i = 0; i < l/2; i++) {
            int temp =arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp; 
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5} ;
        System.out.println("Reverse this given array : ");
        for(int x : arr) {
            System.out.print(x+" ");
        }
        reverseMyArray(arr);

        System.out.println("Reversed Array is : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}