package HomeWorks;

import java.util.ArrayList;

public class SnapshotTest  {

    public static void main(String[] args) {


        ArrayList<Integer> list =new ArrayList();

        list.add(1);
        list.add(2);

        Snapshot snap =new Snapshot(list);

        list.set(0,3);
        list=snap.restore();
        System.out.println(list);

        list.add(4);
        list=snap.restore();
        System.out.println(list);

        list.add(6);
        list.add(7);
        list.add(8);
        list.add(13);
        list.add(44);
        list = snap.restore();

        System.out.println(list); //It should print "[1,2]"





    }
}
