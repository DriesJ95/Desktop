package graphics;

public class Rectangle extends Shape {
    public final String DESCRIPTION = "Rectangle";
    public static final int ANGLES;
    private static int count;
    private int height;
    private int width;

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
        super(x,y);
        this.setHeight(height);
        this.setWidth(width);
        count++;
    }
    public Rectangle (Rectangle rect){
        this(rect.getHeight(), rect.getWidth(), rect.getX(), rect.getY());
    }

    public double getArea(){
        return (height*width);
    }
    public double getPerimeter(){
        return (height*2) + (width*2);
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
