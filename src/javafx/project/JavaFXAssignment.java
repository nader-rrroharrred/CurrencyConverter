/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.project;

import Controller.Admin.LoginPageController;
import View.ViewManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class JavaFXAssignment extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        ViewManager.openSwitcher();
    }
    
    public static void main(String [] args){
       launch(args);
    }
    
}
