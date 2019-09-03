package logo;

public class Circle {
    public static final int ANGLES;
    private static int count;
    private int x;
    private int y;
    private int radius;

    static{
        ANGLES = 0;
        count = 0;
    }
    public Circle(){
        this(0,0,0);
    }
    public Circle(int radius) {
        this(radius, 0, 0);
    }
    public Circle(int radius, int x, int y){
        setRadius(radius);
        setX(x);
        setY(y);
        count++;
    }
    public Circle(Circle circle){
        this(circle.getRadius(), circle.getX(), circle.getY());
    }

    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = Math.abs(x);
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y = Math.abs(y);
    }
    public void setPosition(int x, int y){
        setX(x);
        setY(y);
    }
    public int getRadius(){
        return this.radius;
    }
    public void setRadius(int radius){
        this.radius = Math.abs(radius);
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public void grow(int d){
        radius += radius;
        if (radius < 0){
            radius = 0;
        }
    }
    public static int getCount(){
        return count;
    }
}

