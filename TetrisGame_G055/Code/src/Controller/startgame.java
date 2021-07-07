package Controller;
import Stages.Main;
import Stages.startgameClass;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;

import java.io.*;
import java.net.URL;
import java.util.*;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class startgame implements Initializable
{
    Next_shape shape;
    Create Nextobject;
    Create object;
    Scanner scanner;
    public String y;
    //public int size=110;
    final String IDLE_BUTTON_STYLE = "-fx-background-color:#ff3960 ;-fx-font-family: Forte; -fx-font-size:30;";
    final String HOVERED_BUTTON_STYLE = "-fx-background-color:#ff646c ; -fx-font-family: Forte; -fx-font-size:24;";

    @FXML
    private Pane shape_layout;
    @FXML
    private Pane group;
    @FXML
    private Pane layout;
    @FXML
    private Button Exit_btn;
    @FXML
    private Button quit_btn;
    @FXML
    private Text score_txt;
    public void setScore_txt(String score) {
        score_txt.setText("Score : " + score);
    }
    public Text getScore_txt() {
        return score_txt;
    }
    @FXML
    private Text Next_txt;
    @FXML
    private Text level_txt;
    public void setLevel_txt(String level) {
        level_txt.setText("Level :  " + level);
    }
    public Text getLevel_txt() {
        return level_txt;
    }
    @FXML
    private Text line_txt;
    public void setLine_txt(String line) {
        line_txt.setText("Line :  " + line);
    }
    public Text getLine_txt() {
        return line_txt;
    }
    @FXML
    void quit_btn_exited(MouseEvent event) {
        quit_btn.setStyle(IDLE_BUTTON_STYLE);
    }
    @FXML
    void Exit_on_action(ActionEvent event) {
        startgameClass.getStart_game_stage().close();
    }
    @FXML
    void Quit_on_action(ActionEvent event) {
        New_game();
        startgameClass.mediaPlayer.stop();
        Main.mediaPlayer.play();
        Main.start_stage.show();
        startgameClass.getStart_game_stage().close();
    }
    @FXML
    void exit_btn_entered(MouseEvent event) {
        Exit_btn.setStyle(HOVERED_BUTTON_STYLE);
    }
    @FXML
    void exit_btn_exited(MouseEvent event) {
        Exit_btn.setStyle(IDLE_BUTTON_STYLE);

    }
    public void New_game() {
        Create.setScore(0);
        Create.setLinesNo(0);
        Create.setLevel(0);
        for (int i = 0; i < (Create.getX() / Create.getSize()); i++) {
            for (int j = 0; j < (Create.getY() /  Create.getSize()); j++) {
                if( Create.GameArea[i][j] ==1)
                {
                    Create.GameArea[i][j] =0;
                }
            }
        }
    }
    @FXML
    void quit_btn_entered(MouseEvent event)
    {
        quit_btn.setStyle(HOVERED_BUTTON_STYLE);
    }
    public String next_block() {
        Nextobject= Create.blocks();
        return Nextobject.getName();
    }
    @FXML
    void key_pressed(KeyEvent event) {
        switch (event.getCode()) {
            case DOWN: {
                object.MoveDown2();
                break;
            }
            case LEFT: {
                object.MoveLeft();
                break;
            }
            case RIGHT: {
                object.MoveRight();
                break;
            }
            case UP:
            {
                Nextobject.Rotation(Nextobject);
                break;
            }
        }
    }
    public void Game_Over() throws IOException {
        BufferedWriter out = null;
        int i=0;
        int length=0;
        int Counter =0;
        File file=new File("C:\\Users\\abeer\\Desktop\\TetrisGame_G055\\TetrisGame_WithScore\\High_Score.txt");
        if(file.length()!=0)
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
        if (file.length() != 0) {
            try {
                scanner = new Scanner(new File("C:\\Users\\abeer\\Desktop\\TetrisGame_G055\\TetrisGame_WithScore\\High_Score.txt"));
                while (scanner.hasNext())
                {
                    y = scanner.nextLine();
                    arr[length]=Integer.parseInt(y);
                    length++;
                }
            } catch (FileNotFoundException ex) {
                System.err.println(ex);
            }
        }
        for (int h=0;h<i;h++)
        {
            if (Create.getScore()==arr[h])
            {
                Counter++;
            }
        }
        if(Counter==0) {
            //
            try {
                FileWriter fstream = new FileWriter("High_Score.txt", true); //true tells to append data.
                out = new BufferedWriter(fstream);
                String x = String.valueOf(Create.getScore());
                out.write(x + "\n");


            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            } finally {
                if (out != null) {
                    out.close();
                }
            }
        }    Text GmOver = new Text("G A M E  O V E R");
        GmOver.setFill(Color.AQUAMARINE);
        GmOver.setStyle("-fx-font: 70 Forte ;");
        GmOver.setX(17);
        GmOver.setY(250);
        layout.getChildren().add(GmOver);
        quit_btn.setDisable(false);

    }

    public void Action()
    {
        quit_btn.setDisable(true);
        setScore_txt(String.valueOf(Create.getScore()));
        layout.getChildren().add(getScore_txt());
        setLine_txt(String.valueOf(Create.getLinesNo()));
        layout.getChildren().add(getLine_txt());
        setLevel_txt(String.valueOf(Create.getLevel()));
        layout.getChildren().add(getLevel_txt());
        shape=Next_shape.blocks();
        String nam = shape.getName();
        shape_layout.getChildren().addAll(shape.getA(),shape.getB(),shape.getC(),shape.getD());
        String name=next_block();
        object = new Create(name);
        layout.getChildren().addAll(object.getA(), object.getB(), object.getC(), object.getD());
        down_timer(nam);
    }
    public void recursion_of_blocks(int size, int x, int y, int[][] gamearea, String name) throws IOException
    {
        gamearea = object.getGameArea();
        int third_line_counter = 0;
        int second_line_counter = 0;
        int counter = 0;
        String nam = next_block();
        shape_layout.getChildren().clear();
        shape=new Next_shape(nam);
        shape_layout.getChildren().addAll(shape.getA(), shape.getB(), shape.getC(), shape.getD());

        if (nam.equals("O_block") || nam.equals("Z_block") || nam.equals("L_block") || nam.equals("J_block") || nam.equals("T_block") || nam.equals("S_block")) {
            for (int q = 0; q < x / size; q++)
            {
                for (int w = 0; w < 2; w++)
                    if (gamearea[q][w] == 0)
                    {
                        counter++;
                    }
            }
            if (counter == ((x / size) * 2)) {
                for (int i = ((x / 2 - (size * 2)) / size); i < ((x / 2 + (size * 2)) / size); i++) {
                    if (gamearea[i][2] == 0) {
                        third_line_counter++;
                    }
                }
                if (third_line_counter == 4)
                {
                    Create next_object2 = new Create(name);
                    layout.getChildren().addAll(next_object2.getA(), next_object2.getB(), next_object2.getC(), next_object2.getD());
                    down_timer( nam);
                } else {
                    Create next_object2 = new Create(name);
                    layout.getChildren().addAll(next_object2.getA(), next_object2.getB(), next_object2.getC(), next_object2.getD());
                    Game_Over();
                }
            } else {
                Create next_object2 = new Create(name);
                layout.getChildren().addAll(next_object2.getA(), next_object2.getB(), next_object2.getC(), next_object2.getD());
                Game_Over();
            }
        } else{
            for (int q = 0; q < x / size; q++)
            {
                for (int w = 0; w < 1; w++)
                    if (gamearea[q][w] == 0) {
                        counter++;
                    }
            }
            if (counter == ((x / size))) {
                for (int i = ((x / 2 - (size * 2)) / size); i < ((x / 2 + (size * 2)) / size); i++) {
                    if (gamearea[i][1] == 0) {
                        second_line_counter++;
                    }
                }
                System.out.println(second_line_counter);
                if (second_line_counter == 4)
                {
                    Create next_object2 = new Create(name);
                    layout.getChildren().addAll(next_object2.getA(), next_object2.getB(), next_object2.getC(), next_object2.getD());
                    down_timer(nam);

                } else {
                    Create next_object2 = new Create(name);
                     layout.getChildren().addAll(next_object2.getA(), next_object2.getB(), next_object2.getC(), next_object2.getD());
                    Game_Over();
                }
            } else {
                Create next_object2 = new Create(name);
                layout.getChildren().addAll(next_object2.getA(), next_object2.getB(), next_object2.getC(), next_object2.getD());
                Game_Over();
                System.out.println("Game over");
            }
        }
    }
    public void down_timer(String name)
    {

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() ->
                {
                    object.MoveDown();
                    if (Create.collide()) {
                        Create.setScore(Create.getScore()+ 10) ;
                        setScore_txt(String.valueOf(Create.getScore()));
                        clearFullLines();
                        try {
                            recursion_of_blocks(Create.getSize(),Create.getX(), Create.getY(),Create.GameArea, name);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        timer.cancel();
                    }
                });
            }
        }, 0, 500);
    }
    public void clearFullLines()
    {
        List<Integer> lines = new ArrayList();
        List<Node> rectangles = new ArrayList();
        List<Node> new_rectangles = new ArrayList();
        int count = 0;
        for (int i = Create.GameArea[0].length - 1; i >= 0; i--) {
            for (int j = 0; j < Create.GameArea.length; j++) {
                if (Create.GameArea[j][i] == 1) {
                    count++;
                }
            }
            if (count == 12) {
                lines.add(0, i);
                System.out.println("Full Line " + i);
            }
            count = 0;
        }
        if (lines.size() > 0)
            do {
                for (Node node : layout.getChildren()) {
                    if (node instanceof Rectangle)
                        rectangles.add(node);
                }
                Create.setScore(Create.getScore()+100);
                setScore_txt(String.valueOf(Create.getScore()));
                Create.setLinesNo(Create.getLinesNo()+1);
                setLine_txt(String.valueOf(Create.getLinesNo()));
                for (Node node : rectangles) {
                    Rectangle a = (Rectangle) node;
                    if (a.getY() == lines.get(0) * Create.getSize()) {
                        Create.GameArea[(int) a.getX() / Create.getSize()][(int) a.getY() / Create.getSize()] = 0;
                        layout.getChildren().remove(node);
                    } else
                        new_rectangles.add(node);
                }
                for (Node node : new_rectangles) {
                    Rectangle a = (Rectangle) node;
                    if (a.getY() < lines.get(0) * Create.getSize())
                    {
                        Create.GameArea[(int) a.getX() / Create.getSize()][(int) a.getY() / Create.getSize()] = 0;
                        a.setY(a.getY() + Create.getSize());
                    }
                }
                lines.remove(0);
                rectangles.clear();
                new_rectangles.clear();
                for (Node node : layout.getChildren()) {
                    if (node instanceof Rectangle)
                        rectangles.add(node);
                }
                for (Node node : rectangles) {
                    Rectangle a = (Rectangle) node;
                    try {
                        Create.GameArea[(int) a.getX() / Create.getSize()][(int) a.getY() / Create.getSize()] = 1;
                    } catch (ArrayIndexOutOfBoundsException ignored) {
                    }
                }
                rectangles.clear();
            } while (lines.size() > 0);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Action();
    }

}