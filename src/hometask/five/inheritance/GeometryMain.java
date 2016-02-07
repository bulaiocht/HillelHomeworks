package hometask.five.inheritance;

/**
 * Created by horsey on 20.01.16.
 */
public class GeometryMain {
    public static void main(String[] args) {
        Circle circleOne = new Circle(10,15,35,Color.RED);
        Cylinder cylinderOne = new Cylinder(0,0,12,25,Color.GREEN);
        Square squareOne = new Square(3,3,58,Color.BLUE);
        Cube cubeOne = new Cube();

        System.out.println(cubeOne.toString());
        System.out.println(circleOne.toString());
        System.out.println(cylinderOne.toString());
        System.out.println(squareOne.toString());

    }
}
