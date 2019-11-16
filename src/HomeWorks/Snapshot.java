package HomeWorks;

import java.util.ArrayList;

public class Snapshot {


    ArrayList<Integer> data;

    public  Snapshot (ArrayList<Integer>data){


        this.data=new ArrayList<>(data);

    }

    public ArrayList<Integer> restore (){



        return new  ArrayList<>(this.data);
    }


}
