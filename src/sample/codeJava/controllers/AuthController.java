//  authWindow.fxml
package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import animation.FailAnimation;
import main.Main;
import scenes.SceneTemplates;
import specific.User;
import db.Handler;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthController {
    private static Stage checkAuth;

    static Stage getCheckAuth() {
        return checkAuth;
    }

    @FXML
    private TextField login_Field;

    @FXML
    private PasswordField password_Field;

    @FXML
    private Button logIn_Button;

    @FXML
    private Button singUp_Button;

    @FXML
    void initialize() {
        singUp_Button.setOnAction(event -> {
            Stage stageSignUp = Main.getManageStage();
            stageSignUp.setTitle("Регистрация");
            stageSignUp.setScene(SceneTemplates.getSceneSignUp());
            checkAuth = stageSignUp;
        });

        logIn_Button.setOnAction(event -> {
            String loginTrim = login_Field.getText().trim();
            String passwordTrim = password_Field.getText().trim();
            if (!loginTrim.equals("") & !passwordTrim.equals("")) {
                try {
                    loginingUser(loginTrim, passwordTrim);
                } catch (SQLException e) {
                    System.out.println("52 и ниже в AuthController");
                    //e.printStackTrace();
                }
            }
        });
    }


    private void loginingUser(String loginTrim, String passwordTrim) throws SQLException, NullPointerException {
        Handler handler = new Handler();
        User user = new User();
        user.setUsername(loginTrim);
        user.setPassword(passwordTrim);
        ResultSet resultSet = handler.loginUser(user);

        int counter = 0;
        while (resultSet.next()) {
            counter++;
        }
        if (counter >= 1) {
            //переход в appWindow
            Stage stageApp = Main.getManageStage();
            stageApp.setTitle("Главная");
            stageApp.setScene(SceneTemplates.getSceneApp());
            System.out.println("может идти");
        } else {
            FailAnimation loginFail = new FailAnimation(login_Field);
            FailAnimation passFail = new FailAnimation(password_Field);
            loginFail.playFailAnim();
            passFail.playFailAnim();
        }
        handler.closeConnection();
    }
}
