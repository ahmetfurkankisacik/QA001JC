package day18_dateTime_StringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {
//**String Builder methodlarinin en cok kullanilanlarini taniyalim

         String str="Java is easy";
         //artık kullanılcak bir yapı degil bunun daha kolayı
        // String bosStr="";
        //for (int i = str.length()-1; i >=0 ; i--) {
        //    bosStr+=str.charAt(i);
        //}
        //System.out.println(bosStr);
        //1-reverse(): StringBuilder Object'inin içeriğini ters çevirir.String class'ta yoktur
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);

        //2- deleteCharAt(int index): Belirtilen konumda(index'te) bulunan karakteri siler.
        sb.deleteCharAt(1);
        System.out.println(sb);//yae si avaJ, s gitti

        //3- delete(int start - dahil , int end - haric): Belirtilen aralıktaki karakterleri siler.
        sb.delete(0,2);//0'dan 2'ye kadar olan kısmı siler 0 dahil 2 dahil degil
        System.out.println(sb);//e si avaJ

        //4-replace(int start-dahil, int end-haric, String str): Belirtilen indexteki karakterleri verilen
        //stringle değiştirir.
        sb.replace(0,1,"Java");
        System.out.println(sb);//Java si avaJ

        //5-insert(int offset, String str): Belirtilen konumdan itibaren verilen stringi ekler.
        //offset aslinda index degildir ama index'mis gibi sayabiliriz
        sb.insert(5,"is ");
        System.out.println(sb);

        //6-compareTo() metodunun görevi, iki StringBuilder Objesini karşılaştırmaktır.
        // int değeri döndürür.Sozluk gibidir.Eğer iki StringBuilder nesnesi birbirine eşitse, 0 döndürür.
        // Eğer birinci StringBuilder nesnesi ikinci StringBuilder nesnesinden önce geliyorsa, negatif deger döndürür.
        // Eğer birinci StringBuilder nesnesi ikinci StringBuilder nesnesinden sonra geliyorsa, pozitif deger döndürür.
        // farkli olan iki harfin ascii kodlari arasindaki farki verir.
        // Ornegin; Bu sifir ve birler if'ler icerisinde kullanilarak iki Object arasindaki iliski belirlenmis olur
        StringBuilder sb2=new StringBuilder("Java is easy");
        StringBuilder sb3=new StringBuilder("Java is hard");
        System.out.println(sb2.equals(sb3));//false
        System.out.println(sb2.toString().equals(sb3.toString()));//1. yol
        System.out.println(sb2.compareTo(sb3));//0//-4//-3

        //7-StringBuilder, String'e gore zengin bir class degildir.Mesela toUpperCase,split yoktur.
        //**sb2.toLower yazinca, onermeyecektir.
        //7-toString() metodu, StringBuilder nesnesinin içeriğini bir String nesnesine dönüştürür.
        String str5=sb2.toString().toUpperCase();
        System.out.println(str5);

        //8-Append ve insert methodu kullanımlari
        //
        String string="Hava bugun cok guzel";
        StringBuilder sb4=new StringBuilder("Java cok kolay");
        sb4.insert(4,string,4,10);
        System.out.println(sb4);//yani biz istersek string bir degerin istedigimiz parcasini sb degerinin istedigimiz yerine ekleyebiliriz



    }
}
