module com.example.polynomialcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.polynomialcalculator to javafx.fxml;
    exports com.example.polynomialcalculator;
    exports GUI;
    exports BusinessLogic;
    exports Model;
}