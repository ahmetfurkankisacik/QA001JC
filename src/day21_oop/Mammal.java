package day21_oop;

public class Mammal extends Animal2{
    public int weight=13;

    @Override
    public void eat() {
        System.out.println("Mammal eat...");
    }
}
