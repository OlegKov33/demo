package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;


public class controller {


    public RadioButton defaultButton;
    public RadioButton button1;
    public RadioButton button2;
    public RadioButton button3;
    public VBox selectMountainBike;
    public VBox selectElectricBike;
    public VBox selectElectricScooter;
    public VBox selectBrakeType;
    public VBox selectBattryType;
    public Label text1;
    public Label text2;
    private MenuItem toMan;
    private MenuItem toAdd;
    private MenuItem toLaunch;

    //TO AND FROM LAUNCH PAGE
    @FXML
    private void goToManager() throws IOException{
        App.setRoot("managerVehi");
    }
    @FXML
    private void goToAddVehi() throws IOException{
        App.setRoot("addVehi");
    }
    @FXML
    private void goToLaunch() throws IOException{
        App.setRoot("launch");
    }
    

    @FXML
    private void select(){
        if(defaultButton.isSelected()==true){
        this.button1.setSelected(false);
        this.button3.setSelected(false);
        this.button2.setSelected(false);
        text1.setText("Vehicle type:None");
        selectMountainBike.setVisible(false);
        selectElectricBike.setVisible(false);
        selectElectricScooter.setVisible(false);
        selectBrakeType.setVisible(false);
            selectBattryType.setVisible(false);
    }
        
    }
    
    @FXML
    private void select1(){
        if(button1.isSelected()==true){
            this.defaultButton.setSelected(false);
            this.button3.setSelected(false);
            this.button2.setSelected(false);}
            text1.setText("Vehicle type:Standard Bike");
            selectMountainBike.setVisible(true);
            selectElectricBike.setVisible(false);
            selectElectricScooter.setVisible(false);
            selectBrakeType.setVisible(true);
            selectBattryType.setVisible(false);
    }
    @FXML
    private void select2(){
        if(button2.isSelected()==true){
            this.defaultButton.setSelected(false);
            this.button3.setSelected(false);
            this.button1.setSelected(false);}
            text1.setText("Vehicle type:Electric Bike");
            selectMountainBike.setVisible(false);
            selectElectricBike.setVisible(true);
            selectElectricScooter.setVisible(false);
            selectBrakeType.setVisible(true);
            selectBattryType.setVisible(true);
    }
    @FXML
    private void select3(){
        if(button3.isSelected()==true){
            defaultButton.setSelected(false);
            button1.setSelected(false);
            button2.setSelected(false);}
            text1.setText("Vehicle type:Electric Scooter");
            selectMountainBike.setVisible(false);
            selectElectricBike.setVisible(false);
            selectElectricScooter.setVisible(true);
            selectBrakeType.setVisible(false);
            selectBattryType.setVisible(true);

    }
    @FXML
    private void submit(){
        text2.setText("New vehicle added");
        //Add if statement to track if the form is fully filled or not
    }
    @FXML
    private void cancel(){
        text2.setText("vehicle canceled");
        selectBattryType.setVisible(false);
        selectBrakeType.setVisible(false);
        selectElectricBike.setVisible(false);
        selectElectricScooter.setVisible(false);
        selectMountainBike.setVisible(false);

    }
}
