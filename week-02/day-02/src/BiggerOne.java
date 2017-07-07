import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.21..
 */
public class BiggerOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number!");
        int userInput = scanner.nextInt();
        System.out.println("Type an other number!");
        int userInput2 = scanner.nextInt();
        if (userInput > userInput2) {
            System.out.println(userInput);
        } else {
            System.out.println(userInput2);
        }
    }
}
