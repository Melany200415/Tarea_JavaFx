package com.example.demo;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginController {

    @FXML
    private TextField Usuario;

    @FXML
    private PasswordField Contraseña;

    @FXML
    private ComboBox<String> cbRol;

    @FXML
    public void initialize() {
        cbRol.setItems(FXCollections.observableArrayList("Administrador", "Cajero"));
    }

    @FXML
    private void onIngresarButtonClick(ActionEvent event) {
        String user = Usuario.getText();
        String pass = Contraseña.getText();
        String rol = cbRol.getValue();
        // Campos vacios
        if (user.isEmpty() || pass.isEmpty() || rol == null) {
            mostrarAlerta("Error", "Complete todos los campos");
            return;
        }
        // Verificar el rol y usuario con datos quemados
        if (rol.equals("Administrador") && user.equals("admin") && pass.equals("123")) {
           //Abre el otro formulario
            abrirVentana("Administrador.fxml", event);

        } else if (rol.equals("Cajero") && user.equals("cajero") && pass.equals("123")) {
            abrirVentana("Cajero.fxml", event);

        } else {
            mostrarAlerta("Error", "Credenciales incorrectas");
        }
    }


    @FXML
    private void onsalirButtonClick(ActionEvent event) {
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.close();
    }

    private void abrirVentana(String archivoFXML, ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(archivoFXML));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

            // cerrar login
            Stage actual = (Stage) ((Button) event.getSource()).getScene().getWindow();
            actual.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}