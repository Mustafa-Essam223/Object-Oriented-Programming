package Stages;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class ScoreClass
{
    private static Stage score_stage;
    public static Stage getScore_stage()
    {
        return score_stage;
    }
    public ScoreClass() throws Exception
    {
        score_stage=new Stage();
        score_stage.setResizable(false);
        Image image = new Image(getClass().getResourceAsStream("../Images/Icon.png"));
        score_stage.getIcons().add(image);
        Parent Score = FXMLLoader.load(getClass().getResource("../Resources/score.fxml"));
        score_stage.setTitle("Tetris Game");
        score_stage.setScene(new Scene(Score));
        score_stage.show();

    }
}
