package day18_dateTime_StringBuilder;

public class C05_StringBuffer {
    public static void main(String[] args) {
        //StringBuffer nasıl olusturulur
        StringBuffer sbf=new StringBuffer("Java");
        System.out.println(sbf);

        /*
        1) StringBuffer Java'da String ureten bir diger classtir.
        StringBuffer Java'nin String uretmek icin olusturdugu ilk classtir.

        2) StringBuffer, StringBuilder'a cok benzer, yani ikisi de "mutable-degistirilebilir" String uretir
        3) StringBuffer "multi-thread(coklu is parcacigini destekler)" dir,
        ama StringBuilder "multi-thread" degildir.
        4) StringBuilder "multi-thread" olmadigi icin StringBuffer'dan daha hizli calisir
        5) Multi-thread yapilirken, yapilan islerin siralamasi onem arzeder. Yapilan isleri mantikli bir
        siraya koymak "synchronization" olarak adlandirilir
        StringBuffer multi-thread oldugu icin ayni zamanda synchronized'dir

       Uc tane String olusturan class ogrendik;
       1) Immutable String lazimsa ==> String class
       2) Mutable String lazimsa , StringBuilder veya StringBuffer
                       a) StringBuilder'i multi-thread gerekmezse kullaniriz
                       b) StringBuffer'i multi-thread gerekirse kullaniriz
       */


    }
}
