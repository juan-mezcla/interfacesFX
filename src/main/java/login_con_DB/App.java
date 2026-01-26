package login_con_DB;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login_con_DB.HomeController;

import java.io.IOException;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HomeController.class.getResource("home.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 540);
        primaryStage.setTitle("Tabla personitas login!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
