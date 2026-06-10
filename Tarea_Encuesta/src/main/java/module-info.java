module com.example.tarea_encuesta {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tarea_encuesta to javafx.fxml;
    exports com.example.tarea_encuesta;
}