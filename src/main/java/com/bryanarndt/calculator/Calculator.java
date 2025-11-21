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

            //Checks user's operator input, division by zero, and invalid operators
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
                    if(num2 == 0){
                        System.out.println("You cannot divide by zero");
                    }
                    System.out.println("Result " + userAnswer);
                }
                default -> {
                    System.out.println(operatorInput + " is an invalid operator.");
                }
            }
            //if user enters "yes", continueCalculating=true and loops continues
            System.out.println("Calculate more? Yes or No");
            String userInput = scanner.next();

            //Exits while loop if user enters "no"
            if(userInput.equals("no")){
                continueCalculating = false;
            }

        }
    }
}
