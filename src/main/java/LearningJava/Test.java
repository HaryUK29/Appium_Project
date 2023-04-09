package LearningJava;

public class Test {
    public static void main(String[] args) {
        String name = "Hary";
        double nmbr = 8.9;
        int[] nbr = new int [4];
        nbr[0] = 1;
        nbr[1] = 2;
        nbr[2] = 3;
        nbr[3] = 4;

//        System.out.println(nbr[1]);

        for (int i = 2; i < nbr.length; i++)
            System.out.println(nbr[i]);

        String[] day = new String[7];
        day[0] = "Sunday";
        day[1] = "Monday";
        day[2] = "Tuesday";
        day[3] = "Wednesday";
        day[4] = "Thursday";
        day[5] = "Friday";
        day[6] = "Saturday";


        for(int i = 0; i < day.length; i++)
            System.out.println(day[i]);
    }
}
