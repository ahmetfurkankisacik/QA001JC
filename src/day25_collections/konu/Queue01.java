package day25_collections.konu;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
    /* Java'da Queue, verilerin belirli bir düzen içinde saklandığı ve işlendiği bir veri yapısıdır.
   Ilk giren ilk çıkar (FIFO-first in first out) prensibine dayanır, yani ilk eklenen obje ilk çıkarılır.
   Queue, sıralı işlemler ve verilerin işlenmesi için kullanılır. Araya eleman eklemek mümkün değildir.

    İşte gerçek dünyadan birkaç örnek:
 Sıra Kuyruğu (Queue): Sıra bekleyenlerin önünde olan kişi önce hizmet alır. Bir örnek olarak,
     bir fast-food restoranındaki siparişlerin işlenmesini düşünebilirsiniz.
    İlk gelen sipariş, ilk hazırlanan ve teslim edilen sipariştir.
 Bilet Sırası: Bir konser veya etkinlik için bilet almak isteyen kişiler sıraya girerler.
     Biletler, sırayla satılır ve ilk gelen kişi ilk biletini alır.
 Çağrı Sırası: Müşteri hizmetleri çağrı merkezindeki müşteriler, sırayla operatörlere bağlanır.
    İlk çağrı bekleyeni önce konuşur, ardından sıradaki çağrı alınır.
 Dosya İşleme: Bilgisayar işletim sistemleri ve uygulamalar, dosyaları sırayla işlerler.
    Bir dosya işlem tamamlandığında, sıradaki dosya işlenir.

Kuyruğun çalışma mantığı, elemanların kuyruğun sonuna eklenip başından çıkarılması şeklinde gerçekleşir.
Queue, sıralı işlemler veya veriler gerektiğinde kullanışlıdır.

Queue interface'i, LinkedList ve PriorityQueue gibi farklı sınıflar tarafından uygulanabilir. */
    public static void main(String[] args){
        //Queue nasil olusturulur?

        Queue<String>depo=new LinkedList<>();
        //Java'da Queue bir arayüz(interface) olduğu için doğrudan bir Queue nesnesi oluşturulamaz.
        // Bunun yerine, Queue arayüzünü implemente eden bir sınıfın nesnesini oluşturmanız gerekir.
        //Bunu yapan yaygın sınıflardan biri LinkedList'tir.
        //PriorityQueue ve ArrayDeque de olabilirdi

        //Queue<String> depo = new LinkedList<>(); burada depo nesnesi queue mudur? linkedlist mi?

        //Bu ifadede depo nesnesi hem bir Queue hem de bir LinkedList'tir,
        //ancak burada önemli olan depo nesnesinin türünün nasıl tanımlandığıdır.
        //Java'da, bir nesne hem bir arayüzün (Queue) hem de bu arayüzü implemente
        //eden bir sınıfın (LinkedList) örneği olabilir.
        //Ancak, bu durumda depo nesnesine erişim ve onunla etkileşim
        //Queue arayüzü üzerinden tanımlanan metodlarla sınırlandırılmıştır.

        //Queue'ya nasil eleman eklenir?
        //1)add(): Belirtilen öğeyi kuyruğa ekler.
        depo.add("süt");
        depo.add("et");
        depo.add("yumurta");
        depo.add("peynir");
        System.out.println(depo);//[süt, et, yumurta, peynir]

        //2) remove(): Kuyruğun başındaki öğeyi kuyruktan kaldırır ve döndürür.
        // Kuyruk boşsa bir istisna fırlatır.

        String s=depo.remove();
        System.out.println(s);
        System.out.println(depo);

        //3)peek(): Kuyruğun başındaki öğeyi döndürür, kuyruk boşsa null döner.
        System.out.println(depo.peek());
        System.out.println(depo);

        //4)clear() metodu, kuyruğun içindeki tüm öğeleri kaldırır, böylece kuyruk boş bir duruma gelir.
        depo.clear();
        System.out.println(depo);

        //5)poll(): Kuyruğun başındaki öğeyi kuyruktan kaldırır ve döndürür. Kuyruk boşsa null döner.
        String s1=depo.poll();
        System.out.println(s1);

        //6)element(): Kuyruğun başındaki öğeyi döndürür, ancak kuyruk boşsa bir istisna fırlatır.
        //System.out.println(depo.element());//NoSuchElementException verdi cunku queue bos.


    }
}
