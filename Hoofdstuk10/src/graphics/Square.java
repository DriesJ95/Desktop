package graphics;

public class Square extends Rectangle {
    public final String DESCRIPTION = super.DESCRIPTION + "Square";
    private static int count = 0;

    public Square(){
        this(0,0,0);
    }

    public Square(int s){
        this(s,0,0);
    }

    public Square(int s, int x, int y){
        super(s,s,x,y);
        count++;
    }

    public Square (Square square){
        super(square);
    }
    @Override
    public void setHeight(int h){
        setSide(h);
    }
    @Override
    public void setWidth(int w){
        setSide(w);
    }
    public int getSide(){
        return getHeight();
    }
    public void setSide(int side){
        super.setHeight(side);
        super.setWidth(side);
    }
    public static int getCount(){
        return count;
    }
}
