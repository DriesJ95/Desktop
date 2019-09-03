package monsterOef;
import java.util.Random;

public class Bear extends MightMonster {
    private int holeNr;
    private Random rand = new Random();

    public Bear(){
        super(0,0);
    }
    public Bear(int maxHitPoints){
        super (maxHitPoints,0);
        this.setHitPoints(maxHitPoints);
        this.setRagePoints(0);
    }
    public Bear(int maxHitPoints, int ragePoints){
        super(maxHitPoints, ragePoints);
        this.setHitPoints(maxHitPoints);
        this.setRagePoints(ragePoints);
    }
    public Bear(int holeNr, int maxHitPoints, int ragePoints){
        super(maxHitPoints, ragePoints);
        this.holeNr = holeNr;
        this.setHitPoints(maxHitPoints);
        this.setRagePoints(ragePoints);
    }
    public int bearClawAttack(){
        return rand.nextInt(21);
    }
    public int frenzy(){
        return rand.nextInt(51)+50;
    }
    public int hibernate(){
        return rand.nextInt(21)+1;
    }
}
