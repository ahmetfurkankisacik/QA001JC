package day17_dateTime_stringBuilder;
import java.time.LocalDate;

public class DateTime02 {
    public static void main(String[] args) {
         /*
       soru 1)
       -a)bugunun tarihini obje olusturarak yazdirin
       -b)bugun yilin kacinci gunu oldugunu yazdirin
       -c)hangi gunde oldugumuzu yazdirin
       -d)yılın bitmesine kac gun kaldıgını yazdırın
       -e)bugunden itibaren 3yil 5 ay 7gun sonraki tarihi yazdirin
       -f)bugunden itibaren 2yil 2 ay 2 gun sonraki tarihin ayin kacinci gunu oldugunu yazdirin
       -g)bugunden itibaren 7yil 7 ay 7 gun sonraki tarihin haftanin hangi gunu oldugunu yazdirin
       -k)ikinci bir tarih objesi olusturun ve iki tarihi karsilastirin ve bize eski olan tarihi dondurun
*/
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.getDayOfYear());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.lengthOfYear() - today.getDayOfYear());
        System.out.println(today.plusYears(3).plusMonths(5).plusDays(7));
        System.out.println(today.plusYears(2).plusMonths(2).plusDays(2).getDayOfMonth());
        System.out.println(today.plusYears(7).plusMonths(7).plusDays(7).getDayOfWeek());
        LocalDate tarih=LocalDate.of(2025,1,25);
        if (tarih.isBefore(today)){
            System.out.println(tarih);
        }else {
            System.out.println(today);
        }

    }
}
