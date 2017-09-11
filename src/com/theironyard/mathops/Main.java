package com.theironyard.mathops;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter two numbers. decimals are fine, cause we badass in dis bitch.");

        String firstNum = keyboard.nextLine();
        String secondNum = keyboard.nextLine();

        double operand1 = Double.parseDouble(firstNum);
        double operand2 = Double.parseDouble(secondNum);

        double sum = operand1 + operand2;
        double difference = operand1 - operand2;
        double division = operand1 / operand2;
        double multiplication = operand1 * operand2;
        double remainder = operand1 % operand2;

        showResults(sum, difference, division, multiplication, remainder);

    }

    public static void showResults(double sum, double difference, double division, double multiplication, double remainder) {
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The result of division is: " + division);
        System.out.println("The result of multiplication is: " + multiplication);
        System.out.println("The remainder is: " + remainder);
    }
}
