package Condition;

public class breakStatement {
    public static void main(String[] args) {
        int a = 0;
        while (true) {
            System.out.println("Value of a :  " + a);

            if (a == 10)
                break;
            a++;

        }
        System.out.println("end");
    }
}
