package day22_oop.abstractClass.ornek;

public class Mercedes extends Otobus{
    @Override
    public void tekerSayisi() {
        System.out.println("8");
    }

    @Override
    public void yakitTuru() {
        System.out.println("Elektrikli");
    }

    @Override
    public void engine() {
        System.out.println("5000W");
    }

}
