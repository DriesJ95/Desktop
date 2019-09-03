package graphics;

public abstract class Shape {
    private static int count = 0;
    private int x;
    private int y;

    public Shape(){
        this(0,0);
    }
    public Shape(int x, int y){
        this.setX(x);
        this.setY(y);
        count++;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setPosition(int x, int y){
        this.setX(x);
        this.setY(y);
    }
    abstract double getArea();
    abstract double getPerimeter();
    public static int getCount(){
        return count;
    }

}
