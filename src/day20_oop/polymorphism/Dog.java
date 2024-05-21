package day20_oop.polymorphism;

public class Dog extends Mammal {
    public void bark() {
        System.out.println("Dogs bark...");
    }

    @Override
    public void eat() {
        System.out.println("Dogs eat meat...");
    }

}