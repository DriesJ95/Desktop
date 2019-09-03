package graphics;
import java.util.Random;

public class shapeApp {
    public static void main(String[] args) {
        Shape [] arrShapes = new Shape[10];
        Random rand = new Random();
        for(int i = 0; i<arrShapes.length; i++){
            Shape shapey = null;
            int caseRand = rand.nextInt(3);
            switch (caseRand){
                case 0: shapey = new Circle(5,5,5); break;
                case 1: shapey = new Square(8,8,8); break;
                case 2: shapey = new Rectangle(11,13,11,11); break;
            }
            arrShapes[i] = shapey;
        }

        for(Shape s:arrShapes){
            System.out.println("The perimeter is " + s.getPerimeter() + ", the surface area is " + s.getArea() + ", the position is (" + s.getX() + ", " + s.getY() + ").");
        }
        /*
        Rectangle rect = new Rectangle(10,8,5,3);
        Square sq = new Square(6,4,2);
        Circle circ = new Circle(15,6,4);
        Shape rect1 = new Rectangle(9,7,5,3);
        Shape sq1 = new Square(8,4,2);
        Shape circ1 = new Circle(13,6,4);

        System.out.println("De oppervlakte van de cirkels zijn: " + circ.getArea()+ " en " + circ1.getArea());
        System.out.println("De omtrek van de cirkels zijn: " + circ.getPerimeter()+ " en " + circ1.getPerimeter());
        System.out.println("De oppervlakte van de rechthoeken zijn: " + rect.getArea()+ " en " + rect1.getArea());
        System.out.println("De omtrek van de rechthoeken zijn: " + rect.getPerimeter()+ " en " + rect1.getPerimeter());
        System.out.println("De oppervlakte van de vierkanten zijn: " + sq.getArea()+ " en " + sq1.getArea());
        System.out.println("De omtrek van de vierkanten zijn: " + sq.getPerimeter()+ " en " + sq1.getPerimeter());
        */

    }
}
