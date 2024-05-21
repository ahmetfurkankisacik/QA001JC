package soru;

public class C25_soru {
    public static void main(String[] args) {
        /**Write a code that returns the duplicate chars in a String array.(interview Question)
         //Input :
         //String str="Javaisalsoeasy"
         //Output: [a, s] */
        String str="Javaisalsoeasy";
        String str2="";
        for (int i = 0; i <str.length() ; i++) {
            char karakter=str.charAt(i);
            if (str.indexOf(karakter)!=str.lastIndexOf(karakter)){
                if (!str2.contains(String.valueOf(str.charAt(i)))){
                    str2+=karakter;
                }
            }
        }
        System.out.println(str2);



    }
}
