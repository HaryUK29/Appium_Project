package LearningJava;

public class String_Methods {
    public static void main(String[] args) {
        //string is an object // String literal
        String s = "Hary";
        String s1 = "Utama";
        String s2 = "Kurniawan";

        String s3 = new String("Honda Yamaha Suzuki");
        String[] splittedString = s3.split("Yamaha");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        System.out.println(splittedString[1].trim());

        //forward
        for(int i=0; i<s3.length(); i++){
            System.out.println(s3.charAt(i));
        }

        //reverse methode
//        for(int i=s3.length()-1;i>=0;i--)
//        {
//            System.out.println(s3.charAt(i));
//        }
    }
}
