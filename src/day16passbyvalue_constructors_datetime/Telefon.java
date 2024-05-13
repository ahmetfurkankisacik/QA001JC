package day16passbyvalue_constructors_datetime;

public class Telefon {
    //Java bir class olusturdugumuzda java otomatik olarak o class'a
    // constructor ekler fakat biz bir constructor olusturdugumuz anda
    // Java derki : sen zaten constructor olusturabiliyorsun o zaman
    // benim constructoruma ihtiyacin yok

    String marka;
    String model;
    String renk;
    int kameraSayisi;

    @Override
    public String toString() {
        return "Telefon{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", kameraSayisi=" + kameraSayisi +
                '}';
    }

    public Telefon(String marka, String model, String renk, int kameraSayisi){
        this.marka=marka;
        this.model=model;
        this.renk=renk;
        this.kameraSayisi=kameraSayisi;
        System.out.println("Telefon objesi olusturuldu ve Telefon kullanıma hazır");
    }
}
