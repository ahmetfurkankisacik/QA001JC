package day26_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps01 {
    //1) Map'ler sozluk gibidir. Aciklamalidir.  orn: Ali = 13 .Map'ler collections degildir. Ordan miras almaz
//2) Sol taraf yani key'ler tekrarsizdir. Value tarafi tekrarli olabilir.
//3) Key tarafi icin Set kullanilir. Values için ise genellikle Collection yapısı kullanılır.
//4) Map'in elemanlarina komple 'entry set' (giris elemani) denir.

    //Map nasil olusturulur?
    public static void main(String[] args) {

        //1) HashMap: Key-value çiftlerini rastgele bir sırayla depolayan bir Map türüdür.En hizlisidir.
        //burada 'add' calısmaz cunku 'add' eleman ekler, ben ise bir entry set ekleyecegim
        //onun icin 'put' kullanilir,kısa yolu yoktur
        HashMap<String,Integer>myMap=new HashMap<>();
        myMap.put("Ali Can",13);
        myMap.put("Veli Han",18);
        myMap.put("Ayse Kaya",15);
        myMap.put("Fatma Yilmaz",19);
        myMap.put("Ali Can",25);//key tekrarli kullanilirsa son value aktif olur(override). ustune yazar
        System.out.println(myMap);//{Fatma Yilmaz=19, Ali Can=25, Veli Han=18, Ayse Kaya=15}

        //Sadece 'key' degerlerini nasil alabiliriz?
        //keySet(): Map'teki tüm key'lerin bir set'ini döndürür.Set'in sırası rastgeledir.
        Set<String>keyTarafi=myMap.keySet();
        System.out.println(keyTarafi);

        //Sadece 'value' degerlerini nasil alabiliriz?
        //values():Map'teki tüm value'ların bir collection'ını döndürür.Collection'ın sırası rastgeledir.
        Collection<Integer>valueTarafi=myMap.values();
        System.out.println(valueTarafi);//[19, 25, 18, 15]

        //get(): Bir key'e karşılık gelen değeri döndürür.key verirsiniz value’sunu getirir
        Integer yas =myMap.get("Ali Can");
        System.out.println(yas);

        //Ornek 1: myMap'deki kisilerin yaslarinin ortalamasi nedir?
        Collection<Integer>yaslar=myMap.values();
        int toplam=0;
        for (Integer w:yaslar) {
            toplam+=w;//toplam=toplam+w;
        }
        System.out.println(toplam/yaslar.size());//19
        System.out.println("-------------------------");

        //entrySet() metodu, HashMap'in tüm degerlerini içeren bir Set döndürür.
        // Dongu gibi ayri satirlarda yazdirir.Cunku Loop'lar direkt Map'ler ile kullanilamaz.
        //Bu yuzden ozel method gelistirilmis. Set’in icinde Map yapisi saklanir.
        System.out.println(myMap);//{Fatma Yilmaz=19, Ali Can=25, Veli Han=18, Ayse Kaya=15}

        Set<Map.Entry<String,Integer>>myEntrySet=myMap.entrySet();
        System.out.println(myEntrySet);//[Fatma Yilmaz=19, Ali Can=25, Veli Han=18, Ayse Kaya=15]

        for ( Map.Entry<String,Integer> w:myEntrySet
             ) {
            System.out.println(w);
        }
        System.out.println("--------------------------------");

    }}
