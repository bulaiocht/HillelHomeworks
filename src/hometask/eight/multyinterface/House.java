package hometask.eight.multyinterface;

/**
 * Created by Администратор on 27.01.2016.
 */
public class House implements Sellable {

    private int area;
    private String address;
    private int price;

    public House(int area, String address, int price) {
        this.area = area;
        this.address = address;
        this.price = price;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public String name() {
        return address;
    }

    @Override
    public String description() {
        return "area = " + area;
    }
}
