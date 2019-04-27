package company;

import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите дату в формате yyyy-MM-dd-HH-mm-ss");
            String inputDate = scanner.next();
            //Передаем данные в функцию isValidDateFormat
            //isValidDateFormat (inputDate);

            try {
                isValidDateFormat (inputDate);
                boolean result = isValidDateFormat(inputDate);
                System.out.println("Result =" + result);
                break;
            }
            catch (Exception e) {
                System.out.println("Формат даты не корректный, введите данные еще раз!");
            }
        }
    }
    //Функция проверки на правильность формата
    static boolean isValidDateFormat (String inputDate) {
        String dateFormat = "yyyy-MM-dd-HH-mm-ss";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(dateFormat);

        TemporalAccessor parsedDate = dateFormatter.parse(inputDate);
        if (parsedDate != null){
            return true;
        }
        return false;
    }

}