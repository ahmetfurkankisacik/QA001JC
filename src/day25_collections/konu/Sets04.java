package day25_collections.konu;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Sets04 {
    public static void main(String[] args) {
        //Interview Sorusu
        //Ornek 1 : Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz.

        //mail'ler unique. set kullanalım .hangi set yapısını kullanalım?TreeSet
        long t1=System.nanoTime();
        //1.yol-Yavas-Her elemanda siralama yapar
        TreeSet<String> emails=new TreeSet<>();
        emails.add("k@gmail.com");
        emails.add("a@gmail.com");
        emails.add("z@gmail.com");
        emails.add("l@gmail.com");
        emails.add("u@gmail.com");
        emails.add("p@gmail.com");
        emails.add("g@gmail.com");
        emails.add("b@gmail.com");
        emails.add("t@gmail.com");
        emails.add("x@gmail.com");
        System.out.println(emails);
        long t2=System.nanoTime();

        //2. yol
        HashSet<String>emailHs=new HashSet<>();
        emailHs.add("k@gmail.com");
        emailHs.add("a@gmail.com");
        emailHs.add("z@gmail.com");
        emailHs.add("l@gmail.com");
        emailHs.add("u@gmail.com");
        emailHs.add("p@gmail.com");
        emailHs.add("g@gmail.com");
        emailHs.add("b@gmail.com");
        emailHs.add("t@gmail.com");
        emailHs.add("x@gmail.com");
        System.out.println();

        TreeSet<String>emailHsTs=new TreeSet<>(emailHs);
        System.out.println(emailHsTs);
        long t3=System.nanoTime();

        System.out.println(t2-t1);//treeset 851200
        System.out.println(t3-t2);//hashset 95600 yaklasık 10 kat daha hızlı

    }
}
