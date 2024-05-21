package day23_oop.odev;

public class Daire1 extends Kat implements DaireBilgisi,KapiBilgisi,kisiBilgisi{
    @Override
    public void kacinciKat() {
        System.out.println("Bu Daire zemin katta bulunuyor");
    }

    @Override
    public void daireNo() {
        System.out.println("Daire No : 1");
    }

    @Override
    public void kapiTuru() {
        System.out.println("Çelik Kapı");
    }

    @Override
    public void zilSesi() {
        System.out.println("Kuş sesi");
    }

    @Override
    public void isim() {
        System.out.println("Ali");
    }

    @Override
    public void soyIsim() {
        System.out.println("Can");
    }

    @Override
    public void yas() {
        System.out.println("32");
    }

    // @Override
   // public void lambaYaniyorMu() {
   //     System.out.println("Evet lambasi geceleri yaniyor");
   // }


}
