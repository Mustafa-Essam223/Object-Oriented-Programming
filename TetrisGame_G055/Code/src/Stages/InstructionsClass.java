package Stages;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class InstructionsClass
{
    private static Stage instruction_stage;
    public static Stage getInstruction_stage()
    {
        return instruction_stage;
    }
    public InstructionsClass() throws Exception
    {
        instruction_stage=new Stage();
        Image image = new Image(getClass().getResourceAsStream("../Images/Icon.png"));
        instruction_stage.getIcons().add(image);
        Parent instruction = FXMLLoader.load(getClass().getResource("../Resources/Instrutions_&_controls.fxml"));
        instruction_stage.setResizable(false);
        instruction_stage.setResizable(false);
        instruction_stage.setTitle("Tetris Game");
        instruction_stage.setScene(new Scene(instruction));
        instruction_stage.show();

    }
}
