import java.util.Scanner;
public class Traingle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the triangle (1-5): ");
        int n = sc.nextInt();
        if (n < 1 || n > 5) {
            System.out.println("Invalid height");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
