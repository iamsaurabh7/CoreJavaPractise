package AutoBoxing;

import java.util.ArrayList;

class intWrapper {
    public int intValue;

    public intWrapper(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}

public class App {
    public static void main(String[] args) {

        /*ArrayList <Integer> studentNumbers= new ArrayList<Integer>();
        studentNumbers.add(25);  //autoboxing
        System.out.println(studentNumbers.get(0));  //unboxing */

        /*ArrayList<intWrapper> studentNumbers = new ArrayList<intWrapper>();
        studentNumbers.add(new intWrapper(25)); //boxing
        System.out.println(studentNumbers.get(0).getIntValue());  //unboxing*/

        ArrayList<Double> demoList = new ArrayList<>();
        //demoList.add(25.5);
        //demoList.add(new Double(25.5));
        demoList.add(Double.valueOf(10.1)); //backgropund process of autoboxing
        System.out.println(demoList.get(0));
        System.out.println(demoList.get(0).doubleValue()); //while unboxing
    }
}
