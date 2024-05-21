package day21_oop.sizinorneginiz;

public class Araba extends Vehicle{
    public String marka;

    @Override
    public void petrolTuru() {
        System.out.println("Arabalarda genellikle benzin ve dizel petrolleri kullanir");
    }
    public Araba(){

    }
}
