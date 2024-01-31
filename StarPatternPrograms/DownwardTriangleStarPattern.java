package StarPatternPrograms;
import java.util.Scanner;

public class DownwardTriangleStarPattern {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter number of star: ");
        int n= in.nextInt();
        for(int i= 1; i<=n; i++) {
            for(int j= 1; j<=n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        in.close();
    }
}
