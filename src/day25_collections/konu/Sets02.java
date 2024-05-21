package day25_collections.konu;

import java.util.LinkedHashSet;

public class Sets02 {
    public static void main(String[] args) {
        //LinkedHashSet nasil olusturulur?
        LinkedHashSet<String>linkedHashSet=new LinkedHashSet<>();
        //LinkedHashSet'e eleman nasil eklenir?
        linkedHashSet.add("Ali Can");
        linkedHashSet.add("Veli Can");
        linkedHashSet.add("Hüseyin Can");
        linkedHashSet.add("Emre Can");
        linkedHashSet.add("Ali Can");
        System.out.println(linkedHashSet);

        //Bir tane daha olusturalım
        LinkedHashSet<String>linkedHashSet1=new LinkedHashSet<>();
        linkedHashSet1.add("Ali Can");
        linkedHashSet1.add("Veli Can");
        linkedHashSet1.add("Ahmet");
        linkedHashSet1.add("Niyazi");
        //retainAll() metodu, bir koleksiyondaki öğelerin başka bir koleksiyonla kesişimini
        // (yani her iki koleksiyonda da bulunan öğeleri-ortak) bulmak için kullanılır.
        System.out.println(linkedHashSet.retainAll(linkedHashSet1));
        System.out.println(linkedHashSet);
    }
}
