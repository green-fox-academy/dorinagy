import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.21..
 */
public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chickens does the farmer have?");
        int userInput = scanner.nextInt();
        System.out.println("How many pigs does the farmer have?");
        int userInput2 = scanner.nextInt();
        int legs = (userInput * 2) + (userInput2 * 4);
        System.out.println(legs);
    }
}
