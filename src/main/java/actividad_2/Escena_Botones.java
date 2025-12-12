package actividad_2;

import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import javafx.scene.control.Label;


public class Escena_Botones {
    @FXML
    private Label contador;
    @FXML
    private Label teclaPulsada;

    private int cont=1;
    private KeyCode codigoTecla;

    public void reset(MouseEvent mouseEvent) {
        contador.setText("");
        teclaPulsada.setText("");
    }

    public void cancel(MouseEvent mouseEvent) {

    }

    public void teclaPulsada(KeyEvent keyEvent) {
        /*
         if(){
            codigoTecla= keyEvent.getCode();
        }else{

        }
        * */



    }
}
