package com.example.Vehicle;

public class ElectricScooter extends Vehicle implements ElectricVehicle{
    private String[] rideModel;
    public void setRideModel(String[] array){
        rideModel=array;
    }
    public String[] getRideModel(){
        return(rideModel);
    }
    @Override
    public void getBatteryType() {
        // TODO Auto-generated method stub
        
    }
}
