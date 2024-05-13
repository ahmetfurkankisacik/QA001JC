package day17_dateTime_stringBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime05 {
    public static void main(String[] args) {
        /*LocalTime Class’ta kullanilan tarih saat formatlari
    HH : mm ==> 24'lu saat sistemi
    hh : mm ==> 12'li saat sistemi. AM, PM gosterilmez
    hh : mm a ==> 12'li saat sistemi. AM, PM gosterilir
    HH : mm : ss ==> saniyeyi gosterir
    HH : MM ==> yanlis format cunku MM aylar icin kullanilir
    "mm" "minute" demektir. "MM" "month" demektir.
    dd-MM-yyyy ==> gun - ay - yil
    MMM ==> Aug
    MMMM ==> August  */

        //Anlık zamanı nasıl alırız?
        //LocalTime kullanacagiz.
        //LocalTime, Java'nın java.time paketinde bulunan bir Class'tir ve sadece saat bilgisini
        //(saat, dakika, saniye ve milisaniye) temsil etmek için kullanılır.
        //Bu sınıf, tarih bilgisini içermez ve yalnızca saatle ilgilidir.
        LocalTime time=LocalTime.now();
        System.out.println(time);//12:13:58.262880600
        /*
        12 saat
        13 dakika
        58 saniye
        262 milisaniye
        kalan kısım mikrosaniye
         */
        //-suanin saatini dakikasini ve saniyesini bize dondurun
        //-suanin saniyesini bize dondurun
        //-10000 saniye sonrasini bize dondurun
        //-200 dakika onceki saati bize dondurun
        //-bize saati 3 yapip yazdirin(dakika ve saniye degismeden)
        System.out.println(time.getSecond());
        System.out.println(time.plusSeconds(10000));
        System.out.println(time.minusMinutes(200));
        System.out.println(time.withHour(15));
        System.out.println(time.withNano(0).withSecond(0).withMinute(0));


//ornek 2:"DateTimeFormatter", bir Class'tir ve tarih ve saat verilerini belirli bir biçimde görüntülemek, okumak ve işlemek için kullanılan önemli bir araçtır.
////DateTimeFormatter, tarih ve saat nesnelerini "metin" yani String olarak biçimlendirmenize ve metni tarih ve saat nesnelerine çözmenize olanak tanır.
////ofPattern() metodu, belirli bir kalıba (pattern) göre tarih ve zaman verilerini biçimlendirmek için kullanılır.
////format() method'u LocalTime'i String'e istedigimiz formatta cevirir
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("hh:mm a");//istedigimiz sekilde saatimiz formatlamayi yani istersem dakika/saat seklinde yazabilirim
        System.out.println(dtf1.format(time.minusHours(1)));//12:29

        LocalDate today=LocalDate.now();
        System.out.println(today);
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d/M/yy");//burda kac tane harf girdigimize gore tarih objesi degisiklik gosterir
        System.out.println(dtf2.format(today.plusMonths(1)));


    }
}
