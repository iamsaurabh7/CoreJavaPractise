package Enum;

public class Solution {
    /*public static final int COREJAVA = 1;
    public static final int COLLECTION = 2;
    public static final int GENERICS = 3;
    public static final int JSP = 4;
    public static final int MULTITHREADING = 5;*/

    public static void main(String args[]) {
        /*int learning = 6;
        switch (learning) {
            case COLLECTION:
                System.out.println("collection");
                break;
            case JSP:
                System.out.println("jsp");
                break;
            case MULTITHREADING:
                System.out.println("multithreading");
                break;
            case COREJAVA:
                System.out.println("corejava");
                break;
            case GENERICS:
                System.out.println("generics");
                break;
            case default:
                System.out.println("default value");
                break;
        }*/
        Learning learn = Learning.JSP;
        switch (learn) {
            case COREJAVA -> {
                System.out.println("corejava");
            }
            case COLLECTION -> {
                System.out.println("coll");
            }
            case GENERICS -> {
                System.out.println("gene");
            }
            case JSP -> {
                System.out.println("js");
            }
            case MULTITHREADING -> {
                System.out.println("multi");
            }
            default -> throw new IllegalStateException("Unexpected value: " + learn);
        }
    }
}