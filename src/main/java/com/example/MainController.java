package com.example;
import java.util.InputMismatchException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class MainController {

    @FXML
    private TextField heightField;

    @FXML
    private TextField radiusField;

    @FXML
    private TextField surfaceField;

    @FXML
    void onClickCalcButton(ActionEvent event) {
        this.startCalc();
    }

    void startCalc() {
        this.testInput();
        double radius = Double.parseDouble(radiusField.getText());
        double height = Double.parseDouble(heightField.getText());
        double surface = Cylinder.calcSurface(radius, height);
        surfaceField.setText(String.valueOf(surface));
    }

    void testInput() {
        String radiusStr = radiusField.getText();
        String heightStr = heightField.getText();
        if (radiusStr.isEmpty() || heightStr.isEmpty()) {
            this.showMsg();
            throw new InputMismatchException("Hiba! Nem lehet üres a bemenet!");
        }
    }

    void showMsg() {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setHeaderText("Hibás bemenet");
        alert.setTitle("Hiba");
        alert.setContentText("Nem lehet üres a bemenet!");
        alert.showAndWait();
    }

}
