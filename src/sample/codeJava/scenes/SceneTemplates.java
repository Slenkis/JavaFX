package scenes;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class SceneTemplates {
    private static Scene sceneAuth() {
        Parent rootAuth = null;
        try {
            rootAuth = FXMLLoader.load(SceneTemplates.class.getResource("/fxmls/authWindow.fxml"));
        } catch (IOException e) {
            System.out.println("fxml err main");
            e.printStackTrace();
        }
        assert rootAuth != null;
        return new Scene(rootAuth);
    }

    public static Scene getSceneAuth() {
        return sceneAuth();
    }

    private static Scene sceneSignUp() {
        Parent rootAuth = null;
        try {
            rootAuth = FXMLLoader.load(SceneTemplates.class.getResource("/fxmls/signUpWindow.fxml"));
        } catch (IOException e) {
            System.out.println("fxml err main");
            e.printStackTrace();
        }
        assert rootAuth != null;
        return new Scene(rootAuth);
    }

    public static Scene getSceneSignUp() {
        return sceneSignUp();
    }

    private static Scene sceneApp() {
        Parent rootAuth = null;
        try {
            rootAuth = FXMLLoader.load(SceneTemplates.class.getResource("/fxmls/appWindow.fxml"));
        } catch (IOException e) {
            System.out.println("fxml err main");
            e.printStackTrace();
        }
        assert rootAuth != null;
        return new Scene(rootAuth);
    }

    public static Scene getSceneApp() {
        return sceneApp();
    }

}


