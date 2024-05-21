package day21_oop;

public class Dog2 extends Mammal{

    @Override
    public void eat(){
       System.out.println("Dogs eat meat...");
    }
    public void eat(String string){
        System.out.println("Dogs eat "+string+"...");
    }
    public void eat(int a){
        System.out.println("Dogs eat "+a+" Meat");
    }

    @Override
    public Dog2 create() {
        return new Dog2();
    }
}
