package hometask10;

import java.util.Scanner;

public class Equation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваши коэфиценты:");

        System.out.println("A:");
        int a = scanner.nextInt();
        System.out.println("B:");
        int b = scanner.nextInt();
        System.out.println("C:");
        int c = scanner.nextInt();

        double x1;
        double x2;

        System.out.println(a + "x² + " + b + "x + " + c + " = 0");

        int discriminant = (int) Math.pow(b, 2) - (4 * a * c);
        System.out.println("Дискриминант = " + discriminant);

        if (a == 0) { // Если а=0 то мы решаем простое линейное уравнение

            if (b != 0) {
                x1 = (double) -c / b;
                System.out.println("x = " + x1);
            } else if (c != 0) {
                System.out.println("Уравнение не имеет решений");
            } else System.out.println("x = 0");

        } else {

            if (discriminant >= 0) {
                x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                if (x1 == x2) {
                    System.out.println("x = " + x1);
                } else System.out.println("x1 = " + x1 + "; x2 = " + x2 + ";");

            } else System.out.println("Уравнение не имеет решений");
        }
    }
}
