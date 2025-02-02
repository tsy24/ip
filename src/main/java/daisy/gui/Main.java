package daisy.gui;
import java.io.IOException;

import daisy.Daisy;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

//@@author tsy24-reused
//Reused from https://se-education.org/guides/tutorials/javaFx.html
// with minor modifications
/**
 * A GUI for Daisy using FXML.
 */
public class Main extends Application {

    private Daisy daisy = new Daisy();

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane ap = fxmlLoader.load();
            Scene scene = new Scene(ap);
            stage.setScene(scene);
            stage.setResizable(false);
            fxmlLoader.<MainWindow>getController().setDaisy(daisy);
            stage.setTitle("Daisy");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
