package day24_collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public class Sets01 {
    /*Java'da üç tür set vardır:
1) HashSet: Bu set, elemanların hash kodlarına göre depolandığı bir settir. Elemanlar,
her birinin benzersiz bir hash kodu (kimlik numarası) ile depolandığı bir yapıda tutulur.
Bir eleman eklediğinizde, bu elemanın hash kodu hesaplanır ve o hash koduna karşılık gelen
bir hücreye yerleştirilir.

HashSet'ler, en hızlı performansı sunar.Ancak, elemanların sırasını korumazlar.
null'i eleman olarak kabul ederler */

    /*2) LinkedHashSet:Bu set, elemanların eklenme sırasına göre(insertion order) depolandığı
bir settir. LinkedHashSet class'i, HashSet class'inin child'idir.
LinkedHashSet'ler, elemanların sırasını korumaya ihtiyaç duyulan uygulamalar için iyi bir seçimdir.
Ancak, HashSet'lerden daha yavaş performans sunarlar. (orta)

Ornegin; Okullarda kayit sirasina gore ogrenci bilgilerini tutmak isterseniz kullanabilirsiniz

3) TreeSet:Bu set, elemanların doğal sırasına(natural order-kucukten buyuge) göre depolandığı bir settir.
HashSet'ler ve LinkedHashSet'lerden daha yavaş performans sunarlar.
Java'da TreeSet, SortedSet arayüzünü(interface) uygulayan bir class'tir.
Bu nedenle, TreeSet bir Sorted Set'tir.*/
    public static void main(String[] args) {
        HashSet<String>hs=new HashSet<>();
        System.out.println(hs);//[]
        String s1="Sinan";
        System.out.println(s1.hashCode());
        hs.add("Sinan");
        hs.add("Kerem");
        hs.add("Tuba");
        hs.add("Onur");
        hs.add(null);
        //hs.add("Sinan");
        System.out.println(hs);
        //for (String s:hs
        //     ) {
        //    System.out.println(s.hashCode());
        //}

        //***eleman eklemenin kisa yollari
        HashSet<String>hs2=new HashSet<>(Arrays.asList("Sinan","Kerem","Tuba","Onur"));
        //hs2.add("Ali");
        System.out.println(hs2);

        HashSet<String>hs3=new HashSet<>(Set.of("Sinan","Kerem","Tuba","Onur"));
        System.out.println(hs3);

    }}
