package sexy.me;

import java.util.ArrayList;
import java.util.List;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape rectangle = new Rectangle();
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        List<Shape> lijstje = new ArrayList<>();
        lijstje.add(circle);
        lijstje.add(redCircle);
        lijstje.add(rectangle);
        lijstje.add(redRectangle);

        lijstje.forEach(Shape::draw);
    }
}
