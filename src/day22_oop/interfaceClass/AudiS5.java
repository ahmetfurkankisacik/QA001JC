package day22_oop.interfaceClass;

public class AudiS5 implements Fren,Klima,Motor{


    @Override
    public void eco() {
        System.out.println("Audi S5 ekonomik motor kullanir");
    }

    @Override
    public void turbo() {
        System.out.println("Audi S5 Turbo motor kullanir");
    }

    @Override
    public void gas() {
        System.out.println("Audi S5 benzinli motor kullanir");
    }

    //fren interface'inden override edilenler
    @Override
    public void abs() {
        System.out.println("Audi S5 ABS fren sistemi kullanır");
    }

    @Override
    public void esp() {
        System.out.println("Audi S5 ESP fren sistemi kullanir");
    }
    //Klima interface'inden override edilenler
    @Override
    public void analog() {
        System.out.println("Audi S5 analog klima kullanir");
    }

    @Override
    public void dijital() {
        System.out.println("Audi S5 dijital klima kullanir");
    }

    public void run(){
        System.out.println("Audi S5 lazer far calistirdi");
    }
}
