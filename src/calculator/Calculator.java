package calculator;

import java.util.Scanner;

public class Calculator {
    private double a;
    private double b;
    double result;
    String operation;
    private Scanner sc = new Scanner(System.in);


    public double calculate() {
        a = sc.nextDouble();
        operation = sc.next();
        b = sc.nextDouble();

        switch(operation){
            case "+":
                return(a+b);
            case "-":
                return(a-b);
            case "/":
                return(a/b);
            case "*":
                return(a*b);
            default:
                return (0);

        }
        }
        //if ("+".equals(operation)) {
            //result = (a + b);
        //} else if ("-".equals(operation)) {
            //result = (a - b);
       // } else if ("/".equals(operation)) {
           // result = (a / b);
       // } else result = (a * b);

        //return result;
    }