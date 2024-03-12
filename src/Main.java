import java.util.Locale;
/*
public class Main {

    static double func(double x) {
        return Math.sin(x) - Math.tan(x) * Math.cos(2 * x) + 1;
    }

    static double bisectionMethod(double a, double b, double eps) {
        double an = a, bn = b;
        double xn = (an + bn) / 2;

        while (Math.abs(bn - an) >= 2 * eps) {
            double func_an = func(an);
            double func_bn = func(bn);
            double func_xn = func(xn);

            if (func_an * func_xn < 0) {
                bn = xn;
            } else if (func_bn * func_xn < 0) {
                an = xn;
            }

            xn = (an + bn) / 2;
        }

        return xn;
    }

    public static void main(String[] args) {

        double a = 5; // Начало отрезка
        double b = 6; // Конец отрезка
        double epsilon = 0.00001; // Точность

        if (func(a) * func(b) >= 0) {
            System.out.println("Условие теоремы не выполненно");
            return;
        }

        double root = bisectionMethod(a, b, epsilon);

        System.out.println("Корень уравнения: " + root);
    }


}*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

    static double func(double x) {
        return Math.sinh(4*Math.sin(x)) - 20 /(1 + Math.pow(x,2));
    }

    static double bisectionMethod(double a, double b, double eps) {
        double an = a, bn = b;
        double xn = (an + bn) / 2;

        while (Math.abs(bn - an) >= 2 * eps) {
            double func_an = func(an);
            double func_bn = func(bn);
            double func_xn = func(xn);

            if (func_an * func_xn < 0) {
                bn = xn;
            } else if (func_bn * func_xn < 0) {
                an = xn;
            }

            xn = (an + bn) / 2;
        }

        return xn;
    }

    public static void main(String[] args) {
        Locale.setDefault(new Locale("ru", "RU"));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начало интервала a: ");
        double a = scanner.nextDouble();

        System.out.println("Введите конец интервала b: ");
        double b = scanner.nextDouble();

        if (func(a) * func(b) >= 0) {
            System.out.println("Условие теоремы не выполнено");
            return;
        }

        double epsilon = 0.00001; // Точность
        double root = bisectionMethod(a, b, epsilon);

        System.out.println("Корень уравнения: " + root);
    }
}