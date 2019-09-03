package graphics;

public class Rectangle {
    public static final int ANGLES;
    private static int count;
    private int height;
    private int width;
    private int x;
    private int y;

    static {
        count = 0;
        ANGLES = 4;
    }

    public Rectangle(){
        this(0, 0, 0, 0);
    }
    public Rectangle (int height, int width){
        this(height, width, 0, 0);
    }
    public Rectangle (int height, int width, int x, int y){
        this.setHeight(height);
        this.setWidth(width);
        this.setPosition(x,y);
        count++;
    }
    public Rectangle (Rectangle rect){
        this(rect.height, rect.width, rect.x, rect.y);
    }

    public double getArea(){
        return (height*width);
    }
    public double getPerimeter(){
        return x+x+y+y;
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public void setHeight(int height){
        this.height = Math.abs(height);
    }
    public void setWidth(int width){
        this.width = Math.abs(width);
    }
    public void setPosition(int x, int y){
        this.setX(x);
        this.setY(y);
    }
    public void setX(int x){
        this.x = Math.abs(x);
    }
    public void setY(int y){
        this.y = Math.abs(y);
    }
    public void grow(int d){
        if (d < 0 && Math.abs(d) < width) {
            width += d;
        }else if ( d > 0) {
            width += d;
        }else{
            width = 0;
        }if (d < 0 && Math.abs(d) < height){
            height += d;
        }else if ( d > 0) {
            height += d;
        }else{
            height = 0;
        }
    }
    public static int getCount(){
        return count;
    }
}
