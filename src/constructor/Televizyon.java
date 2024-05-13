package constructor;

public class Televizyon {
    //pasif ozellikler
    String marka;
    String model;
    String boyut;
    String kalitesi;
    int fiyat;
    boolean interneteBagliMi;

    int sesDuzeyi=0;

    //aktif ozellikler
    public void on(){
        System.out.println(marka+" aciliyor");
        System.out.println(marka+" acildi hosgeldiniz");
    }
    public void off(){
        System.out.println(marka+" kapatiliyor tekrar bekleriz");
        System.out.println(marka+" kapatildi!");
    }
    public boolean interneteBagla(){
        System.out.println("internete baglaniyor");
        System.out.println("internete baglandi");
        return true;
    }
    public void uygulamaYukle(boolean interneteBagliMi){
        if (interneteBagliMi){
            System.out.println("internet oldugu icin yukleme yapılıyor");
        }else {
            System.out.println("internet olmadigi icin yukleme yapılamıyor");
        }
    }
    public void uygulamaSil(){
        System.out.println("Uygulamayi silmek istediginizden emin misiniz");
        System.out.println("Uygulama siliniyor...");
        System.out.println("Uygulama silindi.");
    }
    public void sesAc(){
        System.out.println("ses aciliyor");
        sesDuzeyi+=3;
        System.out.println("Yeni ses duzeyi : "+sesDuzeyi);
    }
    public void sesKapat(){
        System.out.println("ses kapatılıyor");
        if (sesDuzeyi>0) {
            sesDuzeyi -= 3;
        }else {
            System.out.println("ses duzeyi negatif olamaz zaten tamamen kapatıldı");
        }
        System.out.println("Yeni ses duzeyi : "+sesDuzeyi);
    }



    //uygulama sil odev!!!!
    //ses acma kapatma odev!!!


    //3. pasif ozelliklere kolay deger atayabilmek icin constructor
    public Televizyon(String marka, String model, String boyut, String kalitesi, int fiyat, boolean interneteBagliMi) {
        this.marka = marka;
        this.model = model;
        this.boyut = boyut;
        this.kalitesi = kalitesi;
        this.fiyat = fiyat;
        this.interneteBagliMi = interneteBagliMi;
    }

    public Televizyon(){
    }
}
