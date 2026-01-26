package calculadoraWindows;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class calcuController {
    @FXML
    private Button reset,delete,dividir,multi,resta,suma,igual,resto,decimal,btnNegativo,
                   _1,_2,_3,_4,_5,_6,_7,_8,_9,_0;
    @FXML
    private TextField prompt;

    public void numSelect(MouseEvent mouseEvent) {
    }

    public void operacion(MouseEvent mouseEvent) {
    }

    public void numSigno(MouseEvent mouseEvent) {
    }

    public void resultado(MouseEvent mouseEvent) {
        Expression e = new ExpressionBuilder(prompt.getText()).build();
        double resultado = e.evaluate();
        prompt.setText(String.valueOf(resultado));
    }
}
