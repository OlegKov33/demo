package com.example;

import java.io.IOException;

import javafx.fxml.FXML;

public class launchController {
    @FXML
    private void goToManager() throws IOException{
        App.setRoot("managerVehi");
    }
    @FXML
    private void goToAddVehi() throws IOException{
        App.setRoot("addVehi");
    }
}
