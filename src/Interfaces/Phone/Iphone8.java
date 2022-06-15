package Interfaces.Phone;

public class Iphone8 implements Phone{
    @Override
    public String processor() {
        return "A11";
    }

    @Override
    public String OS() {
        return "IOS8";
    }

    @Override
    public int spaceInGB() {
        return 64;
    }
}
