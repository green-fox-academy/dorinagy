import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.21..
 */
public class SumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a number!");
        int userInput = scanner.nextInt();
        System.out.println("Type in a number again!");
        int userInput2 = scanner.nextInt();
        System.out.println("Type in a number again!");
        int userInput3 = scanner.nextInt();
        System.out.println("Type in a number again!");
        int userInput4 = scanner.nextInt();
        System.out.println("Type in a number again!");
        int userInput5 = scanner.nextInt();
        int sum = (userInput + userInput2 + userInput3 + userInput4 + userInput5);
        int average = (userInput + userInput2 + userInput3 + userInput4 + userInput5) / 5;
        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}
