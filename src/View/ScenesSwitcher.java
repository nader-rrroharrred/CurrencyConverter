/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Admin.ConverterPageController;
import Controller.Admin.LoginPageController;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Nader
 */
public class ScenesSwitcher extends Stage{
    Scene login;
    Scene Converter;
    
    // Load Login Page Scene

    public ScenesSwitcher() throws IOException {
        // Load Login Page Scene
        FXMLLoader Loginloader = new FXMLLoader(getClass().getResource("AdminFXML/LoginPage.fxml"));
        Parent Loginroot = Loginloader.load();
        LoginPageController controller = Loginloader.getController();
        login = new Scene(Loginroot);
        
        // Load Converter Page Scene
        FXMLLoader Converterloader = new FXMLLoader(getClass().getResource("AdminFXML/ConverterPage.fxml"));
        Parent Converterroot = Converterloader.load();
        ConverterPageController convertController = Converterloader.getController();
        Converter = new Scene(Converterroot);
         
    }
    
    public void openLogin(){
        this.setScene(login);
        this.show();
    }
    public void openConverter(){
        this.setScene(Converter);
        this.show();
    }
    
    
}
