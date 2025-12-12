package actividad_2;

import com.example.interfacesfx.HelloApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Escena_Botones.class.getResource("Escena_btns.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 540);
        primaryStage.setTitle("Botones!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
