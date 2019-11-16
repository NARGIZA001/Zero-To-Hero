package ArrayListPractice;

import java.util.ArrayList;

public class SongMasterClass {


    private String  playMachine;

    public SongMasterClass (String playMachine){

        this.playMachine=playMachine;
    }


    public void findSong (ArrayList <Songs>playList, String title){
        for (Songs s: playList){
            System.out.println(s.getTitel()); // will it return the song Title ? what do you mean by return the Song ?
        }
    }

    public void addSong(ArrayList <Songs>playList, Songs newSong){
        boolean existingSong=false;
        for (Songs s: playList){
            if ( s.getTitel().contains(newSong.getTitel()) || playList.size() >5 || newSong.getDuration()>20){
             System.out.println("This song can't be added");
                existingSong=true;
            }
        }
        if (!existingSong){
            playList.add(newSong);
            System.out.println("New Song is added");
            System.out.println(newSong.getTitel());
        }
    }

    public boolean removeSong (ArrayList <Songs>playList, String title) {

        for (int i = 0; i < playList.size(); i++) {
            if (playList.get(i).getTitel().equalsIgnoreCase(title)) {
                playList.remove(i);
                System.out.println("removed  " + i);// how can i do instead of i put title
                return true;

            }

        }
        return false;
    }

    public void allSongs (ArrayList <Songs>playList){
        for (int i = 0; i < playList.size(); i++){

            System.out.println("1-Song:" + playList.get(i).getTitel() + " is playing. Duration is "+ playList.get(i).getDuration());
            // getting only i at PlayList will output only
        }
    }


    public static void main(String[] args) {

        Songs song1=new Songs("Milky Way","Michael Jackson", "John Wihley", 2.59);
        Songs song2=new Songs("My love Story","Michele Bunny", "Anonio Barley", 3.01);
        Songs song3=new Songs("Little Kingdom","Sarah John", "Scott Swedish", 2.45);
        Songs song4=new Songs("Rain Rain","Lesley Fimo", "Chony Chony", 2.86);
        Songs song5=new Songs("Little Monkey","Jungle Mungle", "Erica Bush", 2.59);
        Songs song6=new Songs("White House","Borak Obama", "Hilary Clinton", 2.35);
        Songs song7=new Songs("Just do it","Eminem", "Emilia Limo", 3.15);
        Songs song8=new Songs("Hot Cross Buns","Johny Bunny", "David Laurance", 2.78);
        Songs song9=new Songs("Morning Sun","Miami Go", "Devil Roman", 2.98);
        Songs song10=new Songs("Air Bust","Alex Kish", "Derick Stuart ", 3.10);

        SongMasterClass playMachine=new SongMasterClass("Favorite Songs");

        ArrayList<Songs> playList=new ArrayList<Songs>();

        //playList.add(song1);
        //playList.add(song2);
        //playList.add(song3);
        playList.add(song4);
        playList.add(song5);
        playList.add(song6);

        playMachine.findSong(playList,"Milky Way");

        playMachine.addSong(playList,song4);
        playMachine.addSong(playList,song5);
        playMachine.addSong(playList,song6);

        playMachine.removeSong(playList,"White House");


        playMachine.allSongs(playList);



    }
}
