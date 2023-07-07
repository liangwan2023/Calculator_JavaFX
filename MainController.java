import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Label lblOutput;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtName2;
    
    @FXML
    void onClickAdd(ActionEvent event) {
        int num1 = Integer.parseInt(txtName.getText());
        int num2 = Integer.parseInt(txtName2.getText());
        int sum = num1 + num2;
       lblOutput.setText("Result: " + sum);
    }

   

    @FXML
    void onClickDivide(ActionEvent event) {
        int num1 = Integer.parseInt(txtName.getText());
        int num2 = Integer.parseInt(txtName2.getText());
        double divide = num1 / num2;
       lblOutput.setText("Result: " + divide);

    }

    @FXML
    void onClickMulitply(ActionEvent event) {
        int num1 = Integer.parseInt(txtName.getText());
        int num2 = Integer.parseInt(txtName2.getText());
        int divide = num1 * num2;
       lblOutput.setText("Result: " + divide);
    }

    @FXML
    void onClickSubtract(ActionEvent event) {
        int num1 = Integer.parseInt(txtName.getText());
        int num2 = Integer.parseInt(txtName2.getText());
        double subtract = num1 - num2;
       lblOutput.setText("Result: " + subtract);

    }

}
