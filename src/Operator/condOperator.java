package Operator;

public class condOperator {

    public static void main(String[] args) {
        boolean bool1, bool2, result;

        bool1 = true;
        bool2 = false;

        result = bool1 || bool2;
        System.out.println("Result is  " + result);

        result = bool1 && bool2;
        System.out.println("Result is  " + result);
    }
}
