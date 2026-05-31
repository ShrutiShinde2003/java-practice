import java.util.Scanner;
public class madlibs {
    public static void main(String[] args) {

        //MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String verb1;
        String adjective2;
        String adjective3;

        System.out.print("Enter an adjective:");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun:");
        noun1 = scanner.nextLine();

        System.out.print("Enter a verb:");
        verb1 = scanner.nextLine();

        System.out.print("Enter another adjective:");
        adjective2 = scanner.nextLine();
        
        System.out.print("Enter one more adjective:");
        adjective3 = scanner.nextLine();

        System.out.println("The " + adjective1 + " " + noun1 + " " + verb1 + " over the " + adjective2 + " " + adjective3 + " dog.");

        scanner.close();
    }

    
}
