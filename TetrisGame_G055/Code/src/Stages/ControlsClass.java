package Stages;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class ControlsClass
{

    private static Stage Controls_stage;
    public static Stage getControls_stage()
    {
        return Controls_stage;
    }
    public ControlsClass() throws Exception
    {
        Controls_stage=new Stage();
        Controls_stage.setResizable(false);
        Image image = new Image(getClass().getResourceAsStream("../Images/Icon.png"));
        Controls_stage.getIcons().add(image);
        Parent Controls = FXMLLoader.load(getClass().getResource("../Resources/controls.fxml"));
        Controls_stage.setTitle("Tetris Game");
        Controls_stage.setScene(new Scene(Controls));
        Controls_stage.show();
    }
}
