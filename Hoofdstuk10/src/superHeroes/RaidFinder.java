package superHeroes;

public class RaidFinder {
    public static void main(String[] args) {

        Raid raid = new Raid();

        Hero hero1 = new Tank("Bronzebeard", 45);
        Hero hero2 = new Mage("Frostfire", 34);
        Hero hero3 = new Assassin("Blackbeard", 26);
        Hero hero4 = new Shapeshifter("Shape-O", 21);
        Hero hero5 = new Healer("Band-aid", 57);
        Hero hero6 = new Berserker("Broly", 28);
        Hero smudge = new Cupido("Smudge", 22);

        raid.addHero(hero1);
        raid.addHero(hero2);
        raid.addHero(hero3);
        raid.addHero(hero4);
        raid.addHero(hero5);
        raid.addHero(hero6);
        raid.addHero(smudge);
        //print(raid.getRaidArray());
        raid.removeHero(hero1);
        System.out.println(raid.isHeroTypePresent(hero1));
        print(raid.getRaidArray());
    }

    public static void print(Hero[] heroes){
        for (Hero h: heroes){
            fancyLines(heroes.length);
            System.out.println(h.toString());
            fancyLines(heroes.length);
        }
    }

    public static void fancyLines(int length){
        String fancy = "";
        int lengthFancy = length;
        while (lengthFancy != 0){
            fancy.concat("-");
            lengthFancy--;
        }
        System.out.println(fancy);
    }
}
