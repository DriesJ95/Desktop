package opdracht_voetbal;
import java.util.Date;
import java.util.Random;

public class Player {
    public Long id;
    public String name;
    public Date dateOfBirth;
    public Integer dressNumber;
    public Position position;
    public String country;
    public Goal[] goals = new Goal[]{};

    public Player(String name, Integer dressNumber, Position position, Country country){
        this.name = name;
        this.dressNumber = dressNumber;
        this.position = position;
        this.country = country.name().toLowerCase();
    }

    public Goal takeShot(){
        Random rand = new Random();
        Goal score;
            switch (rand.nextInt(3)) {
                case 0:
                    score = new Goal("Right hook");
                    this.addGoal(score);
                    return score;
                case 1:
                    score = new Goal("Left hook");
                    this.addGoal(score);
                    return score;
                case 2:
                    score = new Goal("Center");
                    this.addGoal(score);
                    return score;
                default:
                    return score = new Goal("Woppa");
            }

    }

    public void addGoal(Goal goal){
        Goal [] temp = new Goal [goals.length+1];
        for (int i = 0; i < temp.length-1; i++){
            temp[i] = goals[i];
        }
        temp[temp.length-1] = goal;
        goals = temp;
    }

    public Goal[] getGoals(){
        return goals;
    }

    public String toString(){
        return this.name + " has dressNumber " + this.dressNumber + " and position " + position.name().toLowerCase() + ", his native country is " + country;
    }


}
