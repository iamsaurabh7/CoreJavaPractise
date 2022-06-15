package Operator;

public class unaryOperator {
    public static void main(String[] args) {
        int var1, var2;

        var1 = 50;
        var2 = var1++;
        System.out.println("Result of var1 is " + var1 + "and var2 is " + var2);

        var1 = 50;
        var2 = var1--;
        System.out.println("Result of var1 is " + var1 + "and var2 is " + var2);

        var1 = 50;
        var2 = ++var1;
        System.out.println("Result of var1 is " + var1 + "and var2 is " + var2);

        var1 = 50;
        var2 = --var1;
        System.out.println("Result of var1 is " + var1 + "and var2 is " + var2);

        boolean bool1, result;
        bool1 = true;
        result = !bool1;
        System.out.println("bool1= " + bool1);
        System.out.println(" inverse  " + result);
    }
}
