package com.company;

public class swichTest {
    public static void main(String[] args) {
        char operators = '+';
        double number1 = 10.0;
        double number2 = 3.0;
        double result = 0;
        switch (operators) {
            case '+':
                result = (number1 + number2);
                System.out.println(result);
                break;
            case '-':
                result = (number1 - number2);
                System.out.println(result);
                break;
            case '*':
                result = (number1 * number2);
                System.out.println(result);
                break;
            case '/':
                result = (number1 / number2);
                System.out.println(result);
                break;
            default:
                System.out.println("No such operator");
        }

    }
}
