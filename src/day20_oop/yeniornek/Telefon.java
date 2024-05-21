package day20_oop.yeniornek;

public class Telefon extends Elektronik{

    public Telefon(){
        this("Pro");
        System.out.println("Pro Max");
    }
    public Telefon(String tip){
        super("Iphone",2012,"16GB");
        System.out.println(tip);
    }

}
