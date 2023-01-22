import java.util.Scanner;

/**
 * ДЗ к уроку №1 Написать программу вычисления n-ого треугольного числа
 */
public class Lesson1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int number = getNumber("Введите число: ");
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result = result + i;
        }
        print(result);

    }

    // 1. ввод числа
    public static int getNumber(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    // 2. печать ответа
    public static void print(int result) {
        System.out.println("Треугольное число = " + result);
    }

}
