package com.example;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.VBox;

public class addVehiController {
    
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

    public RadioButton a1;
    public RadioButton a2;
    public RadioButton a3;
    public RadioButton a11;
    public RadioButton a12;
    public RadioButton a13;

    public RadioButton b1;
    public RadioButton b2;
    public RadioButton b3;
    public RadioButton b11;
    public RadioButton b12;

    public RadioButton c1;
    public RadioButton c2;
    public RadioButton c3;

    private MenuItem toMan;
    private MenuItem toAdd;
    private MenuItem toLaunch;

    //TO AND FROM LAUNCH PAGE
    
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
    private void select11(){if(a1.isSelected()==true){a2.setSelected(false);a3.setSelected(false);}}
    @FXML
    private void select12(){if(a2.isSelected()==true){a1.setSelected(false);a3.setSelected(false);}}
    @FXML
    private void select13(){if(a3.isSelected()==true){a1.setSelected(false);a2.setSelected(false);}}
    @FXML
    private void select111(){if(a11.isSelected()==true){a12.setSelected(false);a13.setSelected(false);}}
    @FXML
    private void select112(){if(a12.isSelected()==true){a11.setSelected(false);a13.setSelected(false);}}
    @FXML
    private void select113(){if(a13.isSelected()==true){a11.setSelected(false);a12.setSelected(false);}}

    @FXML
    private void select11b(){if(b1.isSelected()==true){b2.setSelected(false);b3.setSelected(false);}}
    @FXML
    private void select12b(){if(b2.isSelected()==true){b1.setSelected(false);b3.setSelected(false);}}
    @FXML
    private void select13b(){if(b3.isSelected()==true){b1.setSelected(false);b2.setSelected(false);}}
    @FXML
    private void select111b(){if(b11.isSelected()==true){b12.setSelected(false);}}
    @FXML
    private void select112b(){if(b12.isSelected()==true){b11.setSelected(false);}}
    
    @FXML
    private void select11c(){if(c1.isSelected()==true){c2.setSelected(false);c3.setSelected(false);}}
    @FXML
    private void select12c(){if(c2.isSelected()==true){c1.setSelected(false);c3.setSelected(false);}}
    @FXML
    private void select13c(){if(c3.isSelected()==true){c1.setSelected(false);c2.setSelected(false);}}
    
    
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
