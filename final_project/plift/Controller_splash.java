package plift;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller_splash {

    @FXML public Button start_button;

    @FXML public void setStart_button_action() throws IOException {
        Stage stage = (Stage) start_button.getScene().getWindow();
        stage.hide();
        Stage secondaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("form_mainapp.fxml"));
        secondaryStage.setTitle("plift - Lifting Calculator");
        secondaryStage.setScene(new Scene(root, 1200, 600));
        secondaryStage.show();
    }

    @FXML private void initialize() {
    }

}

