package meow;

public class Pound {
    private Cat[] cats = new Cat[0];
    private String name;

    public Pound(String name) {
        this.name = name;
        this.cats = new Cat[0];
    }

    public void sortPound() {
        boolean flag = false;
        do {
            loopLargerSwap();
            int flagCounter = 0;
            for (int b = 0; b < cats.length - 1; b++) {
                if (cats[b].getWeight() < cats[b + 1].getWeight()) {
                    flagCounter++;
                }
            }
            if (flagCounter == 0) {
                flag = true;
            }
        }
        while (flag != true);
    }

    public void loopLargerSwap(){
        Cat[] temp = new Cat[cats.length];
        for (int i = 1; i < cats.length; i++) {
            if (cats[i].getWeight() > cats[i - 1].getWeight()) {
                temp[i - 1] = cats[i];
                cats[i] = cats[i - 1];
            } else {
                temp[i - 1] = cats[i - 1];
            }
        }
        temp[cats.length - 1] = cats[cats.length - 1];
        cats = temp;
    }

    public void addCat(Cat cat) {
        Cat[] temp = new Cat[cats.length + 1];
        for (int i = 0; i < cats.length; i++) {
            temp[i] = cats[i];
        }
        temp[cats.length] = cat;
        cats = temp;
    }

    public Cat[] getCats() {
        return cats;
    }

}
