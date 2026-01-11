package tablaPersonas;

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
        FXMLLoader fxmlLoader = new FXMLLoader(TablaController.class.getResource("tablaPersona.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 540);
        primaryStage.setTitle("Tabla personitas!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
