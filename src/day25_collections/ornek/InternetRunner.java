package day25_collections.ornek;

import java.util.Deque;
import java.util.LinkedList;

public class InternetRunner {
    public static void main(String[] args) {
        InternetTarayicisi site1=new InternetTarayicisi("TechproLMS","https://lms.techproeducation.de/login/index.php");
        InternetTarayicisi site2=new InternetTarayicisi("TechproEducation","https://www.techproeducation.com.tr/?gad_source=1&gclid=CjwKCAjwx-CyBhAqEiwAeOcTdUM7IforGcFKII01JN0WP4fR0RRJ-7sKwSg6pI-pQSbv9v7n3ED5bhoCOtUQAvD_BwE");
        Deque<InternetTarayicisi>tarayiciGecmisi=new LinkedList<>();
        tarayiciGecmisi.add(site1);
        tarayiciGecmisi.add(site2);
        System.out.println(tarayiciGecmisi);
    }
}
