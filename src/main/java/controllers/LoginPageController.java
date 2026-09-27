package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoginPageController {

    @FXML
    private Button buttonClick01;

    @FXML
    void buttonLoginAction(ActionEvent event) {
        System.out.println("Click!");
    }

}
