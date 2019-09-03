package main;
import expressions.CompoundExpression;
import expressions.Literal;
import interfaces.Operation;

public class CalculatorApp {
    public static void main(String[] args) {

        CompoundExpression calc = new CompoundExpression(new Literal(10),new Literal(0),new Operation.Division());
        System.out.println(calc.getValue());

        CompoundExpression calc1 = new CompoundExpression(new Literal(10),new Literal(8),new Operation.Multiplication());
        System.out.println(calc1.getValue());

        CompoundExpression calc2 = new CompoundExpression(new Literal(10),new Literal(8),new Operation.Addition());
        System.out.println(calc2.getValue());



        /*Scanner keyboard = new Scanner(System.in);
        CompoundExpression calc = new CompoundExpression();
        System.out.println("Enter a first number: ");
        calc.setLeft(new Literal(Integer.valueOf(Integer.parseInt(keyboard.next()))));
        System.out.println("Enter a second number: ");
        calc.setRight(new Literal(Integer.valueOf(keyboard.nextInt())));
        System.out.println("Type '+','-','*' or '/'");
        String operationS = keyboard.next();
        if (operationS.equalsIgnoreCase("+")) {
            System.out.println((new Operation.Addition().perform(calc.getLeft(),calc.getRight())).getValue());
        } else if (operationS.equalsIgnoreCase("-")) {
            System.out.println((new Operation.Subtraction().perform(calc.getLeft(),calc.getRight())).getValue());
        } else if (operationS.equalsIgnoreCase("*")) {
            System.out.println((new Operation.Multiplication().perform(calc.getLeft(),calc.getRight())).getValue());
        } else if (operationS.equalsIgnoreCase("/")) {
            System.out.println((new Operation.Division().perform(calc.getLeft(),calc.getRight())).getValue());
        }
        keyboard.close();*/

    }
}
