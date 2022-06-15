package Operator;

import java.util.Scanner;

public class arithOperator {
    public static void main(String[] args) {

        int a, b, result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two number a and b :");
        a = scanner.nextInt();
        b = scanner.nextInt();

        result = a + b;
        System.out.println("Addition is : " + result);

        result = a - b;
        System.out.println("Subtraction is :" + result);

        result = a * b;
        System.out.println("Multiplication is : " + result);

        result = a / b;
        System.out.println("Division is : " + result);

        result = a % b;
        System.out.println("Reminder is : " + result);

        scanner.close();
    }
}
