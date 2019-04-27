package company;

import java.util.Scanner;

public class ITry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        double totalTime = 0;

        while (!"всё".equals(input)) {

            System.out.println("Введите название задачи (для завершения введите всё)");
            input = scanner.nextLine();
            if ("всё".equalsIgnoreCase(input)) {
                break;
            }

            System.out.println("Сколько времени потребуется на выполнение задачи?");
            int time = scanner.nextInt();
            String unit = scanner.next();
            scanner.nextLine();

            switch (unit) {
                case "ч":
                    time = time * 3600;
                    break;
                case "м":
                    time = time * 60;
                    break;
            }

            totalTime += time;
        }

        if (totalTime > 0) {
            System.out.println("В какой единице измерения вернуть значение (ч - часы, м - минуты, c - секунды)");
            String unit = scanner.next();
            scanner.nextLine();

            switch (unit) {
                case "ч" : totalTime = (double)totalTime / 3600;
                    break;
                case "м" : totalTime = (double)totalTime / 60;
                    break;
            }
                System.out.println(totalTime + " " + unit);
        }

    }
}
