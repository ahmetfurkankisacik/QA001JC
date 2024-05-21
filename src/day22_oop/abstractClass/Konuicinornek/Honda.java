package day22_oop.abstractClass.Konuicinornek;

public abstract class Honda {
    /*
            4- Abstraction(Soyut)
    Abstraction iki bolumden olusur.
    i) Abstract Class:
    Kendisinden object olusturulmaz. Bazi class'lari obje olusturmak amaciyla degil,
    objeleri gruplara ayirmak ve genel ozellikleri belirlemek icin olustururuz.
    Baslangic degil, sonuctur.
            */

    /*
  1)Abstract method'larin body'si olmaz.Size ne yaptigini soyler,nasil yaptigini soylemez.

  2)Body'si olan method'lara 'non-abstract' veya 'concrete' (somut) method denir

  3)Abstract method'lar tum child class'lar tarafindan override edilmelidir yani kullanilmalidir.

  4)Abstract method'lar ancak abstract class'lar icinde olusturulabilir.

  5)Abstract class'lar hem 'abstract method' hem de 'concrete method' icerebilirler.

  6)Concrete method'lar child class'lar tarafindan istenirse override edilebilirler
*/

    /*Final Class'lar: Bir class final olarak işaretlendiğinde, bu class başka hiçbir class tarafından genişletilemez (extend edilemez)
 yani miras alınamaz. Bu, final sınıfların alt sınıfları olamayacağı anlamına gelir.
 Bu nedenle, final class’lar abstract olamaz çünkü abstract sınıflar genişletilmek ve
 abstract metodları implement etmek üzere tasarlanmışlardır.*/


    /*Abstract method'lar ancak abstract class'lar icinde olusturulabilir.
    o yuzden hatayi gidermek icin public ile class arasinda abstract yazariz
     */
    public void music(){
        System.out.println("Pro");
    }
    public abstract void engine();

}
