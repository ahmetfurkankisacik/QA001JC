package soru;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class C21_soru {
    public static void main(String[] args) {
        //Bir List olusturmak icin kisa yol

        List<Integer> myList= Arrays.asList(1,3,5,6,8,9,321,6556646,13,13,32,66,123212,3,2321,12311);
        System.out.println("myList = " + myList);
        myList.remove(3);
        System.out.println("myList = " + myList);
    }
}
