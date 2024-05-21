package day25_collections.ornek;

public class BankaSirasi {

    static long siraNo=100;
    long sira;
    String name;

    public BankaSirasi( String name) {

        this.sira = siraNo;
        this.name = name;
        siraNo++;
    }

    @Override
    public String toString() {
        return "BankaSirasi{" +
                "sira=" + sira +
                ", name='" + name + '\'' +
                '}';
    }
}
