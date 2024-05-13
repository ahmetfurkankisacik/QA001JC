package day19_static_oop;

public class StudentRunner {
    public static void main(String[] args) {
        Student student0=new Student();
        student0.name="Veli Can";
        System.out.println(Math.PI);
        student0.saciniBoya();
        System.out.println(student0.sacRengi);
        //System.out.println(Student.tahtaBilgisi);
        //Student.tahtayiSil();
        //System.out.println(Student.tahtaBilgisi);

        //1000//157
        //System.out.println(student.name);//Veli Can
        System.out.println(student0.ogrenciNo);//1000

        Student student1=new Student();
        //System.out.println(student1.name);//Ali Can
        System.out.println(student0.sayac);//1002//157
        System.out.println(student1.sayac);
        System.out.println(student1.ogrenciNo);//1001
        System.out.println();
    }
}
