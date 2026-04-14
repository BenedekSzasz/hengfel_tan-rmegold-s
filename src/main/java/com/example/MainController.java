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
            String msg = "Hiba! Nem lehet üres a bemenet!";
            this.showMsg(msg);
            throw new InputMismatchException(msg);
        }
        if (!radiusStr.matches("[0-9]+") || !heightStr.matches("[0-9]+")) {
            String msg = "Hiba! Csak szám adható meg!";
            this.showMsg(msg);
            throw new InputMismatchException(msg);
        }
    }

    void showMsg(String msg) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setHeaderText("Hibás bemenet");
        alert.setTitle("Hiba");
        alert.initOwner(App._stage);
        alert.setContentText(msg);
        // alert.showAndWait();
        alert.show();
    }

}
