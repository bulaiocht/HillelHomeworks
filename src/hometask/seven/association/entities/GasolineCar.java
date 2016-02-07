package hometask.seven.association.entities;

/**
 * Created by horsey on 25.01.16.
 */
public class GasolineCar extends Vehicle {
    private int cc;
    private int hp;
    public enum Transmission {MECHANICAL, AUTOMATIC};
    private Transmission transmission;

    public GasolineCar() {
    }

    public GasolineCar(int cc, int hp, Transmission transmission) {
        this.cc = cc;
        this.hp = hp;
        this.transmission = transmission;
    }

    public GasolineCar(String model, String licensePlate, String vinId, DriverLicense.Category category, int cc, int hp, Transmission transmission) {
        super(model, licensePlate, vinId, category);
        this.cc = cc;
        this.hp = hp;
        this.transmission = transmission;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "GasolineCar{" +
                "cc=" + cc +
                ", hp=" + hp +
                ", transmission=" + transmission +
                '}';
    }
}
