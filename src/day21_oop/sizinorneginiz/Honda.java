package day21_oop.sizinorneginiz;

public class Honda extends Araba{

    public String motorGucu="150PS";

    public String model="Civic";
    private String ruhsatBilgisi="A10E89C44GFB";

    public String getRuhsatBilgisi() {
        return ruhsatBilgisi;
    }


    @Override
    public void petrolTuru() {
        System.out.println("Honda markasi genellikle benzinli araclar uretir");
    }

    public Honda(){
        marka="Honda";
    }
}
