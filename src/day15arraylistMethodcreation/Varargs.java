package day15arraylistMethodcreation;

public class Varargs {
    public static void main(String[] args) {
       int sonuc= toplama();
        System.out.println("sonuc = " + sonuc);
        System.out.println("concatination() = " + concatination("ali"," can", " bugun"," okula ","gelmedi","!"));
    }



    public static int toplama(int...a){
        int sum=0;
        for (int w:a
             ) {
            sum+=w;//sum=sum+w;
        }
        return sum;
    }
    public static String concatination(String...a){
        String str="";
        for (String w:a
             ) {
            str+=w;
        }
        return str;


        /* Varargs, bir methodun değişken sayıda argüman almasına izin veren bir özelliktir.
Varargs, "variable arguments" yani "değişken sayıda argüman"ın kısaltmasıdır.

Varargs, aşağıdaki kurallara tabidir:

1- Birden fazla varargs kullanilamaz. Varargs parametre, her zaman son parametre olmalıdır.
Yoksa veri tabani surekli veri kabul eder ve diger parametreye gecemez.
main ici toplama(int... a, int... b) olmaz. toplama(int b, int... a) olur
2- Varargs arka planda Array yapisini kullanir
3- Varargs parametre, bir primitive veri tipi veya non-primitive(referans) olabilir.
4- Varargs parametre, aynı türdeki birden fazla argüman alabilir.
5- Varargs parametre, sıfır argüman alabilir. main ici toplama(); olabilir*/
    }
}
