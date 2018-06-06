//  appWindow.fxml
package controllers;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import main.Main;


public class AppController {

    @FXML
    private ImageView image_Button;

    @FXML
    void initialize() {
        Stage stageApp = Main.getManageStage();
        image_Button.setOnMouseClicked(event -> {
            stageApp.close();
        });
    }
}
