import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        ex4();
    }

    static int ex0() {
        // Вычислить n-ое треугольного число (сумма чисел от 1 до n)
        System.out.println("Введите число?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = number * (number + 1) / 2;
        System.out.println("Сумма чисел от 1 до введенного числа равна " + result);
        return result;
    }

    static int ex1() {
        // Вычислить n! (произведение чисел от 1 до n)
        System.out.println("Введите число?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("n! равен " + result);
        return result;
    }

    static String ex2() {
        // Вывести все простые числа от 1 до 1000
        String result = "";
        for (int i = 1; i < 1001; i++) {
            int res_i = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    res_i += 1;
                }
            }
            if (res_i == 0) {
                result = result + i + " ";
            }
        }
        System.out.println(result);
        return result;

    }

    static double ex3() {
        // Реализовать простой калькулятор
        System.out.println("Введите первое число?");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        System.out.println("Введите что будем делать (складывать/вычитать/перемножать/делить? ");
        Scanner scanner1 = new Scanner(System.in);
        String op = scanner1.nextLine();

        System.out.println("Введите второе число?");
        double b = scanner.nextDouble();

        double result = 0;

        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }

        System.out.println(a + op + b + " = " + result);
        return result;
    }

    static void ex4() {
        // Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
        // заменены знаком вопроса, например, 2? + ?5 = 69.
        // Требуется восстановить выражение до верного равенства. Предложить хотя бы
        // одно решение или сообщить, что его нет.
        System.out.println("Будем работать с положительными двузначными числами в уравнении такого вида: q + w = e ");
        System.out.println("Введите первое число, заменив вторую цифру на знак ?");
        Scanner scanner = new Scanner(System.in);
        String number1 = scanner.nextLine();

        System.out.println("Введите второе число, заменив первую цифру на знак ?");
        String number2 = scanner.nextLine();

        System.out.println("Введите желаемую сумму этих чисел ?");
        String number3 = scanner.nextLine();

        String[] temp1 = number1.split("(?!^)");
        String[] temp2 = number2.split("(?!^)");

        int q = Integer.parseInt(temp1[0]);
        int w = Integer.parseInt(temp2[1]);
        int summa = Integer.parseInt(number3);

        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((q * 10 + i + j * 10 + w) == summa) {
                    int a = q * 10 + i;
                    int b = j * 10 + w;
                    System.out.println(a + " + " + b + " = " + summa);
                    count += 1;
                }
            }
        }

        if (count == 0) {
            System.out.println("Решений нет");
        }
    }

}