package hometask.seven.association.entities;

/**
 * Created by horsey on 27.01.16.
 */
public class Trailer extends Vehicle {
    private String model;
    private Vehicle draggingVehicle;
    private int serialNum;
    private int emptyWeight;
    private int loadedWeight;
    private DriverLicense.Category requiredCategory;

   /* public Trailer () {
    }*/



    public Trailer(String model, int serialNum, int emptyWeight, int loadedWeight, DriverLicense.Category requiredCategory, Vehicle draggingVehicle) {
        this.model = model;
        this.serialNum = serialNum;
        this.emptyWeight = emptyWeight;
        this.loadedWeight = loadedWeight;
        this.requiredCategory = requiredCategory;
        if (requiredCategory.equals(draggingVehicle.getCategory())) {
            this.draggingVehicle = draggingVehicle;
        } else {
            throw new IllegalArgumentException ("Your driving category is incompatible");
        }
    }

    public void attachToDraggingVehicle(Vehicle draggingVehicle) {
        if (requiredCategory.equals(draggingVehicle.getCategory())) {
            this.draggingVehicle = draggingVehicle;
        } else {
            throw new IllegalArgumentException ("Your driving category is incompatible");
        }
    }

    public Vehicle getDraggingVehicle() {
        return draggingVehicle;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public int getEmptyWeight() {
        return emptyWeight;
    }

    public int getLoadedWeight() {
        return loadedWeight;
    }

    public DriverLicense.Category getRequiredCategory() {
        return requiredCategory;
    }

    @Override
    public String toString() {
        return "Trailer{" +
                "model" + this.model +
                "draggingVehicle=" + this.draggingVehicle +
                ", serialNum=" + this.serialNum +
                ", emptyWeight=" + this.emptyWeight +
                ", loadedWeight=" + this.loadedWeight +
                ", requiredCategory=" + this.requiredCategory +
                '}';
    }
}