package day15arraylistMethodcreation;

public class MethodCreation05 {
    public static void main(String[] args) {
        System.out.println(4+1);//int
        System.out.println(8.9+7);//double
        System.out.println(8.9+2.4);//double

        toplama(5,6);
        toplama(5.8,6);
        toplama(6,5.8);
        toplama(6.9,5.8);


    }
    public static void toplama(int a,int b){
        System.out.println("a+b = " + (a + b));
    }
    public static void toplama(double a,int b){
        System.out.println("a+b = " + (a + b));
    }
    public static void toplama(double a,double b){
        System.out.println("a+b = " + (a + b));
    }
    public static void toplama(int a,double b){
        System.out.println("a+b = " + (a + b));
    }



}
