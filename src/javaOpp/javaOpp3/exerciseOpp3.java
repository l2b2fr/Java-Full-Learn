package javaOpp.javaOpp3;

import java.util.Scanner;

public class exerciseOpp3 {
    public static void run() {
        Dog dog1 = new Dog("Bin", "Cái");
        Dog dog2 = new Dog("Tun", "Đực");

        dog1.getInfo();
        dog2.getInfo();

        dog1.setName("Bin1");
        dog1.getInfo();
    }
}
