package calculadoraWindows;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class calcuController {
    @FXML
    private TextField prompt;

    @FXML
    public void btnSelect(MouseEvent ev) {
       Button btn = (Button) ev.getSource(); 
    
    String btnSeleccionado = btn.getText();
    
    prompt.setText(prompt.getText()+btnSeleccionado );
    }

    public void numSigno(MouseEvent mouseEvent) {

    }

    public void delete(MouseEvent mouseEvent) {
        prompt.setText(prompt.getText(0, prompt.getText().length()-1));
    }

    public void clean(MouseEvent mouseEvent) {
        prompt.clear();
        
    }

    public void resultado(MouseEvent mouseEvent) {
        Expression e = new ExpressionBuilder(prompt.getText()).build();
        double resultado = e.evaluate();
        prompt.setText(String.valueOf(resultado));
    }
}
