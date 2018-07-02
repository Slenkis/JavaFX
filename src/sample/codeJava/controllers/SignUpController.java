//  signUpWindow.fxml

package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import db.Handler;
import javafx.stage.Stage;
import scenes.SceneTemplates;
import specific.User;


public class SignUpController {

    @FXML
    private Button back_auth_Window_Button;

    @FXML
    private RadioButton signUpMale_radio;

    @FXML
    private RadioButton signUpFemale_radio;

    @FXML
    private Button submit_signUp_Button;

    @FXML
    private TextField signUpName_Field;

    @FXML
    private TextField signUpLastName_Field;

    @FXML
    private TextField signUpLogin_Field;

    @FXML
    private PasswordField signUpPassword_Field;

    @FXML
    void initialize() {
        back_auth_Window_Button.setOnAction(event -> {
            Stage stageAuth = AuthController.getCheckAuth();
            stageAuth.setTitle("Subus");
            stageAuth.setScene(SceneTemplates.getSceneAuth());
        });

        ToggleGroup radioGroup = new ToggleGroup();
        signUpMale_radio.setToggleGroup(radioGroup);
        signUpFemale_radio.setToggleGroup(radioGroup);

        submit_signUp_Button.setOnAction(event -> {
                addNewUser();
        });
    }

    private void addNewUser() {
        String fname = signUpName_Field.getText();
        String lname = signUpLastName_Field.getText();
        String username = signUpLogin_Field.getText();
        String password = signUpPassword_Field.getText();
        String gender;
        if (signUpMale_radio.isSelected())
            gender = "Male";
        else
            gender = "Female";
        User user = new User(fname, lname, username, password, gender);
        Handler handler = new Handler();
        handler.signUpUser(user);
        handler.closeConnection();
    }
}

