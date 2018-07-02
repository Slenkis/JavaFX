package main;
<<<<<<< HEAD
=======

>>>>>>> 778c51cc76bde65297b3b946f1346565e83e7e23
import javafx.application.Application;
import javafx.stage.Stage;
import scenes.SceneTemplates;

public class Main extends Application {
    private static Stage manageStage;

    @Override
    public void start(Stage primaryStage) {
        manageStage = primaryStage;
<<<<<<< HEAD
        primaryStage.setScene(SceneTemplates.getSceneAuth());
=======
        try {
            primaryStage.setScene(SceneTemplates.getSceneAuth());
        } catch (Exception e) {
            System.out.println("main 14");
        }

>>>>>>> 778c51cc76bde65297b3b946f1346565e83e7e23
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
<<<<<<< HEAD

=======
>>>>>>> 778c51cc76bde65297b3b946f1346565e83e7e23
