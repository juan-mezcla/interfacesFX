package login_con_DB.controlador;

import com.almasb.fxgl.entity.action.Action;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HomeController {

    @FXML
    private StackPane stackPanePrincipal;

    @FXML
    private Button btnInicioSesion;
    
    public void cambiarVista(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent nuevaVista = loader.load();

            stackPanePrincipal.getChildren().setAll(nuevaVista);
            Stage stage=(Stage) stackPanePrincipal.getScene().getWindow();
            stage.sizeToScene();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    @FXML
    public void isLogged(ActionEvent e){
        cambiarVista("/login_con_DB/log_in.fxml");

    }

    @FXML
    public void isLoggedUp(ActionEvent e){
        cambiarVista("/login_con_DB/registro.fxml");
        
    }


}
