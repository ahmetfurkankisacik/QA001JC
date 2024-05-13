package day16passbyvalue_constructors_datetime;

import java.util.Scanner;

public class CarRunner {
    public static void main(String[] args) {
       Car car1=new Car();
        System.out.println(car1.marka);
        System.out.println(car1.model);
        System.out.println(car1.renk);
        System.out.println(car1.year);
        System.out.println(car1.kapiSayisi);
        System.out.println(car1.benzinTuru);
        car1.hareket();
        car1.dur();

    }
}
