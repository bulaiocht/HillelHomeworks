package hometask.nine.anonymclass;

import java.util.Date;

/**
 * Created by horsey on 03.02.16.
 */
public class RentaCar {
    private Customer customer;
    private Date rentdate;
    private class Customer {
        private String name;
        private Date date;

        public Customer(String name, Date date) {
            this.name = name;
            this.date = date;
        }
        public String getName() {
            return name;
        }
        public Date getDate() {
            return date;
        }
    }
    public Customer getCustomer() {
        return customer;
    }
    public void createCustomer(String name, Date rentDate) {
        this.customer = new Customer (name, rentDate);
    }
    public Date getRentdate() {
        return rentdate;
    }
    public Car rent (){
        class CarForRent extends Car {
            Customer customer;
            Date rentDate;
            public CarForRent(String model, String color, String vin, Charger charger, BodyType bodyType) {
                super(model, color, vin, charger, bodyType);
                this.customer = getCustomer();
                this.rentDate = getRentdate();
            }

            @Override
            public String toString() {
                return "CarForRent{" +
                        "customer=" + customer.getName() +
                        ", rentDate=" + rentDate +
                        "car" + super.toString() +
                        '}';
            }
        }

        CarForRent.Charger charger = new CarForRent.Charger("AverCharger", 25, null);

        CarForRent rentCar = new CarForRent("Lanos", "green", "1336", charger, Car.BodyType.UNIVERSAL);
        return rentCar;
    }

    @Override
    public String toString() {
        return "Car rented to " +
                "customer: " + customer.toString() +
                ", rent date: " + rentdate.toString() +

                '}';
    }
}
