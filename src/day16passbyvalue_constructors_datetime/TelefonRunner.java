package day16passbyvalue_constructors_datetime;

public class TelefonRunner {
    public static void main(String[] args) {
        Telefon telefon1=new Telefon("Iphone","15","Altın",4);
        System.out.println("telefon 1 : "+telefon1);



        Telefon telefon2=new Telefon("Samsung","Note 10 pro","Beyaz",2);
        System.out.println("telefon 2 : "+telefon2);
    }
}
