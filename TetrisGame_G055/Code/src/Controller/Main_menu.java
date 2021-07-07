package Controller;
import Stages.InstructionsClass;
import Stages.Main;
import Stages.ScoreClass;
import Stages.startgameClass;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Main_menu {
    final String IDLE_BUTTON_STYLE = "-fx-background-color: plum;-fx-font-family: Forte; -fx-font-size:30;";
    final String HOVERED_BUTTON_STYLE = "-fx-background-color: -fx-shadow-highlight-color, -fx-outer-border, -fx-inner-border, -fx-body-color; -fx-font-family: Forte; -fx-font-size:24;";
    @FXML
        private Label tetris_txt;
        @FXML
        private Label game_txt;
        @FXML
        private Button Start_btn;
        @FXML
        private Button score_btn;
        @FXML
        private Button instructions_btn;
        @FXML
        private Button exit_btn;
        @FXML
        void exit_btn_entered(MouseEvent event) {
            exit_btn.setStyle(HOVERED_BUTTON_STYLE);
        }
        @FXML
        void exit_btn_exited(MouseEvent event) {
            exit_btn.setStyle(IDLE_BUTTON_STYLE);
        }
        @FXML
        void innstructions_btn_exited(MouseEvent event) {
            instructions_btn.setStyle(IDLE_BUTTON_STYLE);
        }
        @FXML
        void instructions_btn_entered(MouseEvent event) {
          instructions_btn.setStyle(HOVERED_BUTTON_STYLE);
        }
        @FXML
        void score_btn_entered(MouseEvent event) {
            score_btn.setStyle(HOVERED_BUTTON_STYLE);
        }
        @FXML
        void score_btn_exited(MouseEvent event) {
            score_btn.setStyle(IDLE_BUTTON_STYLE);
        }
        @FXML
        void start_btn_Exited(MouseEvent event) {
            Start_btn.setStyle(IDLE_BUTTON_STYLE);
        }
        @FXML
        void start_btn_entered(MouseEvent event) {
            Start_btn.setStyle(HOVERED_BUTTON_STYLE);
        }
        @FXML
         void Start_btn_clicked(MouseEvent event) throws Exception
        {
            new startgameClass();
            startgameClass.mediaPlayer.play();
            Main.mediaPlayer.stop();
            Main.start_stage.hide();
        }
        @FXML
        void instructions_btn_clicked(MouseEvent event) throws Exception
        {
        new InstructionsClass();
        Main.start_stage.hide();
       }
        @FXML
        void score_btn_clicked(MouseEvent event) throws Exception {
        new ScoreClass();
         Main.start_stage.hide();
        }
        @FXML
        void exit_btn_click(MouseEvent event) {
Main.start_stage.close();
        }
}
