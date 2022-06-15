package Operator;

public class relationalOperator {
    public static void main(String[] args) {
        boolean result;

        result = (10 == 10);
        System.out.println("Result is  " + result);

        result = (10 < 5);
        System.out.println("Result is  " + result);

        result = (10 > 5);
        System.out.println("Result is  " + result);

        result = (10 <= 5);
        System.out.println("Result is  " + result);

        result = (10 >= 5);
        System.out.println("Result is  " + result);

        result = (10 != 10); //is not equal to
        System.out.println("Result is  " + result);
    }
}
