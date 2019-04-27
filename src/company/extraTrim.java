package company;

import java.util.Scanner;

public class extraTrim {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String input = scanner.nextLine();
        String regex = "\\s+";
        input = input.trim();
        String inputTrimmed = input;
        inputTrimmed = inputTrimmed.replaceAll(regex, " ");
        String result = inputTrimmed;
        System.out.println("Результат работы пограммы: " + result);
    }
}



    /*public static void main (String[] agrs) {
		...
        Scanner ...
		...
        String value2 = extraTrim(value);
        System.out.println("Результат работы пограммы: " + value2);
    }

    public static String extraTrim(String value) {
		...
    }
*/