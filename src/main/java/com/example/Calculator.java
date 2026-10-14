package com.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.add(10, 20);

        System.out.println("First number: 10");
        System.out.println("Second number: 20");
        System.out.println("Sum: " + result);
    }
}