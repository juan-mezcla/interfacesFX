package actividad_2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import javafx.scene.control.Label;


public class Escena_Botones {
    @FXML
    private Label contador;
    @FXML
    private Label teclaPulsada;
    @FXML
    private Button btn1;
    @FXML
    private Button btn_Reset;
    @FXML
    private Button btn3;
    @FXML
    private Button btn_Cancel;
    private int cont=1;
    private KeyCode codigoTecla;

    public void reset(MouseEvent mouseEvent) {
        contador.setText("");
        teclaPulsada.setText("");
    }

    public void eventoBtns(MouseEvent mouseEvent) {
        cont_botones((Button) mouseEvent.getTarget());
    }

    public void teclaPulsada(KeyEvent keyEvent) {

         if(teclaPulsada.getText().contains("Label") || teclaPulsada.getText().contains(keyEvent.getText())){
             contador.setText("Se ha pulsado la tecla "+cont+" veces");
             teclaPulsada.setText(keyEvent.getText());
             cont++;

        }else{
            cont=1;
             contador.setText("Se ha pulsado la tecla "+cont+" veces");
             teclaPulsada.setText(keyEvent.getText());
        }




    }

    public void cont_botones(Button btnSeleccionado){
        if(teclaPulsada.getText().contains(btnSeleccionado.getText())){
            contador.setText("Se ha pulsado el boton "+btnSeleccionado.getText()+" "+cont+" veces");
            teclaPulsada.setText(btnSeleccionado.getText());
            cont++;

        }else{
            cont=1;
            contador.setText("Se ha pulsado el boton "+btnSeleccionado.getText()+" "+cont+" veces");
            teclaPulsada.setText(btnSeleccionado.getText());

        }
    }
}
