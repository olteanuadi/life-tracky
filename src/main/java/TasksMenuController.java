import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class TasksMenuController implements Initializable {

    @FXML
    private Button homeButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void handleButtonAction (ActionEvent event) throws Exception {
        Stage stage;
        Parent root;

        if(event.getSource()==homeButton){
            stage = (Stage) homeButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        }
        else {
            stage = (Stage) homeButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        }

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



}