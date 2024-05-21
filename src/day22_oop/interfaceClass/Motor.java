package day22_oop.interfaceClass;

public interface Motor {
/*Interface (arayüz), class'larin uygulayabileceği bir "sözleşme" olarak düşünülebilir.
 Bir interface, bir veya daha fazla abstract method içerir ve
bu methodların imzalarını (adlarını ve parametrelerini) belirtir,
ancak bu methodların nasıl uygulanacağını tanımlamaz.
Class'lar, bu interface'leri uygulayarak (implement ederek) bu methodları
kendi ihtiyaçlarına göre tanımlarlar.*/

    //i) interface icindeki method’lar otomatik olarak ‘public’ dir,
    // bu yuzden interface’lerde method olustururken access modifier yazmayiz.(static degillerdir)

    //ii) interface icindeki method'lar otomatik olarak 'abstract' dir, bu yuzden interface'lerde
   // abstract method olustururken 'abstract' keyword'unu ve 'method body' sini yazmayiz.


    /*
1) interface'lerden object olusturamazsiniz.(constructor'lari olmadigi icin eksik yapilardir)
2) interface'ler sadece parent olur
3) interface'ler yapilmasi sart olan seyleri depolamak icin olusturulur.
Bu yüzden interface'lere "to do list " de denir.(yapilacaklar listesi)

       child              parent

       class              class       ==> extends
       interface          interface  ==> extends -->Bir interface baska bir interface'in child'i olabilir

       class              interface  ==> implements
       interface          class      ==> olamaz -->Bir interface baska bir class'in child'i olamaz

*/
    /*4- Coklu interface parentlarin her birinin icine ayni isimli methodlar koyabiliriz
Mesela Motor’un, Klima’nin ve Fren’nin iclerine run() methodu koymak gibi.
Child class bu methodu override ettiginde bu methodun hangi interface'den geldiği belirsizdir.*/


    void eco();

    void turbo();

    void gas();

    void run();

    int fiyat=2500;

    /*7) Normalde interface icine concrete method konulamaz ama bazi özel durumlarda concrete
method koymak gerekirse;
   a) default keywordunu kullanarak bunu yapabiliriz
   b) static keywordunu kullanarak bunu yapabiliriz

==> static keywordunu kullanarak olusturdugumuz concrete methodlara ulasmak icin
object olusturmaya gerek yoktur. Interface ismi yeterlidir

==> default keywordunu kullanarak olusturdugumuz concrete methodlara interface'in child class'indan
object olusturarak ulasilabilir*/

}
