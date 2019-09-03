package logo;

public class Logo {
    private Rectangle rect;
    private Circle circ;
    private String t;
    private Rectangle[] arrR;
    private Circle[] arrC;

    public Logo() {
        this(null, null, "");
    }

    public Logo(Rectangle[] arrR, Circle[] arrC, String t) {
        this.arrR = arrR;
        this.arrC = arrC;
        this.t = t;
    }

    public Rectangle getRectangle() {
        return rect;
    }

    public void setRectangle(Rectangle [] arrR) {
        this.arrR = arrR;
    }

    public Circle getCircle() {
        return circ;
    }

    public void setCircle(Circle[] arrC) {
        this.arrC = arrC;
    }


    public String getText() {
        return t;
    }

    public void setText(String t) {
        this.t = t;
    }
    /*
    public double getAreaLogo() {
        return this.rect.getArea() + this.circ.getArea();
    }
    */
    public double getArea() {
        double area = 0;
        for (int i = 0; i < this.arrR.length; i++) {
            area += arrR[i].getArea();
        }
        for (int e = 0; e < this.arrC.length; e++){
            area += arrC[e].getArea();
        }
        return area;
    }
}





