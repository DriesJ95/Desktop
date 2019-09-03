package opdracht_voetbal;
import java.util.Date;

public class Match {
    public Long id;
    public Team homeTeam;
    public Team guestTeam;
    public Date time;
    public MatchResult result;
    public Integer homeScore = Integer.valueOf(0);
    public Integer guestScore = Integer.valueOf(0);
    public Goal[] goals = new Goal[]{};

    public void addGoalH(Player player){
        Goal [] temp = new Goal [goals.length+1];
        for (int i = 0; i < goals.length; i++){
            temp[i] = goals[i];
        }
        temp[temp.length-1] = player.takeShot();
        goals = temp;
        homeScore++;
        determineResult();
    }

    public void addGoalG(Player player){
        Goal [] temp = new Goal [goals.length+1];
        for (int i = 0; i < goals.length; i++){
            temp[i] = goals[i];
        }
        temp[temp.length-1] = player.takeShot();
        goals = temp;
        guestScore++;
        determineResult();
    }

    public void determineResult(){
        if (homeScore>guestScore){
            result = MatchResult.HOME_TEAM_WIN;
        }else if (guestScore > homeScore){
            result = MatchResult.GUEST_TEAM_WIN;
        }else{
            result = MatchResult.DRAW;
        }
    }

    public Match(Long id, Team homeTeam, Team guestTeam, Date time) {
        this.id = id;
        this.homeTeam = homeTeam;
        this.guestTeam = guestTeam;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Match id: " + id +
                "\n---------------------------------------------------------------------------------------------" +
                "\nHomeTeam:  " + homeTeam.toString() +
                "\nGuestTeam: " + guestTeam.toString() +
                "\nTime: " + time +
                "\nResult: " + result +
                ", Home: " + homeScore +
                ", Guest: " + guestScore +
                "}\n---------------------------------------------------------------------------------------------";
    }

    public MatchResult getResult() {
        return result;
    }

    public void setResult(MatchResult result) {
        this.result = result;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    public Integer getGuestScore() {
        return guestScore;
    }

    public void setGuestScore(Integer guestScore) {
        this.guestScore = guestScore;
    }
}
