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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Nader
 */
public class ConverterPageController implements Initializable {

    @FXML
    private Label titleLabel;
    @FXML
    private Button logoutButton;
    @FXML
    private TextField USDTextField;
    @FXML
    private TextField NISTextField;
    @FXML
    private Label USDLabel;
    @FXML
    private Label NISLabel;
    @FXML
    private Label TOLabel;
    @FXML
    private Button convertButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logoutAction(ActionEvent event) {
        ViewManager.switcher.openLogin();
    }

    @FXML
    private void USDTextAction(ActionEvent event) {
    }

    @FXML
    private void NISTextAction(ActionEvent event) {
    }

    @FXML
    private void convertAction(ActionEvent event) {
        if (USDTextField.getText().isEmpty()){
            int NIS = Integer.parseInt(NISTextField.getText());
            double NIStoUSD = NIS * 0.27;
            USDTextField.setText(NIStoUSD+"");
            NISTextField.setText("");
        } else if (NISTextField.getText().isEmpty()){
            int USD = Integer.parseInt(USDTextField.getText());
            double USDtoNIS = USD * 3.67;
            NISTextField.setText(USDtoNIS+"");
            USDTextField.setText("");
        }
    }
    
}
