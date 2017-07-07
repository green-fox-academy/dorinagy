import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.21..
 */
public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String userInput = scanner.nextLine();
        System.out.println("Hello, " + userInput + "!");
    }
}
