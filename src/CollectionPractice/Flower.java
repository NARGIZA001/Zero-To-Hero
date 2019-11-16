package CollectionPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class Flower {

    String name;
    int barcodeNumber;
    HashSet<Flower> flowerList;

    public Flower (String name, int barcodeNumber){

        this.name =name;
        this.barcodeNumber=barcodeNumber;
        flowerList=new HashSet<>();

    }

    public void addFlower (String name, int barcodeNumber){

        flowerList.add(new Flower (name, barcodeNumber));
    }

    public int findFlower (String name ){

        for (Flower fl: flowerList){

            if (fl.name.equalsIgnoreCase(name)){

                return fl.barcodeNumber;
            }
        }
        System.out.println(" Barcode is not available");
        return 0;
    }

    public String findFlower (int barcodeNumber){

        for (Flower br: flowerList){

            if (br.barcodeNumber==barcodeNumber){
                return br.name;
            }
        }
        System.out.println(" Name is not available");
        return null;
    }


    public void removeFl (String name){

        ArrayList<Flower> flowersList=new ArrayList<>(flowerList);

        for (int i=0; i<flowersList.size(); i++) {

            if (flowersList.get(i).name.equalsIgnoreCase(name)) {

                flowersList.remove(flowersList.get(i));
            }
        }

        flowerList=new HashSet<>(flowersList);
    }

    public void allFlowers (){

        for (Flower fl: flowerList){
            System.out.println(fl.name);

        }
    }


}
