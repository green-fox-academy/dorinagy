import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.21..
 */
public class Bigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number:");
        int userInput1 = scanner.nextInt();
        System.out.println("Type a number again:");
        int userInput2 = scanner.nextInt();
        if (userInput1 >= userInput2) {
            System.out.println("The second number should be bigger");
        }
        if (userInput2 > userInput1) {
            int counter = userInput1;
            while (userInput2 > counter) {
                System.out.println(counter);
                counter = counter + 1;
            }
        }
    }
}
