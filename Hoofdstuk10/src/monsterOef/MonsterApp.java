package monsterOef;
import java.util.Scanner;
import java.util.Random;

public class MonsterApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random rand = new Random();
        Monster paddington = new Bear(10,150,100);
        Monster cruella = new Witch("Kregeltje",150,100);

        System.out.println("Bear: " + paddington.getHitPoints() +"HP   V.S.   Witch: "+ cruella.getHitPoints() + "HP");

        while (paddington.getHitPoints() >= 0 && cruella.getHitPoints() >= 0){
            int choice;
            fancyLines();
            System.out.println("Pick your next move!\nPick 1 for dealing damage\nPick 2 for healing");
            fancyLines();
            choice = userInput.nextInt();
            switch(choice){
                case 1:
                    attackOther(cruella,paddington);
                    if (rand.nextInt(2) == 1){
                        attackOther(paddington, cruella);
                    }else{
                        healOption(paddington);
                    }
                    break;
                case 2:
                    healOption(cruella);
                    if (rand.nextInt(2) == 1){
                        attackOther(paddington, cruella);
                    }else{
                        healOption(paddington);
                    }
                    break;
                default:
                    System.out.println("Wrong input");
            }
        }
    }

    public static void checkHP(Monster monster1, Monster monster2){
        if (monster1.getHitPoints() <= 0){
            System.out.println("The witch won the battle");
        }else if(monster2.getHitPoints() <= 0){
            System.out.println("The bear won the battle");
        }
    }

    public static void attackOther(Monster attacker, Monster defender){
        int originalHPd = defender.getHitPoints();
        if (attacker instanceof Bear){
            if ((((Bear) attacker).useRp(20))){
                defender.setHitPoints(defender.getHitPoints()-((Bear)attacker).bearClawAttack());
                System.out.println("Bear claws | it hits for " + (originalHPd-defender.getHitPoints()));
                fancyLines();
                currentResources(defender);
                currentResources(attacker);
                fancyLines();
            }
            else if(!((Bear)attacker).useRp(20)){
                defender.setHitPoints(defender.getHitPoints()-((Bear)attacker).frenzy());
                System.out.println("The bear's rage reaches ZERO\n He gains 100 rage and goes into a frenzy\n It hits for | " +  (originalHPd-defender.getHitPoints()));
                ((Bear) attacker).restoreRp(100);
                fancyLines();
                currentResources(defender);
                currentResources(attacker);
                fancyLines();
            }
        }else if (attacker instanceof Witch){
            if (((Witch)attacker).useMp(20)) {
                defender.setHitPoints(defender.getHitPoints()-((Witch) attacker).fireballAttack());
                System.out.println("Witch casts fireball | it hits for " + (originalHPd-defender.getHitPoints()));
                fancyLines();
                currentResources(defender);
                currentResources(attacker);
                fancyLines();

            }else if (!((Witch) attacker).useMp(20)){
                defender.setHitPoints(defender.getHitPoints()-((Witch)attacker).ignite());
                System.out.println("The witch ignites as her MP reach 0 \n She gains 100 mana and launching a devestating inferno!\n It hits for | " +  (originalHPd-defender.getHitPoints()));
                ((Witch) attacker).restoreMp(100);
                fancyLines();
                currentResources(defender);
                currentResources(attacker);
                fancyLines();
            }
        }
        checkHP(attacker,defender);
    }

    public static void healOption(Monster monster){
        int healed;
        if (monster instanceof Bear) {
            monster.heal(healed = ((Bear) monster).hibernate());
            System.out.println("Bear counters by hibernating +" + healed);
        }else if (monster instanceof Witch){
            monster.heal(healed =((Witch) monster).shadowHeal());
            System.out.println("Witch casts shadowHeal + " + healed);
        }
    }

    public static void fancyLines(){
        System.out.println("--------------------------------");
    }

    public static void currentResources(Monster monster){
        if (monster instanceof Bear) {
            System.out.println("Bear HP: " + monster.getHitPoints() + "/" + monster.getMaxHP());
            System.out.println("Bear RP: " + ((Bear) monster).getRagePoints() + "/" + ((Bear)monster).getMaxRP());
        }else if (monster instanceof Witch){
            System.out.println("Witch HP: " + monster.getHitPoints() + "/" + monster.getMaxHP());
            System.out.println("Witch MP: " + ((Witch) monster).getMagicPoints() + "/" + ((Witch)monster).getMaxMP());
        }
    }




}
