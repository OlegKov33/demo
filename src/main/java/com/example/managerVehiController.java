package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class managerVehiController {
    public Label name;
    public Label price;
    public Text description;

    @FXML
    public void select1(){
        name.setText("Bike1");
        price.setText("£3");
        description.setText("Type:Mountain Bike\nBrake:Disk\n");
    }
    public void select2(){
        name.setText("Bike2");
        price.setText("£10");
        description.setText("Type:Electric Bike\nBrake:Disk\nBattery Type:Ion");
    }
    public void select3(){
        name.setText("Scooter1");
        price.setText("£1");
        description.setText("Type:Electric Scooter\nBattery Type:Manganese\n");
    }
    public void select4(){
        name.setText("undefined");
        price.setText("free");
        description.setText("template");
    }
    
    @FXML
    private void goToLaunch() throws IOException{
        App.setRoot("launch");
    }
}
