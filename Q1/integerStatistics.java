import java.util.Scanner;
public class integerStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of counters: ");
        int n = sc.nextInt();
        int sum = 0;
        double average = 0.0;
        int count = 0;
        if (n==0) {
            System.out.println("No input");
        }
        else if (n<0) {
            System.out.println("Invalid count");
        } else {
        while (count < n) {
            System.out.println("Enter the number:");
            int num = sc.nextInt();
            sum += num;
            count++;           
        }
        average = (double) sum / count;
        System.out.printf("Average:%.2f" , average);
        sc.close();
    }
   
    }
}
