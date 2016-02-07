package hometask.five.inheritance;

/**
 * Created by horsey on 19.01.16.
 */
public class Cube extends Square {
    private int startPointX;
    private int startPointY;
    private int sideLength;
    private Color color;

    public Cube () {
        this.startPointX = 0;
        this.startPointY = 0;
        this.sideLength = 1;
        this.color = Color.WHITE;
    }

    public Cube(int startPointX, int startPointY, int sideLength, Color color) {
        this.startPointX = startPointX;
        this.startPointY = startPointY;
        this.sideLength = sideLength;
        this.color = color;
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
    public int getStartPointX() {
        return startPointX;
    }

    @Override
    public void setStartPointX(int startPointX) {
        this.startPointX = startPointX;
    }

    @Override
    public int getStartPointY() {
        return startPointY;
    }

    @Override
    public void setStartPointY(int startPointY) {
        this.startPointY = startPointY;
    }

    @Override
    public int getSideLength() {
        return sideLength;
    }

    @Override
    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void move(int x, int y) {
        super.move(x, y);
    }

    @Override
    public void reset() {
        super.reset();
    }

    @Override
    public String toString() {
        return "Cube{" +
                "startPointX=" + startPointX +
                ", startPointY=" + startPointY +
                ", sideLength=" + sideLength +
                ", color=" + color +
                ", area=" + areaCalc() +
                ", volume" + volumeCalc() +
                '}';
    }

    @Override
    public double areaCalc() {
        return super.areaCalc()*2 +super.perimeterCalc()*this.getSideLength();
    }

    public double volumeCalc () {
        return super.areaCalc()*this.sideLength;
    }

}
