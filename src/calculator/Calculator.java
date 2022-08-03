package calculator;

import java.util.Scanner;

public class Calculator {
    double a;
    double b;
    double result;
    String operation;
    Scanner sc = new Scanner(System.in);

    public double calculate() {
        a = sc.nextDouble();
        operation = sc.next();
        b = sc.nextDouble();

        if ("+".equals(operation)) {
            result = (a + b);
        } else if ("-".equals(operation)) {
            result = (a - b);
        } else if ("/".equals(operation)) {
            result = (a / b);
        } else result = (a * b);

        return result;
    }
}