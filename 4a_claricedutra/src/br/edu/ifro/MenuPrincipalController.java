/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 01118108256
 */
public class MenuPrincipalController implements Initializable {
    
    @FXML
    private TextField txtUm, txtDois, txtResult;

    @FXML
    private Button btnSoma;
    
    @FXML
    private void soma(ActionEvent event) {
        Double num1, num2, rslt;
        num1 = Double.parseDouble(txtUm.getText());
        num2 = Double.parseDouble(txtDois.getText());
        rslt = num1 + num2;
        txtResult.setText(rslt.toString()); 
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

