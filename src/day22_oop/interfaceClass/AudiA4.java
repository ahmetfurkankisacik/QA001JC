package day22_oop.interfaceClass;

public class AudiA4 implements Motor,Fren,Klima{
    /*
a) interface'leri parent yapmak icin 'implements' keyword'u child icinde kullanilir
b) extends kullanilmaz cunku bu iki class arasinda kullanilir
c) AudiA4 Class'i, Motor interface'i icindeki tum methodlari override etmek zorundadir.
d) AudiA4 Class'i, Motor interface'i icindeki tum methodlari override etmek zorunda
oldugundan method'larin bas kismina 'override' yazmak gerekmez bu yuzden yazmayiz.
e) Class icinde access modifier yazilmazsa default kabul edildiginden, mecbur public yazariz
*/

    //motor interface'inden override edilenler
    @Override
    public void eco() {
        System.out.println("Audi A4 ekonomik motor kullanir");
    }

    @Override
    public void turbo() {
        System.out.println("Audi A4 Turbo motor kullanir");
    }

    @Override
    public void gas() {
        System.out.println("Audi A4 benzinli motor kullanir");
    }

    //fren interface'inden override edilenler
    @Override
    public void abs() {
        System.out.println("Audi A4 ABS fren sistemi kullanır");
    }

    @Override
    public void esp() {
        System.out.println("Audi A4 ESP fren sistemi kullanir");
    }
    //Klima interface'inden override edilenler
    @Override
    public void analog() {
        System.out.println("Audi A4 analog klima kullanir");
    }

    @Override
    public void dijital() {
        System.out.println("Audi A4 dijital klima kullanir");
    }

    public void run(){
        System.out.println("Audi A4 Hava yastigini acti");
    }

}
