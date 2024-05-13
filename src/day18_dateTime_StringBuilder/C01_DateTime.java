package day18_dateTime_StringBuilder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_DateTime {
    public static void main(String[] args) {
        /*
       odev!!!
           soru 3)
           bize bugunun tarihini ve su anki saati dondurun
           bize 3 ay 100 saat sonraki tarih ve saati dondurun
           bize 100 gun once 100 saat sonraki tarihi dondurun
           bize 3 yil 5 ay 10 gün 1000 saat sonraki tarihin haftanin hangi günü oldugunu dondurun
           bize sadece bugunun tarihi dondurun
            //LocalDateTime kullanarak yapın tum hepsini
        */
        LocalDateTime ldt=LocalDateTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd.MM.yyyy \nhh:mm a");
        System.out.println(dtf.format(ldt));
        System.out.println(dtf.format(ldt.plusMonths(3).plusHours(100)));
        System.out.println(ldt.minusDays(100).plusHours(100).toLocalDate());
        System.out.println(ldt.plusYears(3).plusMonths(5).plusDays(10).plusHours(1000).getDayOfWeek());
        System.out.println(ldt.toLocalDate());
    }
}
