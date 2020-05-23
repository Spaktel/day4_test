package com.company;

public class calculator {
    public static void main(String[] args) {
        //code calc with main operator using if else if statement
        // charr operators = ''-result = number1- number2;
        double number1 = 10;
        double number2 = 6;
        char operators = '/';

        if (operators == '-') {
            double result = (number1 - number2);
            System.out.println(result);
        } else if (operators == '+') {
            double result = (number1 + number2);
            System.out.println(result);
        }
        else if (operators == '*') {
            double result = (number1 * number2);
            System.out.println(result);
        }
        else if (operators == '/') {
            double result = (number1 / number2);
            System.out.println(result);
        }
        else{
            System.out.println("No operator");
        }
    }

}

