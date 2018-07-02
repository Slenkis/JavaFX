package main;
import javafx.application.Application;
import javafx.stage.Stage;
import scenes.SceneTemplates;

public class Main extends Application {
    private static Stage manageStage;

    @Override
    public void start(Stage primaryStage) {
        manageStage = primaryStage;
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

