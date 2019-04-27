package company;

import java.util.Scanner;

public class isValidFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(isFormulaValid(input));
    }

    public static boolean isFormulaValid (String input){
        int counter = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(') {
                counter++;
            } else if (c == ')') {
                counter--;
            }
        }
        return counter == 0;
    }
}

