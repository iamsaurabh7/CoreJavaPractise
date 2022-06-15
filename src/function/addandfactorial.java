package function;

import static java.lang.Math.pow;

public class addandfactorial {

    public static int add(int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }

    public static int factorial(int num) {
        if (num <= 1)
            return 1;
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        int num = 5, result;

        result = (int) Math.pow(num, 3);
        System.out.println("print power of number " + result);

        result = add(20, 15);
        System.out.println("print addition" + result);

        System.out.println("Factorial of 6 is: " + factorial(6));

    }
}
