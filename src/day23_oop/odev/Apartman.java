package day23_oop.odev;

import java.time.LocalDate;

public class Apartman {
    public String mahalle="Hanse";
    public String name="OOP apartmani";

    public boolean aidatOdendiMi=false;
    public static final String aidat="Aidat 50€ olarak ayarlanmıştır.";

   public void aidatOde(){
       if (aidatOdendiMi){
           System.out.println("siz zaten aidati odediniz bir dahaki ay gorusmek uzere");
       }else {
           System.out.println("aidati odediginiz tesekkurler bidahaki ay gorusmek uzere");
           aidatOdendiMi=true;
       }
   }
    //kullanıcı aidati 3 ay boyunca odemezse olusacak bir uyarı mesajı veriniz
    public void aidatBilgisi(){
        LocalDate date=LocalDate.now();
        if (date.getDayOfMonth()==15){
            System.out.println("ayin 15i oldugu icin aidat bilginiz 0'lanmıstır");
            aidatOdendiMi=false;
        }

        if (aidatOdendiMi){
            System.out.println("siz zaten aidati odediniz bir dahaki ay gorusmek uzere");
        }else {
            System.out.println("aidati odediginiz tesekkurler bidahaki ay gorusmek uzere");
            aidatOdendiMi=true;
        }

    }


    public void temelBilgi(){
        System.out.println("Apartman 4 katlıdır ve 2 giriş çikişi vardir");
        System.out.println("Bahçesinde şadırvan barindirir ve kucuk bir oyun alanı vardir");
        System.out.println("16 araclik park yeri bulundurmaktadir");
    }





}
