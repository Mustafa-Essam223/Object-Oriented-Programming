package Controller;
import Stages.ControlsClass;
import Stages.InstructionsClass;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Controls {
    final String IDLE_BUTTON_STYLE = "-fx-background-color:#ff3960 ;-fx-font-family: Forte; -fx-font-size:30;";
    final String HOVERED_BUTTON_STYLE = "-fx-background-color:#ff646c ; -fx-font-family: Forte; -fx-font-size:24;";
        @FXML
        private Button control_back_btn;
        @FXML
        void back_btn_Exited(MouseEvent event) {
            control_back_btn.setStyle(IDLE_BUTTON_STYLE);
        }
        @FXML
        void back_btn_clicked(MouseEvent event)
        {
            ControlsClass.getControls_stage().close();
             InstructionsClass.getInstruction_stage().show();
        }
       @FXML
        void back_btn_entered(MouseEvent event) {
            control_back_btn.setStyle(HOVERED_BUTTON_STYLE);
        }
    }