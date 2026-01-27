package login_con_DB.controlador;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

public class RegistroController {

    // ... otros atributos como @FXML private TextField passw;

    @FXML
    private void mostrarContrasena(ActionEvent event) {
        // Tu lógica para mostrar u ocultar la contraseña aquí
        System.out.println("Cambiando visibilidad de contraseña...");
    }
    
    @FXML
    private void selectGrupo(ActionEvent event) {
        // También asegúrate de que este método exista, 
        // ya que lo tienes declarado en tu ComboBox
    }
}
