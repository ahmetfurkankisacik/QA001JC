package day18_dateTime_StringBuilder;

public class C07_Runner {
    public static void main(String[] args) {
        C06_AccesModifier obje1=new C06_AccesModifier();
        //System.out.println(obje1.name);
        System.out.println(obje1.adress);
        System.out.println(obje1.email);
        //System.out.println(obje1.tcKimlikNo);//ulasamadım cunku private yaptık
        System.out.println(obje1);
        Okul okul=new Okul();
        Okul.zilCal();//class ismi ile cagirdik obje olusturmamiza gerek kalmadi
        okul.yoklamaAl();//obje olusturmadan cagiramadik obje olusturmamız gerekli
    }
}
