package day17_dateTime_stringBuilder;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime04 {
    public static void main(String[] args) {
        //ornek 2:  Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.​
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen dogum tarihiniz yil ay gun olarka giriniz");
        int year= input.nextInt();
        int month= input.nextInt();
        int day= input.nextInt();
        LocalDate date=LocalDate.of(year,month,day);
        System.out.println(date.getDayOfWeek());


    }
}
