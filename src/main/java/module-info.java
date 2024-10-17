module org.example.bmicalculatorapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.bmicalculatorapp to javafx.fxml;
    exports org.example.bmicalculatorapp;
}