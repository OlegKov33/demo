package com.example.Vehicle;

public class VehicleManager /*??? Vehicle*/{
    private Vehicle[] vehicles;
    public void addVehicle(Vehicle[] vehicle){
        vehicles = vehicle;
    }
    public Vehicle[] getVehicle(){
        return(vehicles);
    }
}
