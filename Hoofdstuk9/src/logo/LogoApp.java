package logo;

public class LogoApp {
    public static void main(String[] args) {
        Logo logo = new Logo();
        Rectangle rect = new Rectangle(10,8,5,5);
        Rectangle [] arrR = new Rectangle[]{rect};
        Circle circ = new Circle (10,10,10);
        Circle [] arrC = new Circle[]{circ};
        String text = "Dreamz";

        Logo logoA = new Logo(arrR, arrC, text);

        logoA.setRectangle(new Rectangle[] {rect, rect, rect, rect});
        logoA.setCircle(new Circle[]{circ, circ, circ, circ});

        /* vorige stap
        System.out.println("For the regular Logo");
        System.out.println("The total surface area of your Logo is: " + logo.getArea());
        System.out.println("The text displayed on your Logo will be: " + logo.getText());
        */
        System.out.println("");
        System.out.println("For the array Logo");
        System.out.println("The total surface area of your Logo is: " + logoA.getArea());
        System.out.println("The text displayed on your Logo will be: " + logoA.getText());

    }
}
