package day21_oop.encapsulation;

public class Student {

    //3.Encapsulation: Data hiding(Veri Saklama)
// OOP mantiginda class uyelerine erisimi sinirlandirabilirsiniz.
// Bunu access modifier(erişim değiştiricileri)’larla yapabilirsiniz
    /*

Ama class'a ulasim disinda 'access modifier' larla yapamadigimiz bazi seyleri 'encapsulation' ile yapabiliriz.

1) Encapsulation, verileri koruma ve gizleme amacı taşır. Encapsulation kullanarak
read ve write (okuma ve yazma) ozelliklerini birbirinden ayri olarak tanimlayabiliriz.
2) İstedigimize okuma, istedigimize yazma yetkisi veririz. ***Bazi insanlar bilgiyi sadece
gorsun ama degistiremesin. (Mesela,bir personel bir rapora fiyat bilgisi girsin-write-
ama rapor sonucunu(sirket kar zararini) goremesin. Sirket muduru de raporu okusun -read- ama degistiremesin.
CEO'da maliyet artislarini yansitabilmek icin hem okusun hemde yazsin gibi)

a) Data nasil saklanir?
Access modifier'larini 'private' yaparak datayi diger class'lardan gorunmez hale getiririm
boylece data'yi saklamis olurum.

b) Data'yi sakladin ama okuman gerekirse ne yapacaksin?
get() method'lar olusturarak saklanmis datalari diger class'lardan okuyabilirim

c) Data'yi sakladin ama o data'yi degistirmen gerekirse ne yapacaksin?
set() method'lar olusturarak saklanmis datalari diger class'lardan degistirebilirim

d)Hem okunabilir hemde yazilabilsin diyorsaniz, hem getter hemde setter method'u ayni anda olusturmaliyiz.
 */

//Ornek: Student class’i icinde data girislerini yaptiktan sonra getter ve setter method'larini uygulayiniz.
    public String name="Ali Can";
    //1- age ve successful datalarini okunabilir yapalim. Getter metodu okuma yaptigi icin parametre almaz
    private int age=13;
    private boolean succesful=true;


    public int getAge() {
        return age;
    }

    public boolean isSuccesful() {
        //is soru anlamı katıyor. basarili mi? true ya da false
        return succesful;
    }


    //2- age ve successful datalarini degistirilebilir yapalim.
    // Setter metodu yeni data uretmez, var olan datayi degistirir
    //bu yuzden return type'lari hep void olmalidir.

    public void setAge(int age) {
        this.age = age;
        //Bu durumda, this kullanımı gereklidir çünkü sadece age yazıldığında Java,
        // en yakın kapsamdaki değişkeni (yani metot parametresini) kullanır.
        //Yani kendi icine atama yapar, yukardaki age’i secmez
    }


    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }


/*Soru 2:  encapsulation'da set ile verileri degistirebiliyoruz.
 constructorlar ile de degistirebiliyoruz. farki nedir

 Cevap 2: setter metodları mevcut bir nesnenin verilerini değiştirmek için kullanılırken,
 constructorlar yeni nesnelerin başlangıç durumunu belirlemek için kullanılır.
 İkisi de encapsulation'ın bir parçasıdır ve sınıfın verilerinin güvenli
 bir şekilde yönetilmesine yardımcı olur.*/
}
