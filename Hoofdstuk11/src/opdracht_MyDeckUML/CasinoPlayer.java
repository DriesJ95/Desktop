package opdracht_MyDeckUML;

public class CasinoPlayer {
    private double money;
    private Chip[] chips;

    public CasinoPlayer(){
        this(0,null);
    }

    public CasinoPlayer(double money, Chip[] chips){
        setMoney(money);
        setChips(chips);
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Chip[] getChips() {
        return chips;
    }

    public void setChips(Chip[] chips) {
        this.chips = chips;
    }

    public void addChip(Chip chip){
        Chip[] temp = new Chip[chips.length+1];
        for (int i = 0; i < chips.length; i++){
            temp[i] = chips[i];
        }
        temp[chips.length]=chip;
        chips = temp;
    }

    public void removeChip(Chip chip){
        Chip [] temp = new Chip [chips.length-1];
        boolean flag = false;
        for(int i = 0; i < chips.length-1; i++) {
            if (chips[i].equals(chip)) {
                temp[i] = chips[i+1];
                flag = true;
            } else if (flag){
                temp[i]=chips[i+1];
            } else{
                temp[i] = chips[i];
            }
        }
        chips = temp;
    }
}
