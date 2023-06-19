package HW_sem3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CheckData {
    public static void dataValidation (String[] arr) {
        int count = 0;
        if (arr.length != 6) {
            System.out.println("Вы ввели больше или меньше данных чем требуется, введите строку заново");
            count++;
        } else {
            if (!arr[0].matches("[а-яА-Яa-zA-Z]+")) {
                System.out.println("Неверно введена фамилия, введите строку заново");
                count++;
            }
            if (!arr[1].matches("[а-яА-Яa-zA-Z]+")) {
                System.out.println("Неверно введено имя, введите строку заново");
                count++;
            }
            if (!arr[2].matches("[а-яА-Яa-zA-Z]+")) {
                System.out.println("Неверно введена отчество, введите строку заново");
                count++;
            }
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
            try {
                df.parse(arr[3]);
            } catch (ParseException e) {
                System.out.println("Неверный формат даты, введите строку заново");
                count++;
            }
            try {
                Long.parseLong(arr[4]);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат телефона, введите строку заново");
                count++;
            }
            if (!arr[5].equalsIgnoreCase("f") && !arr[5].equalsIgnoreCase("m")) {
                System.out.println("Неверно введен пол, введите строку заново");
                count++;
            }
        }
        if (count == 0) {
            StringBuilder text = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    text.append(arr[i]);
                } else {
                    text.append(arr[i]).append(" ");
                }
            }
            CreatingFile.creatingFile(text.toString(), arr[0]);
        }
    }
}