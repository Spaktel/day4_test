package com.company;

public class TemporaryOperators {
    public static void main(String[] args) {
        int time =10;

        if(time < 18) {
            System.out.println("Good day");
        }
        else{
            System.out.println("Good evening");
        }
        System.out.println("__________");
        String result = (time < 18) ? "Good day" : "Good evening"; // nosacijusms ?  true :  false

    }
}
