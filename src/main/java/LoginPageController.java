import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoginPageController {

    @FXML
    private Button ButtonClick01;

    @FXML
    private Button ButtonClick02;

    @FXML
    private Button ButtonClick03;

    @FXML
    private Button ButtonClick04;

    @FXML
    private Button btnSubmit;

    @FXML
    private Button ButtonClick05;

    @FXML
    void Button01OnAction(ActionEvent event) {
        System.out.println("Button01 Click!!");

    }

    @FXML
    void Button02OnAction(ActionEvent event) {
        System.out.println("Button02 Click!!");
    }

    @FXML
    void Button03OnAction(ActionEvent event) {
        System.out.println("Button03 Click!!");

    }

    @FXML
    void Button04OnAction(ActionEvent event) {
        System.out.println("Button04 Click!!");

    }

    @FXML
    void btnSubmitOnAction(ActionEvent event) {
        System.out.println("Button Click!!");

    }

    public void Button05OnAction(ActionEvent actionEvent) {
        System.out.println("Button05 Click!!");

    }
}
