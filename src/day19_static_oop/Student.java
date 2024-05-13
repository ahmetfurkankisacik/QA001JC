package day19_static_oop;

public class Student {
    /*
1) static variable veya static methodlar (class member) tum object'ler icin ortak elemandir
2) static class member'lar uzerinde yapilan degisiklikler tum objectleri etkiler.
3) static class member'lar class'a, non-static class member'lar object'lere aittir
4) static class member'lara ulasmak icin object olusturmaya gerek duyulmaz,
   ama non-static class member'lara ulasmak icin object olusturmak sarttir
5) static variable'larin diger adi class variable'dir,
   non-static variable'larin diger adi instance variable veya object variable'dir
 */

    public static long sayac=1000;

    public String name="Ali Can";

    public String sacRengi="Kahverengi";
    public static String tahtaBilgisi="15+7=22,18+25=43";
    public long ogrenciNo;
    public Student(){

    }

    {
        this.ogrenciNo=sayac;
        sayac++;
    }
    public Student(String name, String sacRengi) {

        this.name = name;
        this.sacRengi = sacRengi;
    }

    public static void tahtayiSil(){
        tahtaBilgisi="             ";
    }

    public void saciniBoya(){
        sacRengi="Sarı";
    }





}
