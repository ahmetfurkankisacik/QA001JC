package day18_dateTime_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        /*
1) "StringBuilder" class da String ureten bir class tir.
2) String class kullanarak String üretiriz, Java nicin StringBuilder classi da olusturdu?
   String class "immutable" (degistirilemez) String uretir,
   StringBuilder Class "mutable"(degistirilebilir) String üretir.
3) "immutable" olmak demek orjinal degerin korunmasi, değistirilemez olmasi demektir
   "mutable" olmak demek orjinal degerin değistirilebilir olmasi demektir
4) Bu nedenle, metin üzerinde sık sık ekleme, çıkarma veya değişiklik yapmanız gereken durumlarda
   StringBuilder kullanmak, daha verimli ve performanslı bir seçenek olabilir.
5)StringBuilder, metin verilerini eklemek, çıkarmak, değiştirmek veya döndürmek için çeşitli yöntemler
 ve işlevler içerir. Bunlar arasında append, delete, insert, replace gibi sık kullanılan yöntemler bulunur.
*/

        String str="Ali can javayi ogreniyor";
        String str1=str+"!";
        System.out.println(str.replace("a", "!"));
        System.out.println(str);


        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(str);

        //stringBuilder.append("Ali can javayi ogreniyor");
        //stringBuilder.replace(1,5,"Veli");
        stringBuilder.reverse();
        System.out.println("bu kısımda ne var ? : "+stringBuilder);
        //System.out.println(stringBuilder.reverse());
        //append() metodu, StringBuilder nesnesine yeni bir String eklemek için kullanılır.


    }
}
