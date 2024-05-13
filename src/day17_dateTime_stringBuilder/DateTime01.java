package day17_dateTime_stringBuilder;


import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        //ornek 1: now(): Geçerli tarihi alır. Tarih bilgisini yerel bilgisayarınızın saatinden alır, ​
        // yani sizin bilgisayarınızın saatinden gelir
        LocalDate today = LocalDate.now();//gecerli tarihi alur tarih bilgisini bilgisayarimizda
        //hangi tarih varsa o tarihi alır


        //ornek 2 : getMonthValue(): Tarihin ayını (1-12 arasında) alır.​
        //getMonth(): Bu metod ayı dondurur. (Month enum türünde)
        System.out.println("today = " + today);
        System.out.println(today.getMonthValue());//Tarihin ayini(1-12 arasinda)alır
        System.out.println(today.getMonth());//Ayın adını bize dondurur
        //Java'da Month veri türü, bir enum (enumeration) türüdür (numaralandırma türüdür).
        //Degisme ihtimali olmayan datalari depolamak icin kullanilir. Haftanin gun isimleri, Ay isimleri gibi

        //ornek 3: getYear(): Tarihin yılını alır.
        System.out.println(today.getYear());//2024, int deger olarak dondurdu
        System.out.println(today.getDayOfYear());//127 yilin 127. gunu

        //ornek 4:getDayOfMonth(): Ayin gününü alır.
        System.out.println(today.getDayOfMonth());//5
        System.out.println(today.getDayOfWeek());//haftanin gununu alır ve yine ayni sekilde bir enum deger dondurur

        //ornek 5:
        //ileriki tarihe nasil gidilir?
        //plusDays(): Belirtilen gün sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //plusMonths(): Belirtilen ay sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //plusYears(): Belirtilen yil sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //Bu methodlar, orijinalleri değiştirmez, yeni bir gun, ay ve tarih nesnesi oluşturur.
        System.out.println("bugun : " + today);//2024-05-06
        System.out.println("yarin : " + today.plusDays(1).plusMonths(1).plusYears(1));//2024-05-07
        System.out.println("Bir ay sonra : " + today.plusMonths(1));//2024-06-06
        System.out.println(today);//2024-05-06

        //---------------
        /*ornek 6:Gecmis tarihe nasil gidilir?
        minusYears(): Bir LocalDate veya LocalDateTime nesnesinden belirtilen yıl sayısını çıkarır.
        minusMonths() : Bir LocalDate veya LocalDateTime nesnesinden belirtilen ay sayısını çıkarır.
        minusDays() : Bir LocalDate veya LocalDateTime nesnesinden belirtilen gün sayısını çıkarır.
        Sonuç olarak, çıkarma işleminden sonra elde edilen tarihi döndürürler.*/
        System.out.println("bugun : "+today);//2024-05-06
        System.out.println("bir hafta oncesi : "+today.minusWeeks(1));//2024-04-29

        //ornek 7: Specific bir tarih objesi nasil olusturulur?
        //of(int year, int month, int dayOfMonth): Belirtilen yıl, ay ve günle bir LocalDate örneği oluşturur.
        LocalDate date=LocalDate.of(2001,1,9);
        System.out.println(date);

        //isAfter(): Bir tarihin başka bir tarihten sonra olup olmadığını kontrol eder.boolean verir
        //isBefore(): Bir tarihin başka bir tarihten once olup olmadığını kontrol eder.boolean verir
        System.out.println(date.isAfter(today));//date objesi bugunden sonra mi?//false
        System.out.println(date.isBefore(today));//date objesi bugunden önce mi?//true
        System.out.println(date.isEqual(today));//date objesi bugune esit mi?//false
        System.out.println(date.isLeapYear());//artik yil kontrolu yapar?//false
        System.out.println(today.isLeapYear());//artik yil kontrolu yapar?//true

        //--------------
        //ornek 8: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen verilen sira ile tarih bilgisini giriniz. yil-ay-gun");
        int year=input.nextInt();
        int month=input.nextInt();
        int day=input.nextInt();
        LocalDate girilenTarih=LocalDate.of(year,month,day);
        if (girilenTarih.isBefore(today)){
            System.out.println("Gecersiz tarih girdiniz");
        }else {
            System.out.println("Zamani girebilirsiniz");
        }


    }
}
