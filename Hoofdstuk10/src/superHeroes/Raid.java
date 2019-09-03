package superHeroes;

public class Raid {
    private Hero [] raid;

    public Raid(){
        this.raid = new Hero[] {};
    }

    public Hero[] getRaidArray(){
        return raid;
    }

    public void addHero(Hero hero){
        Hero [] temp = new Hero [raid.length+1];
        for(int i = 0; i < raid.length; i++){
            temp[i] = raid[i];
        }
        temp[raid.length] = hero;
        raid = temp;
    }

    public void removeHero(Hero hero){
        Hero [] temp = new Hero [raid.length-1];
        boolean flag = false;
        for(int i = 0; i < raid.length-1; i++) {
            if (raid[i].equals(hero)) {
                temp[i] = raid[i+1];
                flag = true;
            } else if (flag){
                temp[i]=raid[i+1];
            } else{
                temp[i] = raid[i];
            }
        }
        raid = temp;
    }

    public boolean isHeroTypePresent(Hero hero){
        boolean isPresent = false;
        for (Hero h:raid){
            if (h.equals(hero)){
                isPresent = true;
            }
        }
        return isPresent;
    }
}
