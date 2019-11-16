package CollectionPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class city {

    private String Capital;

    public static void main(String[] args) {

        village city=new village("Cuz",15000,1122,102);
        city.addVillage("Duz",20000,1133,103);
        city.addVillage("Buz",10000,1111,101);
        city.addVillage("Fuz",25000,1144,104);
        city.addVillage("Guz",30000,1155,105);


        city.villaNames();

        city.removeVilla(1155);

        city.villaNames();

        city.removeVillaS("Guz");

        city.villaNames();

        System.out.println(city.cityPopulation());



    }


    public int getCapital(int Capital){

        return Capital;
    }

    public void setCapital(String Capital) {
        this.Capital = Capital;
    }




}

/**
 * Map<Integer,village> villageList=new HashMapPractice<Integer,village>();
 *
 *   village v1=new village("Buz",10000,1111,101); //,"Lola"  ,"Pola"  , ,"Sola"  ,,"Dola",,"Cola" )
 *         village v2=new village("Cuz",15000,1122,102);
 *         village v3=new village("Duz",20000,1133,103);
 *         village v4=new village("Fuz",25000,1144,104);
 *         village v5=new village("Guz",30000,1155,105);
 */
