package Controller;
import Stages.Main;
import Stages.ScoreClass;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.Scanner;

public class score implements Initializable {
    Scanner scanner;
    public String y;
    public int size=110;
    final String IDLE_BUTTON_STYLE = "-fx-background-color:#ff3960 ;-fx-font-family: Forte; -fx-font-size:30;";
    final String HOVERED_BUTTON_STYLE = "-fx-background-color:#ff646c ; -fx-font-family: Forte; -fx-font-size:24;";
    @FXML
    private Pane layout;

    @FXML
    private Button backbuttton;

    @FXML
    void backclick(MouseEvent event) {
        ScoreClass.getScore_stage().close();
        Main.start_stage.show();
    }

    @FXML
    void backentered(MouseEvent event) {
        backbuttton.setStyle(HOVERED_BUTTON_STYLE);
    }

    @FXML
    void backexited(MouseEvent event)
    {
        backbuttton.setStyle(IDLE_BUTTON_STYLE);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        /// sort All the scores ascending

        BufferedWriter out = null;
        int i=0;
        int length=0;
        File x=new File("C:\\Users\\abeer\\Desktop\\TetrisGame_G055\\TetrisGame_WithScore\\High_Score.txt");
        if(x.length()!=0)
        {
            try
            {
                scanner = new Scanner(new File("C:\\Users\\abeer\\Desktop\\TetrisGame_G055\\TetrisGame_WithScore\\High_Score.txt"));
                while(scanner.hasNext())
                {
                    y=scanner.nextLine();
                    i++;
                }
            }
            catch (FileNotFoundException ex)
            {
                System.err.println(ex);
            }
        }
        int []arr= new int[i];
        if (x.length() != 0)
        {
            try
            {
                scanner = new Scanner(new File("C:\\Users\\abeer\\Desktop\\TetrisGame_G055\\TetrisGame_WithScore\\High_Score.txt"));
                while (scanner.hasNext())
                {
                    y = scanner.nextLine();
                    arr[length]=Integer.parseInt(y);
                    length++;
                }
            }
            catch (FileNotFoundException ex)
            {
                System.err.println(ex);
            }
        }

        Arrays.sort(arr);

        try
        {
            int number=1;

            scanner = new Scanner(new File("C:\\Users\\abeer\\Desktop\\TetrisGame_G055\\TetrisGame_WithScore\\High_Score.txt"));
            if (i<9||i==9)
            {
                for (int k = i - 1; k >= 0; k--) {
                    String val = String.valueOf(arr[k]);
                    Text txt = new Text();
                    txt.setStyle("-fx-font: 40 forte ");
                    txt.setY(size);
                    txt.setX(20);
                    txt.setFill(Color.WHITE);

                    txt.setText("(" +number+ ")  " + val);
                    size = size + 50;
                    number++;
                    layout.getChildren().add(txt);
                }
            }
            else
            {
                int v=i-9;
                for (int k = i - 1; k >= v; k--)
                {
                    String val = String.valueOf(arr[k]);
                    Text txt = new Text();
                    txt.setStyle("-fx-font: 40 forte ");
                    txt.setY(size);
                    txt.setX(20);
                    txt.setFill(Color.WHITE);

                    txt.setText("(" +number+ ")  " + val);
                    size = size + 50;
                    number++;
                    layout.getChildren().add(txt);
                }
            }
        }

        catch (FileNotFoundException ex)
        {
            System.err.println(ex);
        }

    }
}