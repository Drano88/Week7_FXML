package com.mycompany.week_7_java_fxml;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondaryController {
    
      @FXML
    private Label label1;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    @FXML
    private void printMyName() throws IOException {
        
        label1.setText("Miguel Medrano");
    }
}