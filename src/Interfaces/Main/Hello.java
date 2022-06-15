package Interfaces.Main;

import Interfaces.Phone.Iphone8;
import Interfaces.Phone.OnePlus5;
import Interfaces.Phone.Phone;

public class Hello {
    public static void main(String[] args) {
        Phone phone=new OnePlus5();
        System.out.println(phone.processor());
        System.out.println(phone.spaceInGB());
    }
}
