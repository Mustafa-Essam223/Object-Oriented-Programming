package Stages;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import java.io.File;
import java.nio.file.Paths;

public class Main extends Application {
    public static Stage start_stage;
    public static MediaPlayer mediaPlayer;
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("../Resources/Main_menu.fxml"));
        Image image = new Image(getClass().getResourceAsStream("../Images/Icon.png"));
        primaryStage.getIcons().add(image);
        primaryStage.setTitle("Tetris Game");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        start_stage=primaryStage;
        String s="src/music/Background_Music.mp3";
        Media media1=new Media(Paths.get(s).toUri().toString());
        mediaPlayer = new MediaPlayer(media1);
         mediaPlayer.play();
         mediaPlayer.setVolume(1.0);

    }
    public static void main(String[] args) {
        launch(args);
    }
}
