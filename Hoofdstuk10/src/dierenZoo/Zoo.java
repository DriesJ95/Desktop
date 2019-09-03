package dierenZoo;
import java.util.Arrays;

public class Zoo {
    private Bear [] bears;
    private Fox [] foxes;
    private Monkey [] monkeys;
    private Rabbit [] rabbits;
    private Lion [] pride;


    public Zoo() {
        this.bears = new Bear[]{};
        this.foxes = new Fox[]{};
        this.monkeys = new Monkey[]{};
        this.rabbits = new Rabbit[]{};
        this.pride = new Lion[]{};

    }

    public void addAnimal(Animal animal){
        int i = 0;
        if (animal instanceof Bear){
            i = 0;
        }else if (animal instanceof Fox){
            i = 1;
        }else if (animal instanceof Monkey){
            i = 2;
        }else if (animal instanceof Rabbit){
            i = 3;
        }else if (animal instanceof Lion){
            i = 4;
        }
        switch (i){
            case 0: addBear((Bear)animal); break;
            case 1: addFox((Fox)animal); break;
            case 2: addMonkey((Monkey)animal); break;
            case 3: addRabbit((Rabbit)animal); break;
            case 4: addLion((Lion)animal); break;
        }
        /*Animal[] temp = new Animal [zoo.length+1];
        if (zoo.length < 2){
            temp[0] = animal;
        }else {
            for (int n = 0; n < zoo.length - 1; n++) {
                temp[n] = zoo[n];
            }
            temp[zoo.length] = animal;
        }
        zoo = temp;*/

    }

    public void addBear(Bear bear){
        Bear [] temp = new Bear[bears.length+1];
        for (int i = 0; i < bears.length; i++){
            temp[i] = bears[i];
        }
        temp[bears.length]= bear;
        bears = temp;
    }
    public void addFox(Fox fox){
        Fox [] temp = new Fox[foxes.length+1];
        for (int i = 0; i < foxes.length; i++){
            temp[i] = foxes[i];
        }
        temp[foxes.length]= fox;
        foxes = temp;
    }
    public void addMonkey(Monkey monkey){
        Monkey [] temp = new Monkey[monkeys.length+1];
        for (int i = 0; i < monkeys.length; i++){
            temp[i] = monkeys[i];
        }
        temp[monkeys.length]= monkey;
        monkeys = temp;
    }
    public void addRabbit(Rabbit rabbit){
        Rabbit [] temp = new Rabbit[rabbits.length+1];
        for (int i = 0; i < rabbits.length; i++){
            temp[i] = rabbits[i];
        }
        temp[rabbits.length]= rabbit;
        rabbits = temp;
    }
    public void addLion(Lion lion){
        Lion [] temp = new Lion[pride.length+1];
        for (int i = 0; i < pride.length; i++){
            temp[i] = pride[i];
        }
        temp[pride.length]= lion;
        pride = temp;
    }

    @Override
    public String toString(){
        return "My zoo:\n bears: " + Arrays.toString(bears) + "\n Foxes: " + Arrays.toString(foxes) + "\n Monkeys: " + Arrays.toString(monkeys) + "\n Rabbits: " + Arrays.toString(rabbits) + "\n and Lions: " + Arrays.toString(pride);
    }
}
