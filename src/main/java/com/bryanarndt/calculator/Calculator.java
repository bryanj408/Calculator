package com.bryanarndt.calculator;

import java.util.Scanner;


public class Calculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while(continueCalculating){
            System.out.println("Enter the first number.");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number.");
            double num2 = scanner.nextDouble();

            System.out.println("Enter an operator " + "(+, -, *, /)");
            String operatorInput = scanner.next();

            switch(operatorInput){
                case "+" -> {
                    double userAnswer = num1 + num2;
                    System.out.println("Result " + userAnswer);
                }
                case "-" -> {
                    double userAnswer = num1 - num2;
                    System.out.println("Result " + userAnswer);
                }
                case "*" -> {
                    double userAnswer = num1 * num2;
                    System.out.println("Result " + userAnswer);
                }
                case "/" -> {
                    double userAnswer = num1 / num2;
                    System.out.println("Result " + userAnswer);
                }
            }

        }
    }
}
