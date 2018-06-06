package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import scenes.SceneTemplates;


import java.io.IOException;

public class Main extends Application {
    private static Stage manageStage;

    @Override
    public void start(Stage primaryStage) {
        manageStage = primaryStage;
//        Parent rootAuth = null;
//        try {
//            rootAuth = FXMLLoader.load(getClass().getResource("/fxmls/authWindow.fxml"));
//        } catch (IOException e) {
//            System.out.println("fxml err main");
//            e.printStackTrace();
//        }
//
//        assert rootAuth != null;
//        Scene sceneAuth = new Scene(rootAuth);
//        primaryStage.setScene(sceneAuth);

        primaryStage.setScene(SceneTemplates.getSceneAuth());
        primaryStage.setTitle("Subus");
        primaryStage.show();
    }

    public static Stage getManageStage() {
        return manageStage;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
