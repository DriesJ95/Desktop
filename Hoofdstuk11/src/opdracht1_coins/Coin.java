package opdracht1_coins;

public enum Coin {
    ONE_CENT,TWO_CENT,FIVE_CENT,TEN_CENT,TWENTY_CENT,FIFTY_CENT,ONE_EURO,TWO_EURO;

    public int getValue(){
        int value = 0;
        switch(this){
            case ONE_CENT: value = 1; break;
            case TWO_CENT:  value = 2; break;
            case FIVE_CENT: value = 5; break;
            case TEN_CENT:  value = 10; break;
            case TWENTY_CENT:   value = 20; break;
            case FIFTY_CENT:    value = 50; break;
            case ONE_EURO: value = 100; break;
            case TWO_EURO: value = 200; break;
        }
        return value;
    }
}
