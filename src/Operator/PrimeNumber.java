package Operator;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        /*int i, j, temp = 0;
        for (i = 1; i <= 50; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0)
                    break;
            }
            if (i == j)
                System.out.println(j);
        }*/
        int i, j, a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("from :  ");
        a = sc.nextInt();
        System.out.println("To :  ");
        b = sc.nextInt();
        for (i = a; i <= b; i++) {
            int temp = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    temp++;
                }
            }
            if (temp == 0) {
                System.out.println("prime number is : " + i);
            }
        }
    }
}
