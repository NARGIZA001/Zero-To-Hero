package StringBuilderPractice;

import java.sql.SQLOutput;

public class MIcrosoftMouse {
    public static void main(String[] args) {
        StringBuilder mouse = new StringBuilder("Microsoft");
        // mouse.substring (0,3) 0,1,2==>Mic

        mouse.delete(0,3);

        System.out.println(mouse);

        mouse.deleteCharAt(2);

        System.out.println(mouse);

        //Reverse String

        mouse.reverse();
        System.out.println(mouse);

        String mouse1=mouse.toString();

        String mouse2=mouse.substring(0);

        System.out.println(mouse1);

        System.out.println(mouse2);

        String mouse3=""+mouse;

        System.out.println(mouse3);

        StringBuilder camera= new StringBuilder("Camera");

        StringBuilder camera1= new StringBuilder("Camera");

        System.out.println(camera==camera1);

    }
}
