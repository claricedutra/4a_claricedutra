/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    private Label label;
    @FXML
    private Label lblResultado;
    @FXML
    private Label lblNumero2;
    @FXML
    private Label lblNumero1;
    
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

    @FXML
    private void abrirCadastroAluno(ActionEvent event) {
        try{
    FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
    Scene scene = new Scene(fxmlLoader.load(),400,400);
    Stage stage = new Stage();
    stage.setTitle("Cadastrar aluno");
    stage.setScene(scene);
    stage.show();
        }
        catch(IOException e){

        }
    }

    @FXML
    private void fecharProjeto(Event event) {
    }
    
}

