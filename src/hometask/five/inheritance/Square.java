package hometask.five.inheritance;

/**
 * Created by horsey on 19.01.16.
 */
public class Square {
    private int startPointX;
    private int startPointY;
    private int sideLength;
    private Color color;

    public Square() {
        this.color = Color.WHITE;
        this.startPointX = 0;
        this.startPointY = 0;
        this.sideLength = 1;
    }

    public Square(int startPointX, int startPointY, int sideLength, Color color) {
        this.startPointX = startPointX;
        this.startPointY = startPointY;
        this.sideLength = sideLength;
        this.color = color;
    }

    public int getStartPointX() {
        return startPointX;
    }

    public void setStartPointX(int startPointX) {
        this.startPointX = startPointX;
    }

    public int getStartPointY() {
        return startPointY;
    }

    public void setStartPointY(int startPointY) {
        this.startPointY = startPointY;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void move (int x, int y){
        this.startPointX = this.startPointX + x;
        this.startPointY = this.startPointY +y;
    }

    public void reset () {
        this.color = Color.WHITE;
        this.startPointX = 0;
        this.startPointY = 0;
        this.sideLength = 1;
    }

    @Override
    public String toString() {

        return "Square{" +
                "startPointX=" + startPointX +
                ", startPointY=" + startPointY +
                ", sideLength=" + sideLength +
                ", color=" + color +
                '}';
    }

    public double areaCalc () {
        return Math.pow(this.sideLength,2);
    }

    public double perimeterCalc () {
        return this.sideLength*4;
    }
}
