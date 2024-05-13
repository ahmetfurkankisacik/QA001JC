package day15arraylistMethodcreation;

public class MethodCreation {

    public static void main(String[] args) {
        /* Method Creation - Metot Olusturma
        Java'da method nasil olusturulur?

        1-main method'un disinda, class'in icinde olusturulur
        2-Syntax'i: Access Modifier + Return Type + Method ismi + () + {}
        3-Olusturulan method nasil kullanilir?
            Main icinden method cagrisi yapilmalidir. Buna method Call denir.

*/
        //int toplam=toplama(5,6);
        //System.out.println(toplam);
        String yon="Araba Su anda aktif olarak düz ilerlemekte";
        yon=solaDon();
        System.out.println("Yon : "+yon);


    }

    //void hicbir sey dondurmemeyi saglar genelde yazdırma islemleri icin kullanilir
    public static int toplama(int a,int b){
        System.out.println(a + b);
        return a+b;
    }
    public static String solaDon(){
        System.out.println("Araba Sola dondu");
        return "Araba artık soldan aktif bir sekilde duz ilerlemektedir";
    }

}
