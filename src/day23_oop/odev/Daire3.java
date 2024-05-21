package day23_oop.odev;

public class Daire3 extends Kat implements DaireBilgisi,KapiBilgisi{

    @Override
    public void daireNo() {
        System.out.println("Daire No : 3");
    }

    @Override
    public void kapiTuru() {
        System.out.println("Demir Kapı");
    }

    @Override
    public void zilSesi() {
        System.out.println("Kuğu sesi");
    }

    @Override
    public void kacinciKat() {
        System.out.println("Bu Daire 1. katta bulunuyor");
    }
}
