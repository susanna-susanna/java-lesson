package company;

import java.util.Scanner;

public class taskManager {

    /*public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите задачу в формате: Название задачи, старт в 15 ч, финиш в 19 ч");
        String input = scanner.nextLine();
        int startPos = input.indexOf("старт в");
        String startTimeString = input.substring(startPos + 7, startPos + 10);
        startTimeString = startTimeString.trim();
        int startTime = Integer.parseInt(startTimeString);

        int endPos = input.indexOf("финиш в");
        String endTimeString = input.substring(endPos + 7, endPos + 10);
        endTimeString = endTimeString.trim();
        int endTime = Integer.parseInt(endTimeString);

        int result = endTime - startTime;
        if (result < 0) {
            throw new Exception("Error input string" + input);
        }

        System.out.println("На задачу потребуется: " + result + " ч.");
    }*/

    public static void main(String[] args) {
        int team = 3; //программист, дизайнер, тестировщик - количество участников команды
        int maxHours = 40; //максимальное количество рабочих часов для каждого участника команды
        System.out.println("Вас приветствует программа планировщик задач!");
        System.out.println("Давайте запланируем задачи на следующую неделю для команды.");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < team; i++) {
            System.out.println("Введите для кого планируем?");
            String inputName = scanner.nextLine();
            System.out.println("Введите название задачи:");
            String inputNameOfTask = scanner.nextLine();
            System.out.println("Количество часов на задачу:");
            int value = scanner.nextInt();
            int totalHours = 0;

            while (totalHours < 40) {

                totalHours += value;
                if (totalHours > 40) {
                    System.out.println("Задача слишком большая, нужно выбрать другую");
                    break;
                }
                System.out.println("Все 40 часов запланированы");

            }

        }
    }


}
