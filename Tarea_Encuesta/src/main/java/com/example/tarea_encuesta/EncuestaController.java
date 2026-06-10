package com.example.tarea_encuesta;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class EncuestaController {

    @FXML
    private RadioButton rb11;

    @FXML
    private RadioButton rb22;

    @FXML
    private RadioButton rb31;

    @FXML
    private RadioButton rb42;

    @FXML
    private Label lblPuntaje;

    @FXML
    private Label lblCorrectas;

    @FXML
    private Label lblIncorrectas;

    @FXML
    private void calcularPuntaje() {

        int correctas = 0;

        if (rb11.isSelected()) {
            correctas++;
        }

        if (rb22.isSelected()) {
            correctas++;
        }

        if (rb31.isSelected()) {
            correctas++;
        }

        if (rb42.isSelected()) {
            correctas++;
        }

        int incorrectas = 4 - correctas;
        int puntaje = correctas * 5;

        lblPuntaje.setText("Puntaje: " + puntaje);
        lblCorrectas.setText("Correctas: " + correctas);
        lblIncorrectas.setText("Incorrectas: " + incorrectas);
    }

    @FXML
    private void salir() {
        System.exit(0);
    }
}