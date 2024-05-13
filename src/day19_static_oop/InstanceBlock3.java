package day19_static_oop;

public class InstanceBlock3 {
    //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.

    public String renk;
    public String yakitTuru;
    public String ruhsat;



    //IntanceBlock her obje olusturuldugunda calisir

    {
        renk="Siyah";
        yakitTuru="Benzin";
    }

    public InstanceBlock3() {
        System.out.println("Araba Rengi : "+renk);
        System.out.println("Araba yakıt türü : "+yakitTuru);
    }

    public InstanceBlock3(String renk, String yakitTuru) {
        this.renk = renk;
        this.yakitTuru = yakitTuru;
    }

    public InstanceBlock3(String renk, String yakitTuru, String ruhsat) {
        this.renk = renk;
        this.yakitTuru = yakitTuru;
        this.ruhsat = ruhsat;
    }

    public InstanceBlock3(String ruhsat) {
        this.ruhsat = ruhsat;
    }

    @Override
    public String toString() {
        return "InstanceBlock3{" +
                "renk='" + renk + '\'' +
                ", yakitTuru='" + yakitTuru + '\'' +
                ", ruhsat='" + ruhsat + '\'' +
                '}';
    }
}
