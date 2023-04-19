package LearningJava;

public class Methods_Demo {

    public static void main(String[] args) {

        Methods_Demo d = new Methods_Demo();
        String name = d.getData();
        System.out.println(name);
        Methods_Demo2 d1 = new Methods_Demo2();
        d1.getUserData();
        getData2();
    }
    public static String getData()
    {
        System.out.println("Hello World");
        return "Hary Utama";
    }
    public static String getData2()
    {
        System.out.println("Hello World");
        return "Hary Utama";
    }
}
