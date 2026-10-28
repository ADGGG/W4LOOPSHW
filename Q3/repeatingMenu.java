import java.util.Scanner;
public class repeatingMenu {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String choice;
        do {
            System.out.println("1 Play");
            System.out.println("2 Scores");
            System.out.println("Q Quit");
            System.out.println("Enter your choice: ");
            choice = sc.nextLine();
            if (choice.equals("1")){
            System.out.println("Playing");
        } else if (choice.equals("2")){
            System.out.println("Scores");
        } else if (choice.equalsIgnoreCase("Q")){
            System.out.println("Goodbye");
        } else {
            System.out.println("Invalid choice");
        }
        } while (!choice.equalsIgnoreCase("Q"));
        
        sc.close();

    }

    
}
