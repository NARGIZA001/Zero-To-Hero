package ConstructorChaining;

public class SoccerPlayerTest {
    public static void main(String[] args) {


        SoccerPlayer player=new SoccerPlayer();

      player.name="Ronaldo";
      player.age=34;
      player.nationality="Portugal";
      player.height=6.1;
      player.weight=93.1;


      player.run();
      player.run(player.name);
      player.shoot(60,28);

        SoccerPlayer player2=new SoccerPlayer("Hazard", "Belgium", "Real Madrid", 28,6,90);
        System.out.println(player2.name);
        System.out.println(player2.nationality);

        SoccerPlayer[] soccerPlayers={new SoccerPlayer(), new SoccerPlayer(), player2,player};

        System.out.println(soccerPlayers[2].name);







    }
}
