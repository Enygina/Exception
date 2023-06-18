import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HW_sem2 {
    public static void main(String[] args) {
        //Задание1
        checkBrokenNum();
        //Задание 2
        int d = 0;
        int[] intArray = {8};
        for (int i = 0; i < intArray.length; i++) {
            try {
                double catchedRes1 = intArray[i] / d;
                System.out.println(catchedRes1);
            }catch (ArithmeticException e) {
                System.out.println("catchedRes1 = "+ e);
            }
        }
        //Задание 3
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
        //Задание 4
        checkEmptyLine();

    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

    public static void checkBrokenNum() {

        while (true) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Введите дробное число: ");
            try {
                double v = reader.nextDouble();
                if (Math.abs((long) v - v) != 0) {
                    System.out.println("Вы ввели дробное число: " + v);
                    break;
                } else {
                    System.out.println("Вы ввели число целое, введи дробное: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода");
            } catch (InputMismatchException e) {
                System.out.println("Неверный формат ввода");
            } catch (Exception e) {
                System.out.println("Неверный формат ввода");
            }
        }
    }
    public static void checkEmptyLine() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите значение: ");
            try {
                String inputData = scanner.nextLine();
                if (inputData.length() > 0) {
                    System.out.println("Вы ввели : " + inputData);
                    break;
                } else {
                    System.out.println("Вы ввели пустое значение");

                }
            } catch (Exception e) {
                System.out.println("Ошибка" + e);
            }
        }
    }

}