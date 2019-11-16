package InterfaceOOP2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class userTestPhones {
    public static void main(String[] args) {

        Iphone iphone =new Iphone();
        iphone.call();
        iphone.text();
        iphone.takePicture();

        System.out.println("------------------------------------");

        Samsung samsung=new Samsung();
        samsung.call();
        samsung.text();
        samsung.text();



    }
}
