package geometric_subLes;

public class Rectangle extends GeometricObject {

    private int width;
    private int height;

    public void setWidth(int width){
        this.width = width;
    }

    public int getWidth(){
        return width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public String toString(){
        return super.toString() + "\n Width: " + getWidth() + " Height: " + getHeight();
    }
}
