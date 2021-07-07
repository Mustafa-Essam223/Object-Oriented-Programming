package Stages;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.nio.file.Paths;

public class startgameClass
{
    private static   Stage start_game_stage;
    public static MediaPlayer mediaPlayer;

    public static Stage getStart_game_stage()
    {
        return start_game_stage;
    }

    public startgameClass() throws Exception
    {
        start_game_stage = new Stage();
        Image image = new Image(getClass().getResourceAsStream("../Images/Icon.png"));
        start_game_stage.getIcons().add(image);
        Parent start_game = FXMLLoader.load(getClass().getResource("../Resources/startgame.fxml"));
        start_game_stage.setResizable(false);
        start_game_stage.setTitle("Tetris Game");
         Scene x= new Scene(start_game);
        start_game_stage.setScene(x);
        start_game_stage.show();
        String s="src/music/main.mp3";
        Media media1=new Media(Paths.get(s).toUri().toString());
        mediaPlayer = new MediaPlayer(media1);
        mediaPlayer.play();
        mediaPlayer.setVolume(1.0);
    }
}
