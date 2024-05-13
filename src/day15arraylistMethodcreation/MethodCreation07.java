package day15arraylistMethodcreation;

import java.util.Scanner;

public class MethodCreation07 {


    public static void main(String[] args) {
    String renk="Siyah";
    String kameraOzelligi="FullHd";
    fotografCek();
    aramaYap();

        System.out.println(mesajGonder("Ali " + "Can " + "Javayi " + "Bugun " + "tam " + "anlamıyla " + "cozdu" + "!"));

        //hesapMakinasiniAc();


    }
    public static void fotografCek(){
        System.out.println("fotograf cekildi ve galerinize yuklendi");
    }

    public static void aramaYap(){
        System.out.println("Kisi araniyor");
    }


    public static void hesapMakinasiniAc(){
        System.out.println("Hesap makinesine hosgeldiniz");
        Scanner input = new Scanner(System.in);
        char operator;
        do {
            System.out.println("Lutfen islem yapmak istediginiz operatoru giriniz :\n+,*,-,/,% siz c tusuna basana kadar bu islemleri yapmaya devam edicek");
            operator = input.next().charAt(0);
            switch (operator) {
                case '+':
                    System.out.println("Lutfen islem yapmak istediginiz sayilari giriniz :");
                    System.out.println("Sayilarin toplami : " + (input.nextDouble() + input.nextDouble()));
                    break;
                case '*':
                    System.out.println("Lutfen islem yapmak istediginiz sayilari giriniz :");
                    System.out.println("Sayilarin carpimi : " + input.nextDouble() * input.nextDouble());
                    break;
                case '-':
                    System.out.println("Lutfen islem yapmak istediginiz sayilari giriniz :");
                    System.out.println("Sayilarin farki : " + (input.nextDouble() - input.nextDouble()));
                    break;
                case '/':
                    System.out.println("Lutfen islem yapmak istediginiz sayilari giriniz :");
                    double sayi1 = input.nextDouble();
                    double sayi2 = input.nextDouble();
                    if (sayi2 == 0) {
                        System.out.println("Payda 0 olamaz!");
                    } else {
                        System.out.println("Sayilarin bolumu : " + sayi1 / sayi2);
                    }
                    break;
                case '%':
                    System.out.println("Lutfen islem yapmak istediginiz sayilari giriniz :");
                    System.out.println("Sayilarin bolumunden kalan : " + input.nextDouble() % input.nextDouble());
                    break;
                case 'c':
                    System.out.println("Bizi tercih ettiginiz icin Tesekkurler :)");
                    break;
                default:
                    System.out.println("Lutfen gecerli bir operator giriniz!");

            }
        }while (operator!='c');
    }







    public static String mesajGonder(String...msj){
        String str="";
        System.out.println("mesaj alındı ");
        for (String a:msj
             ) {
            str+=a;

        }
        System.out.println("mesaj gonderildi ");
        return str;
    }




}
