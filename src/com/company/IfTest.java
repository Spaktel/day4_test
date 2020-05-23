package com.company;

public class IfTest {
    public static void main(String[] args) {
        //create check of temperature is higher then 80.1. print hot
        double temperature = 75.0;
        if(temperature >= 80.1){
            System.out.println("Hot!");
        }
        else if (temperature >=75.0){
            System.out.println("Just right!");
        }
        else{
            System.out.println("Cold!");
        }
    }
}
