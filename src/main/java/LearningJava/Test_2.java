package LearningJava;

public class Test_2 {
    public static void main(String[] args) {
        int[] no = new int[4];
        no[0] = 1;
        no[1] = 2;
        no[2] = 3;
        no[3] = 4;

        for (int i = 0; i < no.length; i++) {
            if (no[i] % 2 == 0){
                System.out.println(no[i]);
                break;
            }
            else {
                System.out.println(no[i] + "is not multiple of 2");
        }
    }
}
}
