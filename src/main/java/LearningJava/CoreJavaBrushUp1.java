package LearningJava;

public class CoreJavaBrushUp1 {

    public static void main(String[] args) {
        int myNum = 5;
        String website = "Hary UK";
        char letter = 'r';
        double dec = 5.9;
        boolean myCard = true;

        System.out.println(myNum + "is my favorite number");
        System.out.println(website);

        int[] day = new int[5];
        day[0] = 1;
        day[1] = 2;
        day[2] = 3;
        day[3] = 4;
        day[4] = 5;

        int[] day2 = {1, 2, 3, 4, 5, 7, 8, 9, 122};
//        System.out.println(day2[0]);

        for (int i = 0; i < day.length; i++)
            System.out.println(day[i]);

        for (int i = 3; i < day2.length; i++)
            System.out.println(day2[i]);

        String[] name = {"Hary", "Utama", "Kurniawan"};
//        for (int i = 0; i < name.length; i++)
//            System.out.println(name[i]);

        //same way as above
        for(String s:name)
        {
            System.out.print(s);
        }
    }
}
