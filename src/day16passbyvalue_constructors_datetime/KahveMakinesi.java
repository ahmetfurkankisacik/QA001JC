package day16passbyvalue_constructors_datetime;

public class KahveMakinesi {
    /*
    //pasif
    marka
    model
    renk
    kahveTuru
    //aktif
    kahveYapımı
     */
    String marka="Philips";
    String model="P01";
    String renk="Siyah";
    String kahveTuru="Kahve-Cekirdek";

    @Override
    public String toString() {
        return "KahveMakinesi{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", kahveTuru='" + kahveTuru + '\'' +
                '}';
    }

    public void kahveYap(){
        System.out.println("Makine Calisiyor...");
        System.out.println("Kahve Hazirlaniyor...");
        System.out.println("Kahve hazir! ");
        System.out.println("Afiyet Olsun <3");
    }

    public void on(){
        System.out.println("Makine baslatiliyor...");
        System.out.println("Su ısıtılıyor...");
    }

    public void off(){
        System.out.println("Makine sogutuluyor...");
        System.out.println("Makine temizleniyor...");
        System.out.println("Bye Bye");
    }
    public String kahveOgutme(){
        System.out.println("Cekirdekler ogutuluyor...");
        System.out.println("toz kahve kullanıma hazır");
        return"Toz kahve";
    }

}
