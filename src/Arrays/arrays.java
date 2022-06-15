package Arrays;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        int[] intArr = {10, 20, 25, 30, 50};
        float[] floatArr = new float[5];
        char charArr[] = new char[5];

        Scanner sc = new Scanner(System.in);

        floatArr[0] = 2.5F;
        floatArr[1] = 12F;
        floatArr[2] = 555F;
        floatArr[3] = 4.85F;
        floatArr[4] = 546.867F;

        for (int i = 0; i < 5; i++) {
            System.out.println("enter character for index: (" + i + ")");
            charArr[i] = sc.next().charAt(0); //takeinput and store to character array
        }

        System.out.println("Items of integer array");
        for (int i = 0; i <= 4; i++) {
            System.out.println(intArr[i] + " "); //display array content using for loop
        }

        System.out.println();

        System.out.println("Items of float array");
        for (float item : floatArr) {
            System.out.println(item + " "); //display array content using for each loop
        }

        System.out.println();

        System.out.println("Items for character array :");
        for (char ch : charArr) {
            System.out.println(ch + " "); //display array content using for each loop
        }
        sc.close();

    }
}



