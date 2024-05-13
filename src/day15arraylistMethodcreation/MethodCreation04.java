package day15arraylistMethodcreation;

public class MethodCreation04 {
    public static void main(String[] args) {
        //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz​
        //...
        int a=5;
        //...
        int b=6;
        //...
        int c=7;
        System.out.println(ikiCarpBirTopla(a, b, c));


        //ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz (void yani return yok)​
        yazdir("Hello World");

    }


    //ornek 2 : cevabi
public static int ikiCarpBirTopla(int a,int b,int c){

       return a*b+c;
}

    //ornek 3 : cevabi
    public static void yazdir(String word){
        System.out.println("Girilen kelime : "+word);
    }


}
