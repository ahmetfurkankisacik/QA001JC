package day16passbyvalue_constructors_datetime;

public class BulasikMakinesiRunner {
    public static void main(String[] args) {
        BulasikMakinesi bulasikMakinesi1=new BulasikMakinesi("Arcelik","A202","Beyaz","15lt");
        System.out.println(bulasikMakinesi1.marka);
        System.out.println(bulasikMakinesi1.model);
        System.out.println(bulasikMakinesi1.renk);
        System.out.println(bulasikMakinesi1.kapasite);

    }
}
