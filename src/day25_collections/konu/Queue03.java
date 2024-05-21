package day25_collections.konu;

import java.util.Deque;
import java.util.LinkedList;

public class Queue03 {
    public static void main(String[] args) {
        //-------------------------
//Deque (Double-Ended Queue), hem başından hem de sonundan eleman eklemeye
// ve çıkartmaya izin veren bir veri yapısıdır.
// Deque, FIFO (first in first out) veya LIFO (last in first out) olarak sıralanabilir.

//Java'da deque'ler, Deque interface'iyle temsil edilir. Deque arabirimini uygulayan en yaygın class'lar ArrayDeque ve LinkedList sınıflarıdır.

        //Gündelik hayatta kullanılabilecek bazı Deque örnekleri:

//1) İnternet Tarayıcıları: İnternet tarayıcıları, kullanıcıların web sayfalarını gezdikçe
// birçok sayfayı bir araya getirir. Bu sayfaları tarayıcı geçmişi adı verilen bir veri
// yapısında saklar. Kullanıcılar geri ve ileri tuşlarına bastığında, bu geçmişteki sayfalar
// Deque mantığıyla işlenir. Kullanıcı son ziyaret ettiği sayfadan geri gitmek istediğinde
// veya ileri gitmek istediğinde Deque yapısı kullanılır.

//2) Geri Al/Yeniden Uygula: Çoğu yazılım uygulaması, kullanıcıların yaptıkları işlemleri geri
// almasına ve tekrar uygulamasına olanak tanır. Örneğin, metin düzenleyicilerde bir yazıyı
// yazdıktan sonra geri al (command + z) tuşuna bastığınızda, son yapılan işlem geri alınır.
// Bu işlemi uygulamak için bir Deque kullanabilirsiniz.

        //---------------Deque nasil olusturulur?
        Deque<String>d=new LinkedList<>();

        //Deque’e nasil eleman eklenir?
        //add(): Belirtilen öğeyi ekler
        d.add("Mehmet");
        d.add("Mahmut");
        d.add("Ekrem");
        d.add("Oya");
        d.add("Tansu");
        System.out.println(d);//[Mehmet, Mahmut, Ekrem, Oya, Tansu]
        //insert order ile ekleme yaptı

        //1) addFirst(E e): Deque'in başına bir öğe ekler. Dönüş türü void'dir çünkü
        // sadece eklemeyi gerçekleştirir ve değer döndürmez
        d.addFirst("Ali");//**Ayri satirlarda yazdirmak icin for acalim
        for (String each:d
             ) {
            System.out.println(each);
        }
        System.out.println("---------------");
        //2) addLast(E e): Deque'nin sonuna bir öğe ekler. Dönüş türü yine void'dir.
        d.addLast("Hasan");

        //3)removeFirst(): Deque'nin başındaki öğeyi kaldırır ve kaldırılan öğeyi döndürür.
        // Bu method E türünde bir değer döndürür.(Burda String)
        System.out.println(d.removeFirst());
        System.out.println(d);


        //4)removeLast(): Deque'nin sonunda öğeyi kaldırır ve kaldırılan öğeyi döndürür.
        // Bu method E türünde bir değer döndürür.(Burda String)
        System.out.println(d.removeLast());
        System.out.println(d);

    }
}
