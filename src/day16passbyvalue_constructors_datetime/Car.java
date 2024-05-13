package day16passbyvalue_constructors_datetime;

public class Car {

    //1- variable ler (pasif ozellikler) olusturalım
    String marka="Honda";

    String model="Civic";

    String renk="Kırmızı";

    int year=2024;

    String benzinTuru="Dizel";

    int kapiSayisi=4;

    //2-methodlari(aktif ozellikler) olusturalım

    public void hareket(){
        System.out.println("Araba calismaya basladi");
        System.out.println("Araba hızlanıyor");
        System.out.println(marka+" Hızlı hareket ediyor.");
    }

    public void dur(){
        System.out.println("Araba yavaslıyor");
        System.out.println("Araba durdu");
        System.out.println(marka+" Calismayi durdurdu");
    }
    //3 constructorlar
    //Access modifier    //class ismi         //parametre parantezi //body yani kodun yazildigi yer
    public               Car                   ()                  {

    }







}
