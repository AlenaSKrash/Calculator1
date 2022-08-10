package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Calculator c1 = new Calculator();

            System.out.println(c1.calculate());

            System.out.println("Play again? Y/n");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("Y")) {
                break;
            }

        }
    }
}
