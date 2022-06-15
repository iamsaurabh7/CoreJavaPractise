package AutoBoxing;

import java.util.ArrayList;

public class Clean {
    public static void main(String[] args) {
        ArrayList<Integer> demoListINT = new ArrayList<>();
        demoListINT.add(22);
        System.out.println(demoListINT.get(0));

        ArrayList<Float> demoListFloat = new ArrayList<>();
        demoListFloat.add(20.2f);
        System.out.println(demoListFloat.get(0));
    }
}
