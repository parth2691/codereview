package org.example;

import java.util.Scanner;

public class CalculatorV2 {

    public static void main(String[] args) {
        CalculatorV2 cal = new CalculatorV2();
        cal.calculateResults();
    }

    public void calculateResults() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        double a = scanner.nextDouble();
        System.out.println("Enter number 2");
        double b = scanner.nextDouble();
        String op = scanner.nextLine();
        System.out.println(doCalc(a, b, op));

        /*if(op.equals("+")) {
            System.out.println("ans="+(a+b));
        } else if(op.equals("-")) {
            System.out.println("ans="+(a-b));
        }
        else if(op.equals("/")) {
            System.out.println("ans="+(a/b));
        }
        else if(op.equals("*")) {
            System.out.println("ans="+(a*b));
        } else {
            System.out.println("Invalid operation error.");
        }*/
    }

    public double doCalc(double a, double b, String op) {
        switch (op) {
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "/":
                if(b==0) {
                    throw new ArithmeticException("Can not divide by zero");
                }
                return a/b;
            case "*":
                return a*b;
            default:
                throw new IllegalArgumentException("Operator not supported");
        }
    }

}
