/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Admin;

import View.ViewManager;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Nader
 */
public class LoginPageController implements Initializable {

    @FXML
    private ImageView loginLogo;
    @FXML
    private Label usernameLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private Label passwordLabel;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private Button LoginButton;
    @FXML
    private Label loginFailedLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void userTextAction(ActionEvent event) {
    }

    @FXML
    private void passwordAction(ActionEvent event) {
    }

    @FXML
    private void loginAction(ActionEvent event) {
         String pass = passwordTextField.getText();
        if (usernameTextField.getText().equals("user") && pass.equals("userpass")){
            ViewManager.switcher.openConverter();
            usernameTextField.setText("");
            passwordTextField.setText("");
            loginFailedLabel.setText("");
        } else {
            loginFailedLabel.setText("Login Failed");
        }
    }
    
}
