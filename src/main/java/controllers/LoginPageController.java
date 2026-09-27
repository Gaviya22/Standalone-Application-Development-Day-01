package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoginPageController {

    @FXML
    private Button buttonClick01;


    @FXML
    void button01OnAction(ActionEvent event) {
        System.out.println("Click!");
    }

}
