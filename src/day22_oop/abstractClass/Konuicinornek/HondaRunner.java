package day22_oop.abstractClass.Konuicinornek;

public class HondaRunner {
    public static void main(String[] args) {
        //Honda h=new Honda();//Honda abstractir'dir obje olusturlamaz hatası veriyor


        Civic c = new Civic();
        c.engine();//Gas 1.6 Eco.

        Accord a=new Accord();
        a.engine();//Dizel 2.0

        a.music();//Pro seklinde de parenttaki concrete methodu direkt kullanibiliriz
    }
}
