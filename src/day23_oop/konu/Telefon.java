package day23_oop.konu;

public class Telefon extends Teknoloji{
    @Override
    public void cipSayisi() {
        System.out.println("Telefonun icinde bulunan cip sayisi 750");
    }

    public void kameraSayisi(){
        System.out.println("Telefonda en az 2 kamera bulunmaktadir");
    }
    public String cipSayi="Telefonun icinde bulunan cip sayisi 750";

}
