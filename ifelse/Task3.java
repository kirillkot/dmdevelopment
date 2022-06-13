package com.dmdev.homework.ifelse;

/**
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников
 * и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */
public class Task3 {

    public static void main(String[] args) {
        var a1 = 9;
        var b1 = 2;
        var a2 = 6;
        var b2 = 3;

        double area1 = getArea(a1, b1);
        double area2 = getArea(a2, b2);
        compare(area1, area2);
    }

    private static double getArea(int a, int b) {
        return 1.0 / 2 * a * b;
    }

    private static void compare(double area1, double area2) {
        if (area1 > area2) {
            System.out.println("Первый треугольник больше второго");
        } else if (area1 < area2) {
            System.out.println("Первый треугольник меньше второго");
        } else {
            System.out.println("Треугольники равны друг другу");
        }
    }
}
