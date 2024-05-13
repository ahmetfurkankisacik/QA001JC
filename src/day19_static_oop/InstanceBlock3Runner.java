package day19_static_oop;

public class InstanceBlock3Runner {
    public static void main(String[] args) {
        InstanceBlock3 obj1=new InstanceBlock3();//Araba Rengi : Siyah,  Araba yakıt türü : Benzin
        InstanceBlock3 obj2=new InstanceBlock3("A1754BHY23");
        System.out.println(obj2);
        //System.out.println(obj2.renk);//Siyah
        //System.out.println(obj2.ruhsat);//A1754BHY23
        //System.out.println(obj2.yakitTuru);//Benzin

    }
}
