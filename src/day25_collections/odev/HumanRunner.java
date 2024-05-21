package day25_collections.odev;

import java.util.Arrays;
import java.util.LinkedList;

public class HumanRunner {
    public static void main(String[] args) {
        Human human1=new Human("Ali","Can",24,"Erkek");
        Human human2=new Human("Esra","Analur",25,"Kadın");
        Human human3=new Human("Niyazi","Cholak",26,"Erkek");
        Human human4=new Human("Ahmet","Can",27,"Erkek");
        LinkedList<Human>halay=new LinkedList<>();
        halay.add(human1);
        halay.add(human2);
        halay.add(human3);
        halay.add(human4);
        System.out.println(halay);
        //System.out.println(human1);
    }
}
