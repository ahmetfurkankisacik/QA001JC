package day25_collections.konu;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sets03 {
    public static void main(String[] args) {
        //TreeSet nasil olusturulur?
        TreeSet<Character>ts=new TreeSet<>();
        ts.add('G');
        ts.add('Q');
        ts.add('A');
        ts.add('C');
        ts.add('F');
        ts.add('L');
        ts.add('O');
        ts.add('H');
        //ts.add(null);
        System.out.println(ts);

        //subset() belirli bir aralıktaki elemanları içeren yeni bir küme oluşturmak için kullanılır.
        //subSet() methodu, belirtilen aralıkta bulunan elemanlardan oluşan bir sorted set alt kümesi
        // oluşturur. Bu nedenle, subSet() yöntemini kullanmak için,
        // SortedSet türünden bir değişken oluşturmanız gerekir
        SortedSet<Character>ss=ts.subSet('B','K');
        System.out.println(ss);//A dahil fakat F dahil degil

    }
}
