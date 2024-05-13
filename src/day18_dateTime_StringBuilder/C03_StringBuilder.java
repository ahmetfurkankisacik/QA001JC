package day18_dateTime_StringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {
        //StringBuilder olusturma yontemleri
        StringBuilder sb1=new StringBuilder();
        System.out.println(sb1.capacity());
        sb1.append("Ali can");
        System.out.println("ali can degeri eklendikten sonra : "+sb1.capacity());
        sb1.append(" Javayi");
        System.out.println(" javayi degeri eklendikten sonra : "+sb1.capacity());
        sb1.append(" ogrendi");
        System.out.println(" ogrendi degeri eklendikten sonra : "+sb1.capacity());
        //bu ici bos bir sb(StringBuilder) olusturur
        System.out.println("sb1 objesi icinde acaba ne var : "+sb1);
        System.out.println("------------------------------------");
        StringBuilder sb2=new StringBuilder("Java candır");
        //bu ise belli bir baslangic degeri iciren sb olusturur
        System.out.println("sb2 objesi icinde acaba ne var : "+sb2.capacity());


        //-------------------------------------
        System.out.println("------------------------------------");
        StringBuilder sb3=new StringBuilder(10);
        System.out.println("sb3 objesi icinde acaba ne var : "+sb3.capacity());

    }
}
