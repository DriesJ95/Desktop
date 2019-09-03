package dierenZoo;
import java.util.Random;
public class ZooApp {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Random rand = new Random();

        for (int i = 0; i <20; i++){
            Animal anim = null;
            int caseRand = rand.nextInt(5);
            switch(caseRand){
                case 0: anim = new Bear("Winnie the Pooh", 666.66,"Male", 25,true,"My tummy's growling"); break;
                case 1: anim = new Fox("Zwieber", 22.22,"Male",8,false,"Snatch 'n run y'all!"); break;
                case 2: anim = new Monkey("King Louis", 999.99,"Male", 80,false,"King of thieves"); break;
                case 3: anim = new Rabbit("Bugs Bunny",2.50,"Male",15,true,"Carrots are the best"); break;
                case 4: anim = new Lion("Mufasa", 250, "Male", 24,false,"Wish my son hadn't killed me"); break;
            }
            zoo.addAnimal(anim);
        }

        System.out.println(zoo.toString());
        }
    }

