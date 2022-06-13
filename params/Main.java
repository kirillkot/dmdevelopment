package ru.javarush.params;

public class Main {

    public static void main(String[] args) {
        A a = new A(10);
        test(a);

        System.out.println(a.getAge());
    }

    private static void test(A test) {
        test.setAge(15);
    }
}
