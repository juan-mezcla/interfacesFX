package login_con_DB;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

public class loginController {
    private StackPane ventanaVariable;
    public void cambiarVista(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent nuevaVista = loader.load();

            ventanaVariable.getChildren().setAll(nuevaVista);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }


}
