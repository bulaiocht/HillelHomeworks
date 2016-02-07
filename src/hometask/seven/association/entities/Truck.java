package hometask.seven.association.entities;

/**
 * Created by horsey on 25.01.16.
 */
public class Truck extends GasolineCar {

    private int emptyWeight;
    private int loadedWeight;

    public Truck() {
    }

    public Truck(String model, String licensePlate, String vinId, DriverLicense.Category category, int cc, int hp, Transmission transmission, int emptyWeight, int loadedWeight) {
        super(model, licensePlate, vinId, category, cc, hp, transmission);
        this.emptyWeight = emptyWeight;
        this.loadedWeight = loadedWeight;
    }

    public int getEmptyWeight() {
        return emptyWeight;
    }

    public void setEmptyWeight(int emptyWeight) {
        this.emptyWeight = emptyWeight;
    }

    public int getLoadedWeight() {
        return loadedWeight;
    }

    public void setLoadedWeight(int loadedWeight) {
        this.loadedWeight = loadedWeight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "emptyWeight=" + emptyWeight +
                ", loadedWeight=" + loadedWeight +
                '}';
    }
}
