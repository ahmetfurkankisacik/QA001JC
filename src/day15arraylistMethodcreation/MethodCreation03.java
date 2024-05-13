package day15arraylistMethodcreation;

public class MethodCreation03 {
    public static void main(String[] args) {
        System.out.println("carpim = " + carpma(12.5,7.9));
        System.out.println("Carpim = "+12.5*7.9);

    }
    //acces modifier  //static keyword'u  //return type //isimlendirme //parametre parantezi   //body dedigimiz islemlerin yapıldıgı parantez
      public            static              double        carpma        (double a,double b)     {
        return a*b;
      }
}
