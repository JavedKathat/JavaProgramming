package StarPatternPrograms;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter number of star: ");
        int n= in.nextInt();
        for(int i=1; i<=n*2; i++) {
            if(i<=n) {
                for(int j= 1; j<=i; j++) {
                    System.out.print("*");
                }
                for(int j=1; j<=(2*n)-(2*i); j++) {
                    System.out.print(" ");
                }
                for(int j= 1; j<=i; j++) {
                    System.out.print("*");
                }
            }
            else {
                for(int j= 1; j<=2*n-i+1; j++) {
                    System.out.print("*");
                }
                for(int j= 1; j<=2*i-2*n-2; j++) {
                    System.out.print(" ");
                }
                for(int j= 1; j<=2*n-i+1; j++) {
                    System.out.print("*");
                }
            }
            
            System.out.println();
        }
        in.close();
    }
}
