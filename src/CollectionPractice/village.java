package CollectionPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class village {

    private String name;
    private int population;
    private int villageID;
    private int totalArea;

    HashSet<village> villageList;



    public village (String name,int population,int villageID,int totalArea){
        this.name=name;
        this.population=population;
        this.totalArea=totalArea;
        this.villageID=villageID;
        villageList=new HashSet<>();


    }
    //  1
    public void addVillage (String name, int population,int villageID,int totalArea){

        villageList.add(new village (name,population, villageID,totalArea));
    }

    // 2
    public HashSet<village> findVillage (String name ){

        for (village vg: villageList){

            if (vg.name.equalsIgnoreCase(name)){

                return vg.villageList;
            }
        }
        System.out.println("Sorry village is not found");
        return null;
    }

    //3

    public HashSet<village> findVillageID (int villageID ){

        for (village vg: villageList){

            if (vg.villageID==villageID){

                return vg.villageList;
            }
        }
        System.out.println("Sorry village is not found");
        return null;
    }

    // 4
    public boolean removeVilla (int villageID){

        ArrayList<village> villaList=new ArrayList<>(villageList);

        for (int i=0; i<villaList.size(); i++) {

            if (villaList.get(i).villageID==villageID) {

                villaList.remove(villaList.get(i));

                System.out.println("the village you entered has been removed");

                return true;
            }
        }

        villageList=new HashSet<>(villaList);

        return false;
    }

    // 5

    public boolean removeVillaS (String name){

        ArrayList<village> villaList=new ArrayList<>(villageList);

        for (int i=0; i<villaList.size(); i++) {

            if (villaList.get(i).name.equalsIgnoreCase(name)) {

                villaList.remove(villaList.get(i));

                System.out.println("the village you entered has been removed");

                return true;
            }
        }

        villageList=new HashSet<>(villaList);

        return false;
    }

    //6

    public void villaNames(){

        for (village vl: villageList){
            System.out.println(vl.name);

        }
    }


    // 7


    public long cityPopulation(){

        ArrayList<village> villaList=new ArrayList<>(villageList);

        int sumOfpoeople =0;

        for (int i=0; i<villaList.size(); i++) {

          sumOfpoeople+= villaList.get(i).getPopulation();
       }
        villageList=new HashSet<>(villaList);
     return sumOfpoeople;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getVillageID() {
        return villageID;
    }

    public void setVillageID(int villageID) {
        this.villageID = villageID;
    }

    public int getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(int totalArea) {
        this.totalArea = totalArea;
    }


}
