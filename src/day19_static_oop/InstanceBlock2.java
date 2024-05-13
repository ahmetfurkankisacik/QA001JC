package day19_static_oop;

public class InstanceBlock2 {
    public int year;

    {
        System.out.println("Java cok güzeldir");//ikisinde de ayni işlem
    }
    public InstanceBlock2() {
    }

    public InstanceBlock2(int year) {
        this.year = year;
    }


}
