package org.example;

import org.example.ops.AdditionOps;
import org.example.ops.DivisionOps;
import org.example.ops.MultiplicationOps;
import org.example.ops.SubstractionOps;

import java.util.Scanner;

public class CalculatorV3 {

    private OperationFactory factory;

    public static void main(String[] args) {
        CalculatorV3 cal = new CalculatorV3();
        cal.initCalculator();
        Scanner sc = new Scanner(System.in);
        Double operator1 = sc.nextDouble();
        Double operator2 = sc.nextDouble();
        String op = sc.next();
        //1System.out.println("Operator is "+op);
        System.out.println(cal.doCalculation(operator1, operator2, op));

    }

    public void initCalculator() {
        factory = OperationFactory.getInstance();
        factory.registerOperation("+", new AdditionOps());
        factory.registerOperation("-", new SubstractionOps());
        factory.registerOperation("/", new DivisionOps());
        factory.registerOperation("*", new MultiplicationOps());
    }

    public double doCalculation(Double op1, Double op2, String op) {
        return factory.getOperation(op).execute(op1, op2);
    }

}
