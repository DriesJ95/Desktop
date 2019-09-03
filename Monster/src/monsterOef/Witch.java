package monsterOef;
import java.util.Random;

public class Witch extends MagicMonster {
    private String name;
    private Random rand = new Random();

    public Witch(){
        super(0,0);
    }
    public Witch(int maxHitPoints){
        super (maxHitPoints,0);
        this.setHitPoints(maxHitPoints);
        this.setMagicPoints(0);
    }
    public Witch(int maxHitPoints, int magicPoints){
        super(maxHitPoints, magicPoints);
        this.setHitPoints(maxHitPoints);
        this.setMagicPoints(magicPoints);
    }
    public Witch(String name, int maxHitPoints, int magicPoints){
        super(maxHitPoints, magicPoints);
        this.name = name;
        this.setHitPoints(maxHitPoints);
        this.setMagicPoints(magicPoints);
    }
    public int fireballAttack(){
        return rand.nextInt(21);
    }

    public int ignite(){
        return rand.nextInt(101)+50;
    }

    public int shadowHeal(){
        return rand.nextInt(21)+10;
    }
}
