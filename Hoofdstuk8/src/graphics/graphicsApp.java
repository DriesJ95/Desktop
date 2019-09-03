package graphics;

public class graphicsApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(-10,-8,-6,-6);
        Rectangle rect1 = new Rectangle (rect);
        Rectangle rect2 = new Rectangle (rect);
        Rectangle rect3 = new Rectangle (rect);
        Rectangle rect4 = new Rectangle (rect);
        Rectangle rect5 = new Rectangle (rect);

        Circle circle = new Circle (10,5,5);
        Circle cirle1 = new Circle (circle);
        Circle cirle2 = new Circle (circle);
        Circle cirle3 = new Circle (circle);
        Circle cirle4 = new Circle (circle);

        System.out.println("The surface area of the rectangle is " + rect.getArea());
        System.out.println("The height of the rectangle is " + rect.getHeight());
        System.out.println("The width of the rectangle is " + rect.getWidth());
        System.out.println("The perimeter of the rectangle is " + rect.getPerimeter());
        System.out.println("A rectangle always has " + Rectangle.ANGLES + " corners.");
        System.out.println("There are " + Rectangle.getCount() + " rectangles.");

        System.out.println("The surface area of the circle is " + circle.getArea());
        System.out.println("The perimeter of the circle is " + circle.getPerimeter());
        System.out.println("A circle always has " + Circle.ANGLES + " corners.");
        System.out.println("There are " + Circle.getCount() + " circles.");
    }
}
