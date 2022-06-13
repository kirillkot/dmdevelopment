package com.dmdev.homework.ifelse;

/**
 * Даны 3 переменные:
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */
public class Task2 {

    public static void main(String[] args) {
        var operand1 = 24.4;
        var operand2 = 10.1;
        var operation = '+';
        double result = calculate(operand1, operand2, operation);
        System.out.println("Результат: " + result);
    }

    private static double calculate(double operand1, double operand2, char operation) {
        if (operation == '+') {
            return operand1 + operand2;
        } else if (operation == '-') {
            return operand1 - operand2;
        } else if (operation == '*') {
            return operand1 * operand2;
        } else if (operation == '/') {
            return operand1 / operand2;
        } else {
            return operand1 % operand2;
        }
    }
}
