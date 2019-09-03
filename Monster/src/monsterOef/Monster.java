package monsterOef;

public abstract class Monster {
    private int hitPoints;
    private int maxHP;

    public Monster(int maxHP){
        setMaxHP(maxHP);
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public void heal(int h){
        if ((this.hitPoints + h) > maxHP){
            this.hitPoints = maxHP;
        }else {
            this.hitPoints += h;
        }
    }

    public boolean takeDamage(int d){
        this.hitPoints -= d;
        return true;
    }
}
