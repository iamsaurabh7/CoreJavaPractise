package Stack;

import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Stack<Integer> demo = new Stack<>();
        demo.push(0);
        demo.push(1);
        demo.push(2);
        demo.push(3);
        demo.push(4);
        demo.push(5);
        demo.push(100);
        demo.push(101);
        demo.pop();

        System.out.println(demo.peek());

        for (Integer temp : demo) {
            System.out.println(temp);
        }

        if (demo.isEmpty()) {
            System.out.println("empty");
        } else
            System.out.println("not empty");

        System.out.println(demo.search(100));
        System.out.println(demo.search(102));
    }
}
