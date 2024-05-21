package day24_collections;

import java.awt.*;
import java.util.*;
import java.util.List;

public class LinkedList01 {

    /*Collections (koleksiyonlar), Object'leri depolamak ve işlemek için kullanılan
bir class'lar ve interface'ler kümesidir.

—Collections, çeşitli Object (nesne) işleme yöntemlerini de destekler:
        Ekleme: Bir nesneyi bir koleksiyona eklemek için kullanılır.
       Silme: Bir nesneyi bir koleksiyondan silmek için kullanılır.
       Arama: Bir koleksiyonda bir nesneyi bulmak için kullanılır.
        Döngüleme: Bir koleksiyonun tüm nesnelerini işlemek için kullanılır.

—Collections, Java programcılarının aşağıdakileri yapmasına olanak tanır:
        Verileri verimli bir şekilde depolamak
        Verileri hızlı bir şekilde işlemek(verileri aramak, sıralamak, filtrelemek)
        Verileri güvenli bir şekilde depolamak*/

    /*Java da Array'ler neden eksik kaldi da Collection'lar gelistirildi?

      Java'da array'ler eksik kaldı çünkü:
      Boyutları statiktir: Bu, array'lerin dinamik olarak büyüyemediği veya küçülemediği anlamına gelir.
      İç içe geçmiş array'ler karmaşıktır: Bu, array'lerin birbirleriyle ilişkili olduğu durumlarda karmaşık ve hata yapmaya müsaittir.
      Array'ler genel olarak verimli değildir: Bu, ekleme, silme ve arama gibi işlemler için genellikle daha yavaştır.

      Collections, bu dezavantajları çözmek için tasarlanmıştır.*/

    /*LinkedList: Bağlı bir listedir.

LinkedList'ler de, bir dizi index'e sahiptir. Ancak, bu index'ler,
LinkedList'in içinde bulunan node'ların konumunu temsil eder.

ArrayList'lerde, bir elemana erişmek için, o elemanın index'ine doğrudan erişilebilir.
Ancak, LinkedList'lerde, bir elemana erişmek için, o elemanın bulunduğu node'a erişmek gerekir.
Bu, LinkedList'lerde bir elemana erişmenin daha yavaş olmasına neden olabilir.

1)Her eleman, bir önceki ve bir sonraki elemanı işaret eden (pointer) bağlantılara sahiptir.
Bu nedenle, ekleme ve silme işlemleri hızlıdır, ancak elemanlara erişim, başka bir elemandan
başlayarak ilerlemeyi gerektirir. Yani ArrayList'e gore erisim yavastir.
ArrayList'lerde get(index) ile hizli erisiriz. Ama LinkedList'ler en bastan istenen eleman mi diye
tek tek bakar.

2) Başka bir elemanın başından veya sonundan eleman eklemek veya silmek, hızlı bir şekilde yapılabilir.

3) Bağlantılar ve düğümler (node) nedeniyle LinkedList, genellikle daha fazla bellek kullanır.*/


    public static void main(String[] args) {
        //ArrayList<String>list1=new ArrayList<>();
        //List<String>list2=new ArrayList<>();
        LinkedList<String>myList=new LinkedList<>();
        System.out.println(myList.add("Ali"));
        myList.add("Veli");
        myList.add("Ayse");
        myList.add("Fatma");
        System.out.println(myList);
        //veriyi ekledigimiz siraya gore siraladi
        //eleman eklemenin kısa yollari
        //LinkedList<String>linkedList1=new LinkedList<>(Arrays.asList("Elemani1","Eleman2","Eleman3"));
        //linkedList1.add("Eleman4");
        //System.out.println(linkedList1);
        //LinkedList<String>linkedList2=new LinkedList<>(List.of("Eleman1","Eleman2","Eleman3"));

        //2- add(int index, E element); belirtilen konuma bir oge ekler
        myList.add(1,"Zeynep");
        System.out.println(myList);//[Ali, Zeynep, Veli, Ayse, Fatma]

        //3- addFirst(E e): Listenin basina oge ekler
        myList.addFirst("Hasan");
        System.out.println(myList);//[Hasan, Ali, Zeynep, Veli, Ayse, Fatma]

        //4- addLast(E e): Listenin sonuna bir öğe ekler.
        myList.addLast("Huseyin");
        System.out.println(myList);//[Hasan, Ali, Zeynep, Veli, Ayse, Fatma, Huseyin]

        //5) remove(Object o): Belirtilen öğeyi listeden kaldırır ve boolean dondurur
        boolean m1=myList.remove("Ali");
        System.out.println(myList);//[Hasan, Zeynep, Veli, Ayse, Fatma, Huseyin]
        System.out.println(m1);//true

        //6)removeFirstOccurrence() metodu,
        // belirtilen bir öğeyi LinkedList içinde
        //bastan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
        //Eğer bu öğe birden fazla kez bulunuyorsa, en bastaki öğe kaldırılır.
        //Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.
        myList.add("Yusuf");
        myList.add(3,"Yusuf");
        System.out.println(myList);//[Hasan, Zeynep, Veli, Yusuf, Ayse, Fatma, Huseyin, Yusuf]

       // myList.removeFirstOccurrence("Yusuf");
       // System.out.println(myList);//[Hasan, Zeynep, Veli, Ayse, Fatma, Huseyin, Yusuf]


        //7) removeLastOccurrence metodu, belirtilen bir öğeyi LinkedList içinde
        //sondan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
        //Eğer bu öğe birden fazla kez bulunuyorsa, en sondaki öğe kaldırılır.
        //Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.
        myList.removeLastOccurrence("Yusuf");
        System.out.println(myList);//[Hasan, Zeynep, Veli, Yusuf, Ayse, Fatma, Huseyin]


        //8) peek() metodu, bir koleksiyonun ilk elemanına erişmek için kullanılır.
        // Bu metod, elemanı koleksiyondan kaldırmaz.
        // Bu metod, koleksiyon boşsa null dondurur)
        //myList.clear();
        //tring s1=myList.peek();
        //ystem.out.println(s1);
        //ystem.out.println(myList);


        //9)poll() metodu, bir koleksiyonun başındaki elemanı alır ve koleksiyondan kaldırır.
        // Bu metod, koleksiyon boşsa null döndürür.
       // myList.clear();
       // String s2 =myList.poll();
       // System.out.println(s2);
       // System.out.println(myList);


        //10) element() metodu, bir koleksiyonun başındaki elemanı alır, ancak elemanı koleksiyondan kaldırmaz.
        // Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar. (peek() null dondurur)
        // bir koleksiyonun boş olup olmadığını kontrol etmek için NoSuchElementException istisnasını kullanir
       // myList.clear();
       // String s3=myList.element();
       // System.out.println(s3);
       // System.out.println(myList);


        //11) pop() metodu, bir koleksiyonun ilk elemanını alır ve koleksiyondan kaldırır.
        // Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar.(poll() null dondurur)
       // myList.clear();
       // String s4=myList.pop();
       // System.out.println(s4);
       // System.out.println(myList);

        Queue<String>queue=new LinkedList<>();
        Deque<String>deque=new LinkedList<>();
        List<String>list=new LinkedList<>();

        String a="Ali Can";
        System.out.println(a.hashCode());

    }
}









