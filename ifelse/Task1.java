package com.dmdev.homework.ifelse;

/**
 * В переменной minutes лежит число от 0 до 59. Написать функцию,
 * которая принимает в качестве параметра значение переменной minutes
 * и выводит на консоль в какую четверть часа попадает это число
 * (в первую, вторую, третью или четвертую).
 */
public class Task1 {

    public static void main(String[] args) {
        var minutes = 30;
        determineHourQuarter(minutes);
    }

    private static void determineHourQuarter(int minutes) {
        if (minutes >= 0 && minutes <= 14) {
            System.out.println("В первую четверть");
        }
        if (minutes >= 15 && minutes <= 30) {
            System.out.println("Во вторую четверть");
        }
        if (minutes >= 31 && minutes <= 45) {
            System.out.println("В третью четверть");
        }
        if (minutes >= 46 && minutes <= 59) {
            System.out.println("В четвертую четверть");
        }
    }
}
