package company;

import java.util.Scanner;

class taskLesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = "";
        double result = 0;

        while (true) {

            System.out.println("Введите два числа и тип операции (+,-,*,/)");

            int value1 = scanner.nextInt();
            int value2 = scanner.nextInt();
            operation = scanner.next();

            if ("0".equals(operation)) {
                break;
            }

            switch (operation) {
                case "+" : result = value1 + value2;
                    break;
                case "-" : result = value1 - value2;
                    break;
                case "*" : result = value1 * value2;
                    break;
                case "/" : result = (double)value1 / value2;
                    break;

            }
            System.out.println("Результат операции = " + result);
        }
    }

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTime = 0;
        int biggestTime = 0;
        int smallestTime = 0;

        while (true) {
            System.out.println("Введите необходимое количесво времени, необходимое для реализации задачи в формате \"HH\"  \"HH\" \"HH\" ");
            int days = scanner.nextInt();
            int hours = scanner.nextInt();
            int minutes = scanner.nextInt();

            int currentTimeTask = convertToSeconds(days, hours, minutes);
            totalTime = currentTimeTask;
            biggestTime = currentTimeTask;
            smallestTime = currentTimeTask;

            System.out.println("Для завершения работы программы введите 'end'. Для продолжения нажмите 'enter'. ");
            String input = scanner.nextLine();

            if ("end".equals(input)) {
                break;
            }
            System.out.println("Всего потребуется: " + totalTime + " секунд");

            if ("enter".equals(input)) {
                //int currentTimeTask = convertToSeconds();
                totalTime = totalTime + currentTimeTask;

                if (currentTimeTask > biggestTime) {
                    biggestTime = currentTimeTask;
                }

                if (currentTimeTask < smallestTime || smallestTime == 0) {
                    smallestTime = currentTimeTask;
                }

            }

            System.out.println("Всего потребуется: " + totalTime + " секунд");
            System.out.println("Самая продолжительнаязадача займет: " + biggestTime + " секунд");
            System.out.println("Самая коротка задача займет: " + smallestTime + " секунд");
        }
    }
    private static int convertToSeconds(int days, int hours, int minutes) {
        int seconds = days * 24 * 3600 + hours * 3600 + minutes * 60;

        return seconds;
    }*/
}
