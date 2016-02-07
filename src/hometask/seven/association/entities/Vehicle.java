package hometask.seven.association.entities;

/**
 * Created by horsey on 25.01.16.
 */
public abstract class Vehicle {
    private String model;
    private String licensePlate;
    private String vinId;
    private DriverLicense.Category category;

    public Vehicle() {
    }

    public Vehicle(String model, String licensePlate, String vinId, DriverLicense.Category category) {
        this.model = model;
        this.licensePlate = licensePlate;
        this.vinId = vinId;
        this.category = category;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVinId() {
        return vinId;
    }

    public void setVinId(String vinId) {
        this.vinId = vinId;
    }

    public DriverLicense.Category getCategory() {
        return category;
    }

    public void setCategory(DriverLicense.Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", vinId='" + vinId + '\'' +
                ", category=" + category +
                '}';
    }
}
