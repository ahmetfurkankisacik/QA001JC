package day23_oop.konu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TeknolojiRunner {
    public static void main(String[] args) {
        Teknoloji teknoloji1=new Telefon();
        teknoloji1.cipSayisi();
        //teknoloji1.kameraSayisi();
        System.out.println(teknoloji1.cipSayi);
        Telefon telefon1=new Telefon();
        Telefon telefon2=new Telefon();
        Telefon telefon3=new Telefon();
        Telefon telefon4=new Telefon();
        LinkedList<Telefon> telefonList=new LinkedList<>();
        telefonList.add(telefon1);
        telefonList.add(telefon2);
        telefonList.add(telefon3);
        telefonList.add(telefon4);
        System.out.println(telefonList);
    }}
