package HW_sem3;

import java.util.Scanner;

public class View {

    public static void getData() {
        Scanner data = new Scanner(System.in);
        System.out.println("Введите через пробел фамилию имя дату рождения (в формате dd.mm.yyyy) номер телефона (в формате 81234567890, пол буквами f или m ) : ");
        System.out.println("Или введите exit для выхода");
        boolean run = true;
        while (run) {
            String[] arrayData = data.nextLine().split(" ");
            if (arrayData[0].equalsIgnoreCase("exit")) {
                break;
            }
            CheckData.dataValidation(arrayData);
        }
    }
}


