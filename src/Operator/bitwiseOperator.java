package Operator;

public class bitwiseOperator {
    public static void main(String[] args) {
        byte val1 = 12;
        byte val2 = 10;
        byte result;

        result = (byte) ~val1;
        System.out.println("Bitwise complement is :" + result);

        result = (byte) (val1 & val2);
        System.out.println("Bitwise complement is :" + result);

        result = (byte) (val1 | val2);
        System.out.println("Bitwise complement is :" + result);

        result = (byte) (val1 ^ val2);
        System.out.println("Bitwise complement is :" + result);

        result = (byte) (val1 << 2);
        System.out.println("Bitwise complement is :" + result);

        result = (byte) (val1 >> 2);
        System.out.println("Bitwise complement is :" + result);

    }
}
