package hometask.five.inheritance;

/**
 * Created by horsey on 19.01.16.
 */
public class Circle {
    private Color color;
    private int centerX;
    private int centerY;
    private int radius;

    public Circle () {
        this.centerX = 0;
        this.centerY = 0;
        this.radius = 1;
        this.color = Color.WHITE;
    }

    public Circle (int x, int y, int radius, Color color) {
        this.centerX = x;
        this.centerY = y;
        this.radius = radius;
        this.color = color;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public int getCenterX() {
        return centerX;
    }

    public Color getColor() {
        return color;
    }

    public int getCenterY() {
        return centerY;
    }

    public void move (int x, int y){
        this.centerX = this.centerX + x;
        this.centerY = this.centerY + y;
    }

    public double areaCalc(){
        double area = Math.PI*Math.pow(this.radius, 2);
        return area;
    }

    public double lengthCalc () {
        double length = 2*Math.PI*this.radius;
        return length;
    }

    public void reset (){
        setCenterX(0);
        setCenterY(0);
        setRadius(1);
        setColor(Color.WHITE);

    }

    @Override
    public String toString() {

        return "Circle{" +
                "color=" + color +
                ", centerX=" + centerX +
                ", centerY=" + centerY +
                ", radius=" + radius +
                '}';
    }
}
