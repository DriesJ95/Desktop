package associaties;
import java.util.Random;

public class HigherLowerGame {
    private int trueValue;
    private int max;
    private Random rand;

    public HigherLowerGame(int max){
        this.max = max;
        rand = new Random();
        reset();
    }
    public void reset(){
        trueValue = rand.nextInt(max + 1);
    }
    public int guess(int value){
        if (value < trueValue){
            return -1;
        }else if(trueValue < value){
            return +1;
        }else{
            return 0;
        }
    }

}


