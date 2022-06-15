package Scanner;

import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        System.out.println("This is output line sout");

        int x = 11;
        System.out.println("value of x =" + x);

        System.out.print("First line(without LN)");
        System.out.print("Second line \n");

        System.out.printf("Value of x = %d,\n PI = %f", x, 22f / 7);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter DATA:");
        int data = scanner.nextInt();

        System.out.println("Read data:" + data);
        scanner.close();
    }

}