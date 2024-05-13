package day16passbyvalue_constructors_datetime;

import java.util.Arrays;

public class PassByValuePassByReference {
    public static void main(String[] args) {
        /* Pass by Reference (Referans ile Geçiş):
Java'da “pass by reference” kullanılmaz. Bunda degisken ve object’lerin adresleri direkt methoda gonderilir.
Kopya yoktur.Method’a adres yollaninca method, adresi kullanarak orjinal degere ulasir ve degeri degistirebilir.
 Bu yaklasimda hem adres hem de orjinal veri degisebilir.
Dikkat : Java da Object ile calisirken (heap memory’de), Object’in referansı(adresi) degismez ama
bazi Object’lerin orjinal içeriği degisebilir (Mutable-Değiştirilebilir- Nesneler : ArrayList, HashMap,StringBuilder)
(Immutable-Değişmez- Nesneler: Integer, String gibi Wrapper Clas’lar,ENUM)
Peki Java bunu neden Boyle yapar? (Pass by reference kullanımına gore)

1- Güvenlik:
"Pass by Value," verilerin kontrolsüz değiştirilmesini engeller. Bu, programın güvenliğini
artırır çünkü bir metodun içinde değiştirilen veriler, çağrıldığı yerdeki orijinal veriyi etkilemez.

2-Performans:
Pass by value, Java'nın performans açısından daha verimli çalışmasını sağlar.
Adres degisikliginin onune gecilerek hiz saglanir

*/
        int x=3;
        int y=5;
        System.out.println(add(x, y));
        x=add(x,y);
        System.out.println("x degeri : "+x);
        int arr[]={1,3,5,7,9,11,13};
        //elemanDegistir(arr);
        //System.out.println(Arrays.toString(arr));
        arrayDegistir(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void arrayDegistir(int []arr){
        arr=new int[8];
        arr[0]=5;
        arr[1]=7;
        arr[2]=9;
        arr[3]=11;
        arr[4]=13;
        arr[5]=15;
        arr[6]=17;
        arr[7]=19;
        System.out.println(Arrays.toString(arr));
    }


    public static int add(int a,int b){
        a=a+b;
        return a;
    }
    public static void elemanDegistir(int arr[]){
        arr[6]=3;
        arr[2]=-5;
        arr[1]=-7;
        arr[5]=-9;
        arr[4]=-1;

    }





}
