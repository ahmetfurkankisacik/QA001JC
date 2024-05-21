package day20_oop.yeniornek;

public class Iphone extends Telefon{
    public Iphone() {
        System.out.println(15);
    }
    public Iphone(int model){
        super("Mini");
        System.out.println(model);
    }

}
