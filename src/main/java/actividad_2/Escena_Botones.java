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
    private Button btn_Cancel;
    private static int cont=1;

    public void eventoBtns(MouseEvent mouseEvent) {
        cont_botones((Button) mouseEvent.getTarget());
    }

    public void teclaPulsada(KeyEvent keyEvent) {

        if (KeyCode.ENTER==keyEvent.getCode()){

            teclaPulsada.setText("ENTER");

        }

        if (KeyCode.ESCAPE==keyEvent.getCode()){
            teclaPulsada.setText("ESCAPE");
            cont_botones(btn_Cancel);
        }
    }

    public void cont_botones(Button btnSeleccionado){

        if (btnSeleccionado.getText().equalsIgnoreCase("Reset")){
            contador.setText("Label");
            teclaPulsada.setText("Label");
            cont=1;
        }else{
        if(contador.getText().contains(btnSeleccionado.getText())){
            contador.setText("Se ha pulsado el boton "+btnSeleccionado.getText()+" "+cont+" veces");

            cont++;

        }else{
            cont=1;
            contador.setText("Se ha pulsado el botonn "+btnSeleccionado.getText()+" "+cont+" veces");
            cont++;
        }
    }
    }
}
