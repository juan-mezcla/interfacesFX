package calculadoraWindows;

import actividad_2.Escena_Botones;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class calculadoraWindows extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(calcuController.class.getResource("calculadoraWindows.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 540);
        primaryStage.setTitle("Real calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
