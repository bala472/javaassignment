import java.util.ArrayList;
import java.util.List;

public class Team {
    String name;
    String city;
    String division;
    List<Player> playerList;
    public void playGame(){
        System.out.println("Team will decide what to play");
    }
    public void hireCoach(){
        System.out.println("Team Need to hire coach");
    }
}
class Player{
    Team team;
    String name;
    String position;
    String jerseyNumber;
    public void playGame(){
        System.out.println("Team will play cricket");
    }
    public void train(){
        System.out.println("Player going to be trained");
    }
}
