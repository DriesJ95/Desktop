package monsterOef;

public class MagicMonster extends Monster {
    private int magicPoints;
    private int maxMP;

    public MagicMonster(int maxHP, int maxMP){
        super(maxHP);
        setMaxMP(maxMP);
    }

    public int getMaxMP() {
        return maxMP;
    }

    public void setMaxMP(int maxMP) {
        this.maxMP = maxMP;
    }

    public int getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(int magicPoints) {
        this.magicPoints = magicPoints;
    }

    public void restoreMp(int h){
        this.magicPoints += h;
    }

    public boolean useMp (int d){
        if ((this.magicPoints - d) >= 0){
            this.magicPoints -= d;
            return true;
        }else{
            return false;
        }
    }
}
