package monsterOef;

public class MightMonster extends Monster {
    private int ragePoints;

    private int maxRP;

    public MightMonster(int maxHP, int maxRP){
        super(maxHP);
        setMaxRP(maxRP);
    }
    public int getMaxRP() {
        return maxRP;
    }

    public void setMaxRP(int maxRP) {
        this.maxRP = maxRP;
    }
    public int getRagePoints() {
        return ragePoints;
    }

    public void setRagePoints(int ragePoints) {
        this.ragePoints = ragePoints;
    }

    public void restoreRp(int h){
        this.ragePoints += h;
    }

    public boolean useRp (int d){
        if ((this.ragePoints - d) >= 0){
            this.ragePoints -= d;
            return true;
        }else{
            return false;
        }
    }
}
