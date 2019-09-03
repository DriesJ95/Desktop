package expressions;
import interfaces.Operation;

public class CompoundExpression extends Expression{
    private Expression left;
    private Expression right;
    private Operation op;

    public CompoundExpression(Expression left, Expression right, Operation op){
        setLeft(left);
        setRight(right);
        setOP(op);
    }

    public CompoundExpression(){
        this(null,null,null);
    }

    @Override
    public int getValue() {
        try {
            return Integer.valueOf(op.perform(left, right).getValue());
        } catch (Exception e){
            System.out.println("Exception message: " + e.getMessage());
            return 0;
        }
    }

    public Expression getLeft(){
        return left;
    }

    public Expression getRight(){
        return right;
    }

    public Operation getOP(){
        return op;
    }

    public void setLeft(Expression left){
        this.left = left;
    }

    public void setRight(Expression right){
        this.right = right;
    }

    public void setOP(Operation op){
        this.op = op;
    }
}
