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
                        throw new ArithmeticException("Cannot divide by zero.");
                    }
                    System.out.println("Result " + userAnswer);
                }
                default -> throw new ArithmeticException("Invalid operator");
            }

            //if user enters "yes", continueCalculating=true and loops continues
            System.out.println("Calculate more? Yes or No");
            String userInput = scanner.next();

            //Exits while loop if user enters "no". equalsIgnoreCase() is similar to toLowerCase()
            if(userInput.equalsIgnoreCase("no")){
                continueCalculating = false;
                scanner.close();
            }

        }
    }
}
