package company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberLeft;
        int numberRight;
        Scanner scanner = new Scanner(System.in);

        System.out.format("Enter first number");
        numberLeft = scanner.nextInt();

        System.out.format("Enter second number");
        numberRight = scanner.nextInt();

        System.out.format("Enter command");
        String command = scanner.next();

        if ("+".equals(command)) {
            System.out.format("a + b = %d", numberLeft + numberRight);
        } else if ("-".equals(command)) {
            System.out.format("a - b = %d", numberLeft - numberRight);
        }





    }
}
