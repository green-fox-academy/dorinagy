import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.21..
 */
public class Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many girls came to the party?");
        int userInput = scanner.nextInt();
        System.out.println("How many boys came to the party?");
        int userInput2 = scanner.nextInt();
        if ((userInput == userInput2) && ((userInput + userInput2) > 20)) {
            System.out.println("The party is excellent!");
        }
        if ((userInput + userInput2) > 20) {
            System.out.println("Quite cool party!");
        }
        if ((userInput + userInput2) < 20) {
            System.out.println("Average party...");
        }
        if (userInput == 0) {
            System.out.println("Sausage party");
        }
    }
}