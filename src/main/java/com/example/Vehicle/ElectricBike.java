package com.example.Vehicle;

public class ElectricBike extends Vehicle implements Bycycle,ElectricVehicle{
    private int pedalAssistThresHold;

    public void setPedalAssistThresHold(int thresHold){
        pedalAssistThresHold=thresHold;
    }
    public int getPedalAssistThresHold(){
        return(pedalAssistThresHold);
    }
    @Override
    public void getBatteryType() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void getBrakeType(BrakeType value) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void getFrameSize(int size) {
        // TODO Auto-generated method stub
        
    }
}
