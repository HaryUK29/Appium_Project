package LearningJava;

import io.cucumber.java.sl.In;

public class Inheraitance_2 extends Inheritance{

        String engine = "new engine";
    public void colour(){
        System.out.println(colour);
    }

    public static void main(String[] args) {
        Inheraitance_2 cd = new Inheraitance_2();
        cd.colour();
        cd.brakes();
        cd.audioSystem();
    }
}
