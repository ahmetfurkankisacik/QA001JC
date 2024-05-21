package day25_collections.odev;

public class Human {
    String name;
    String soyIsim;
    int yas;
    String cinsiyet;

    public Human(String name, String soyIsim, int yas, String cinsiyet) {
        this.name = name;
        this.soyIsim = soyIsim;
        this.yas = yas;
        this.cinsiyet = cinsiyet;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", yas=" + yas +
                ", cinsiyet='" + cinsiyet + '\'' +
                '}';
    }
}
