package LearningJava;

import java.util.ArrayList;

public class CoreJava2 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 122};

        //print multiple 2
        for(int i=0; i<num.length; i++)
        {
            if (num[i] % 2 == 0) {
                System.out.println(num[i]);
                break;
            }
            else {
                System.out.println(num[i] + "is not multiple of 2");
            }
        }
        //Array List
        ArrayList<String> a = new ArrayList<>();
        a.add("Hary");
        a.add("Utama");
        a.add("Kurniawan");
        a.add("Hany");
        a.add("Hamzah");

        System.out.println(a.get(4));
    }
}
