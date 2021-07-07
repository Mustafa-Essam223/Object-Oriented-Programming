package Stages;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Score_gameClass
{
    private static Stage score_game_stage;
    public static Stage getScore_game_stage()
    {
        return score_game_stage;
    }
    public Score_gameClass() throws Exception
    {
        score_game_stage=new Stage();
        score_game_stage.setResizable(false);
        Image image = new Image(getClass().getResourceAsStream("../Images/Icon.png"));
        score_game_stage.getIcons().add(image);
        Parent Score = FXMLLoader.load(getClass().getResource("../Resources/score_game.fxml"));
        score_game_stage.setTitle("Tetris Game");
        score_game_stage.setScene(new Scene(Score));
        score_game_stage.show();

    }
}
