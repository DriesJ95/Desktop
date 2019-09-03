package graphics;

public class Circle extends Shape{
    public static final int ANGLES;
    private static int count;
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
        super(x,y);
        this.setRadius(radius);
        count++;
    }
    public Circle(Circle circle){
        this(circle.getRadius(), circle.getX(), circle.getY());
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

