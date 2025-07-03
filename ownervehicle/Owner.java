package ownervehicle;

import java.util.List;

public class Owner {

    private List<Vehicle> vehicles;
    Owner(){

    }
    
    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }
}
