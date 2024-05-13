package day15arraylistMethodcreation;

import java.util.Stack;

public class MethodCreation02 {

    public static void main(String[] args) {
    String renk="Yeşil";
    String turu="Kulplu";
    boolean iciDoluMu;
    iciDoluMu=suDoldur();
        System.out.println("iciDoluMu = " + iciDoluMu);
        iciDoluMu=suyuBosalt();
        System.out.println("iciDoluMu = " + iciDoluMu);


    }
    public static boolean suDoldur(){
        System.out.println("Su dolduruluyor");
        return true;
    }
    public static boolean suyuBosalt(){
        System.out.println("Su dokuluyor");
        return false;
    }






}
