package day22_oop.abstractClass.ornek;

public class Honda extends Araba{



    @Override
    public void kasaTuru() {
        System.out.println("Hatchback");
    }

    @Override
    public void yakitTuru() {
        System.out.println("Benzin");
    }

    @Override
    public void engine() {
        System.out.println("2.0 Turbo");
    }
    public void model(){
        System.out.println("Civic");
    }
}
