package expressions;

public class Literal extends Expression {
    public Integer value;

    public Literal(Integer value){
        setValue(value);
    }

    @Override
    public int getValue() {
        return value;
    }

    public void setValue(Integer value){
        try{
            this.value = value;
        }catch(NumberFormatException nfe){
            System.out.println("Invalid input");
        }
    }
}
