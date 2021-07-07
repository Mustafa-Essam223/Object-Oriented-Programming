package Controller;
import Stages.ControlsClass;
import Stages.InstructionsClass;
import Stages.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Instructions {
    final String IDLE_BUTTON_STYLE = "-fx-background-color:#ff3960 ;-fx-font-family: Forte; -fx-font-size:30;";
    final String HOVERED_BUTTON_STYLE = "-fx-background-color:#ff646c ; -fx-font-family: Forte; -fx-font-size:24;";
    @FXML
    private Button controls_btn;
    @FXML
    private Button back_btn;
    @FXML
    void back_btn_entered(MouseEvent event) {
        back_btn.setStyle(HOVERED_BUTTON_STYLE);
    }
    @FXML
    void back_btn_exited(MouseEvent event) {
        back_btn.setStyle(IDLE_BUTTON_STYLE);
    }
    @FXML
    void controls_btn_entered(MouseEvent event) {
        controls_btn.setStyle(HOVERED_BUTTON_STYLE);
    }
    @FXML
    void controls_btn_exited(MouseEvent event) {
        controls_btn.setStyle(IDLE_BUTTON_STYLE);
    }
    @FXML
    void control_btn_clicked(MouseEvent event) throws Exception {
       new ControlsClass();
        InstructionsClass.getInstruction_stage().close();
    }
    @FXML
    void back_btn_clicked(MouseEvent event)
    {
        InstructionsClass.getInstruction_stage().close();
        Main.start_stage.show();
    }

}