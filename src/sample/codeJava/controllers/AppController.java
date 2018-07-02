//  appWindow.fxml
package controllers;

import javafx.fxml.FXML;
<<<<<<< HEAD
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AppController {
    private int count = 0;

    @FXML
    private Label label;
    @FXML
    private Button button;

    @FXML
    void initialize() {
        button.setOnAction(event -> {
            count++;
            label.setText(String.valueOf(count));
            System.out.println("Free memory (Mb): " + (Runtime.getRuntime().freeMemory() / 1024 / 1024));
        });
    }

=======



public class AppController {

    @FXML
    void initialize() {
    }
>>>>>>> 778c51cc76bde65297b3b946f1346565e83e7e23
}
