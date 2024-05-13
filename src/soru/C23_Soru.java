package soru;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class C23_Soru {
    public static void main(String[] args) {
        Integer arr[] = {3, 4, 5, 6};
        List<Integer> list1 = new ArrayList<>();
        for(int w : arr) {
            list1.add(w);
        }
        List<Integer>list2= Arrays.asList(arr);
        System.out.println(list1);
        System.out.println(list2);
    }
}
