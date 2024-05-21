package day25_collections.ornek;

import java.util.LinkedList;
import java.util.Queue;

public class BankaRunner {
    public static void main(String[] args) {
        BankaSirasi insan1=new BankaSirasi("Ali Can");
        BankaSirasi insan2=new BankaSirasi("Veli Can");
        BankaSirasi insan3=new BankaSirasi("Hüseyin Can");
        Queue<BankaSirasi>bankaSirasi=new LinkedList<>();
        bankaSirasi.add(insan1);
        bankaSirasi.add(insan2);
        bankaSirasi.add(insan3);
        System.out.println(bankaSirasi);
        long sayac=100;
        for (BankaSirasi each:bankaSirasi
             ) {
            System.out.println("sira "+sayac+". kişidedir lutfen 1. nolu musteri temsilcisine gidiniz");
            if (each.sira==sayac){
                System.out.println(each.name+" bey lutfen 1. nolu musteri temsilcisine gidiniz");
            }
            sayac++;
        }
    }
}
