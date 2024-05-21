package soru;

import java.util.Scanner;

public class C24_soru {
    String studentName;
    String year="2024";
    static int counter=1000;
    String studentId;
    public C24_soru(){
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        studentName=input.next();
        setStudentId();
    }

    public static void main(String[] args) {
    C24_soru student1=new C24_soru();
    System.out.println(student1.studentName+student1.studentId);



    C24_soru student2 =new C24_soru();
    System.out.println(student2.studentName+ student2.studentId);
        System.out.println("student 2 icin counter degeri : "+student2.counter);//student 2 icin counter degeri : 1002

        System.out.println("student 1 icin counter degeri : "+student1.counter);//student 1 icin counter degeri : 1002

    }
    private void setStudentId() {
        counter++;
        this.studentId=year+""+counter;
    }
}
