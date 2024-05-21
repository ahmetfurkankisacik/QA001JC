package day20_oop.ornek;

public class Car extends Vehicle{
    public String model="Accord";
    public int year=2024;
    public Car(){
        //honda classında cons'un icine yazdıgım super() keywordu buradaki consu cagirmami sagladı
        this("Hatchback");
        System.out.println("Sedan");
    }
    public Car(String tip){
        super("Honda",2024,"Elektrik");
        System.out.print(tip+",");
    }

}
