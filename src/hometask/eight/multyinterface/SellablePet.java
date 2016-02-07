package hometask.eight.multyinterface;

/**
 * Created by Администратор on 27.01.2016.
 */
public class SellablePet extends Pet implements Sellable {

    private int price;

    public SellablePet(String kind, String name, int price) {
        super(kind, name);
        this.price = price;
    }

    @Override
    public String description() {
        return "name is"+ getName();
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public String name() {
        return getKind();
    }
}
