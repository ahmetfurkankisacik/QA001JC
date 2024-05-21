package day20_oop.ornek;

public class HondaRunner {
    /*
Soru: Peki child bir class'ta Object olusturuldugunda, Parent bunu nasil algiliyor da
kendi constructor'unu calistiriyor?

Cevap: Super() cagrisi ile yapilir. Super çağrısı, bir child class'ın constructor'unda,
parent class'in parametresiz constructor'unu çağırmak için kullanılan bir ifadedir.

super() çağrısı, bir child class'ta bir object oluşturulduğunda, otomatik olarak çağrılır.
Ancak, super() çağrısını manuel olarak da çağırabilirsiniz.
Bunu yapmak için, super() ifadesini, child class'ın constructor'unun başında kullanabilirsiniz.
Manuel olarak yazarsaniz parametreli constructor'lari da cagirabilirsiniz.

Neden super cagrisi yapalim?

1- super keyword'unu kullanirsaniz, hem parent class'in methodunu çağırabilir hem de bu
methodun davranışını child class'in ihtiyacına göre değiştirebilirsiniz.

2 - extends ise sadece miras almayı sağlar, ancak parent class'in methodlarını değiştirmez.
*/

    /*Soru : Ayni class'taki constructor'lar arasinda gezinebilir miyim?
Ornegin Car class'tan hem sedan hem de sport modellerini ayni anda alip diger ortak ozelliklerle birlikte
uretime sokabilir miyim? Evet.

Cevap : Ayni class'taki constructor'lar arasinda gezinmek icin super() silinir ve this() keyword'u kullanilir.
 this() default olarak parametresiz constructor'i secer.

this() ve super() her zaman ilk satirda olmalidir.
Bu yuzden bir constructor'da ikisi bir arada kullanilamazlar.*/

/*Soru : super() keyword’u kullanilarak parent class’taki constructor’lar degil de,
 variable’lar ve methodlar secilebilir mi?  Evet.
Cevap : child’da bir constructor icinde, super yazip parantez koymadan, nokta koyup
 parent’taki variable veya methodlara ulasabiliriz */

    public static void main(String[] args) {
        Honda h=new Honda();//civic+sedan+honda,2020,LPG'li


        //Car c=new Car();
        //Car d=new Honda();

    }
}
