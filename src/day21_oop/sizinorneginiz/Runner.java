package day21_oop.sizinorneginiz;

public class Runner {
    public static void main(String[] args) {
       //Honda honda1=new Honda();
       // honda1.petrolTuru();
       // System.out.println(honda1.model);//Honda classında geldi
       // System.out.println(honda1.aracTuru);//Vehicle classindan geldi
       // System.out.println(honda1.marka);//Araba classından geldi
       // System.out.println(honda1.motorGucu);//Honda classindan geldi
       // System.out.println(honda1.getRuhsatBilgisi());//ruhsat bilgisi degistirelemeyecegi icin gizlendi yani encapsulation edildi
        Araba araba2 =new Honda();
        System.out.println(araba2.marka);//Honda,Araba classindan geldi
        System.out.println(araba2.aracTuru);//Araba,Vehicle classindan geldi
        //araba2.model//model bilgisi honda classında verilen bir bilgi bundan dolayı yazdiramadim
        araba2.petrolTuru();

    }
}
