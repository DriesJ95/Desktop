package opdracht_voetbal;

import java.time.Instant;
import java.util.Date;

public class TournamentApp {
    public static void main(String[] args) {
        Team home = new Team(108L,"FC zwabber","Brussels",Country.BELGIUM);
        Team guest = new Team(109L,"FC gabber","Paris",Country.FRANCE);
        Match match1 = new Match(1L,home,guest, Date.from(Instant.now()));
        System.out.println(match1.toString());

        Player playerG = new Player("Ronny",7,Position.FORWARD,Country.FRANCE);
        Player playerH = new Player("Johnny", 9, Position.DEFENDER,Country.BELGIUM);

        home.addPlayer(playerH);
        guest.addPlayer(playerG);

        match1.addGoalG(playerG);
        match1.addGoalH(playerH);

        System.out.println(match1.toString());
    }
}
