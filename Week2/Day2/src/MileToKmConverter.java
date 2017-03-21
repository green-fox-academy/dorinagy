import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.21..
 */
public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the distance in km!");
        int userInput = scanner.nextInt();
        double kmToMile = (userInput * 0.621371192);
        System.out.println(kmToMile);
    }
}
