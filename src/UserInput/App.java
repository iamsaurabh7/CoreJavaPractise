package UserInput;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("name???");
        Scanner sc = new Scanner(System.in);
        int name = sc.nextInt();
        sc.close();
        System.out.println("hey  "+name +"  bye");
    }
}
