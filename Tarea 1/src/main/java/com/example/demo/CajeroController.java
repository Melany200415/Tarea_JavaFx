package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CajeroController {
@FXML
private Button btnSalir;
    @FXML
    private void salir(ActionEvent event) {

        Stage stage =
                (Stage) btnSalir.getScene().getWindow();
        stage.close();
    }
}