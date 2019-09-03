package geometric_subLes;

public class GeometricObjectApp {
    public static void main(String[] args) {

        GeometricObject geo = new GeometricObject();
        geo.setColor("White");
        //Het object zonder parameters zal altijd de toString() teruggeven van de Klasse
        System.out.println(geo);

        Rectangle rect = new Rectangle();
        rect.setHeight(5);
        rect.setWidth(8);
        rect.setColor("Black");
        rect.setFilled(true);

        System.out.println(rect);

    }
}
