package Generics;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
    private int vehicleId;

    public Vehicle(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                '}';
    }
    void showInfo(){
        System.out.println("Vehicle Id: "+getVehicleId());
    }
}

class Car extends Vehicle{

    private String carModel;

    public Car(int vehicleId, String carModel) {
        super(vehicleId);
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                '}';
    }

}
public class wildCardGenerics {
    public static void main(String[] args) {

        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle(1));
        list.add(new Vehicle(2));
        list.add(new Vehicle(3));
        list.add(new Vehicle(4));

        printList(list);
    }

    public static void printList(List<? extends Vehicle> list){ //upper bound wild card
        for (Vehicle vehicle : list) {
            System.out.println(vehicle);
        }

    }
}
