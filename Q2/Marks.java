import java.util.Scanner;
public class marks {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        System.out.println("Enter the counters: ");
        int counter = sc.nextInt();
        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();
        
        while (marks != -1) {
            if (marks >= 0 && marks <= 100) {
                sum += marks;
                count++;
            } else if (marks < 0 || marks > 100) {
                System.out.println("Invalid mark");
            } 
            System.out.println("Enter the marks: ");
            marks = sc.nextInt();
        }
        if (marks == -1 && count == 0) {
            System.out.println("No valid marks");
        } else {
            double average = (double) sum / count;
            System.out.print("Count "+ count + ", ");
            System.out.printf("average %.2f\n", average);
            sc.close();
        }
    }
        
    }
