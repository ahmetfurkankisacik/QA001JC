package day21_oop.encapsulation;

public class StudentRunner {
    public static void main(String[] args) {
        Student s=new Student();
        //s.name dısında diger variable'lar gorulmez
        /*-------------------get*/
        //s.age seklinde okuyamadım ama get methodu ilee okudum
        System.out.println(s.getAge());//13
        //s.succesful seklinde okuyamadım ama get methodu ile okudum
        System.out.println(s.isSuccesful());//true

        /*-------------------set*/
        s.setAge(25);
        System.out.println(s.getAge());//25


        s.setSuccesful(false);
        System.out.println(s.isSuccesful());//false
    }
}
