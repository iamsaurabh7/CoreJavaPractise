package Interfaces.Phone;

public class OnePlus5 implements Phone{

    @Override
    public String processor() {
        return "SD835";
    }

    @Override
    public String OS() {
        return "Android10";
    }

    @Override
    public int spaceInGB() {
        return 128;
    }
}
