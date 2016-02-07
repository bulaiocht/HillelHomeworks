package hometask.five.inheritance;

/**
 * Created by horsey on 19.01.16.
 */
public class Cylinder extends Circle {
    private int centerX;
    private int centerY;
    private int radius;
    private int height;
    private Color color;

    public Cylinder(){
        this.centerX = 0;
        this.centerY = 0;
        this.radius = 1;
        this.height = 1;
        this.color = Color.WHITE;
    }

    public Cylinder(int centerX, int centerY, int radius, int height, Color color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.height = height;
        this.color = color;
    }

    @Override
    public int getCenterX() {
        return centerX;
    }

    @Override
    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    @Override
    public int getCenterY() {
        return centerY;
    }

    @Override
    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    @Override
    public int getRadius() {
        return radius;
    }

    @Override
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void reset() {
        setCenterX(0);
        setCenterY(0);
        setRadius(1);
        setHeight(1);
        setColor(Color.WHITE);
    }

    @Override
    public void move(int x, int y) {
        super.move(x, y);
    }

    @Override
    public double areaCalc() {
        return super.areaCalc()*2 + this.height*lengthCalc();
    }

    @Override
    public double lengthCalc() {
        return super.lengthCalc();
    }

    public double volumeCalc () {
        return super.areaCalc()*this.height;
    }

    @Override
    public String toString() {

        return "Cylinder{" +
                "centerX=" + centerX +
                ", centerY=" + centerY +
                ", radius=" + radius +
                ", height=" + height +
                ", color=" + color +
                ", area=" + areaCalc() +
                ", volume=" + volumeCalc() +
                '}';
    }
}