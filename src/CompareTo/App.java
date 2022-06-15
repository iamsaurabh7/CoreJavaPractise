package CompareTo;

public class App {
    public static void main(String[] args) {
        String x = "a";
        String y = "b";
        String z = "c";
        String w = "a";

        //compare to only works for String
        //does not work for int
        //but it will work for Integer

        System.out.println(x.compareTo(y));
        System.out.println(x.compareTo(z));
        System.out.println(x.compareTo(w));

    }
}
