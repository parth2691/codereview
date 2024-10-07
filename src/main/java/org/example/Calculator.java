package org.example;

public class Calculator {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.calculateResults();
    }

    public void calculateResults() {
        double a = 10;
        double b = 20;
        String op = "+";

        if(op.equals("+")) {
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
        }
    }

}
