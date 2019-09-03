package interfaces;
import expressions.Expression;
import expressions.Literal;

public interface Operation {
    Expression perform(Expression left, Expression right);

    class Addition implements Operation {
        @Override
        public Expression perform(Expression left, Expression right){
            try {
                Literal addition = new Literal((left.getValue()) + (right.getValue()));
                return addition;
            }catch(Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
                return null;
            }
        }
    }

    class Division implements Operation {
        @Override
        public Expression perform(Expression left, Expression right){
            try {
                Literal division = new Literal((left.getValue()) / (right.getValue()));
                return division;
            }catch(Exception e){
                System.out.println("Exception message: " + e.getMessage());
                return null;
            }
        }
    }

    class Multiplication implements Operation {
        @Override
        public Expression perform(Expression left, Expression right){
            Literal multiplication = new Literal((left.getValue())*(right.getValue()));
            return multiplication;
        }
    }

    class Subtraction implements Operation {
        @Override
        public Expression perform(Expression left, Expression right){
            Literal subtraction = new Literal((left.getValue())-(right.getValue()));
            return subtraction;
        }
    }
}
