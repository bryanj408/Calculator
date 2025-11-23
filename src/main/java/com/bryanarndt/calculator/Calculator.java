package com.bryanarndt.calculator;

import java.util.Scanner;


public class Calculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while(continueCalculating){

            System.out.println("Enter the first number.");
            String input1 = getValidNumber();

            System.out.println("Enter the second number.");
            String input2 = getValidNumber();

            //converts user string input to double after validation
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);


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
                System.out.println("Goodbye!");
                continueCalculating = false;
                scanner.close();
            }

        }
    }

    //calls string checker(isValidNumber) against user input. Loops until user inputs correctly
    public static String getValidNumber(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.nextLine().trim();
            if(isValidNumber(input)){
                return input;
            }
            System.out.println("Error: Enter a valid number (Example: 3.14, -5, 0.7)");
        }
    }

    //Check for any string input while expecting a double
    public static boolean isValidNumber(String input){
        return input.matches("-?\\d*\\.?\\d+");
    }
}
