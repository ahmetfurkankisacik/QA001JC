package day21_oop;

public class Animal2 {

    public int weight=12;
    public void eat(){
        System.out.println("Animals eat...");
    }
    public Dog2 create(){//Data type Animal2
         return new Dog2();
         /*yeni bir animal2 objesi olusturup cagirildigi yere gonderilcek
         childdan override edelim
          */

    }
}
