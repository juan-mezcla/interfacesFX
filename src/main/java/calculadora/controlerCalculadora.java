package calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.input.MouseEvent;

public class controlerCalculadora {

    @FXML
    private Spinner<Integer> operador1;

    @FXML
    private Spinner<Integer> operador2;

    @FXML
    private Label resultado;

    @FXML
    public void operacion(MouseEvent mouseEvent) {

        char operacion = ((Button) mouseEvent.getSource())
                .getText()
                .charAt(0);

        int op1 = operador1.getValue();
        int op2 = operador2.getValue();

        switch (operacion) {
            case '+':
                resultado.setText("Resultado: " + (op1 + op2));
                break;
            case '-':
                resultado.setText("Resultado: " + (op1 - op2));
                break;
            case 'x':
                resultado.setText("Resultado: " + (op1 * op2));
                break;
            case '/':
                if (op2==0){
                    resultado.setText("No puedes dividir entre 0");
                }else{
                    resultado.setText("Resultado: " + (op1 / op2));
                }
                break;
            case '%':
                if (op2==0){
                    resultado.setText("No puedes dividir entre 0");
                }else{
                    resultado.setText("Resultado: " + (op1 % op2));
                }

                break;
        }
    }

    @FXML
    public void initialize() {
        operador1.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(-1000, 1000, 0)
        );
        operador2.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(-1000, 1000, 0)
        );
    }


    @FXML
    public void borrar(ActionEvent event) {
        operador1.getValueFactory().setValue(0);
        operador2.getValueFactory().setValue(0);
        resultado.setText("Resultado:");
    }
}
