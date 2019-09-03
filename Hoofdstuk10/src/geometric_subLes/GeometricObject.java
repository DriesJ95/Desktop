package geometric_subLes;

public class GeometricObject {
    private String color;
    private boolean isFilled;

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setFilled(boolean isFilled){
        this.isFilled = isFilled;
    }

    public boolean isFilled(){
        return isFilled;
    }

    @Override
    public String toString(){
        return "The color is " + getColor() + ". Is the object filled? " + isFilled();
    }
}
