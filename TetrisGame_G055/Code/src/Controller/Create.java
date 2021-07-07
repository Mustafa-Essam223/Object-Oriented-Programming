package Controller;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Create extends Shapes
{
    static int  size=Shapes.getSize();
    static int Move=Shapes.getMove();
    static int x= Shapes.getX();
    static int y= Shapes.getY();

    private static Rectangle a, b, c, d;
    private static String name;
    private Color color;
    private static int LinesNo=0;
    private static int Score=0;
    private static int Level=1;
    public int form=1 ;

    public static int [][]GameArea=new int[Shapes.getX() /Shapes.getSize()][Shapes.getY()/Shapes.getSize()];

    public static void setScore(int score){Create.Score=score;}
    public static void setLinesNo(int linesNo){Create.LinesNo=linesNo;}
    public static void setLevel(int level){Create.Level=Level;}
    public static int getScore(){return Create.Score;}
    public static int getLinesNo(){return Create.LinesNo;}
    public static int getLevel(){return Create.Level;}


    public static void setA(Rectangle a) {
        Create.a = a;
    }
    public static void setB(Rectangle b) {
        Create.b = b;
    }
    public static void setC(Rectangle c) {
        Create.c = c;
    }
    public static void setD(Rectangle d) {
        Create.d = d;
    }
    public Rectangle getA() {
        return a;
    }
    public Rectangle getB() {
        return b;
    }
    public Rectangle getC() {
        return c;
    }
    public Rectangle getD() {
        return d;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
    public static void setName(String name) {
        Create.name = name;
    }
    public String getName() {
        return name;
    }
    public int[][] getGameArea() {
        return GameArea;
    }
    public Create(Rectangle a, Rectangle b, Rectangle c, Rectangle d, String name)
    {
        String nam = getName();
        Create.a = a;
        Create.b = b;
        Create.c = c;
        Create.d = d;
        if (nam.equals("T_block")) {
            color = Color.INDIANRED;
        } else if (nam.equals("Z_block")) {
            color = Color.CADETBLUE;
        } else if (nam.equals("L_block")) {
            color = Color.DARKGOLDENROD;
        } else if (nam.equals("J_block")) {
            color = Color.HOTPINK;
        } else if (nam.equals("S_block")) {
            color = Color.FORESTGREEN;
        } else if (nam.equals("O_block")) {
            color = Color.SANDYBROWN;
        } else {
            color = Color.SLATEGRAY;
        }
        Create.a.setFill(color);
        Create.b.setFill(color);
        Create.c.setFill(color);
        Create.d.setFill(color);
    }
    public Create(String nam) {
        if (nam.equals("T_block")) {
            create_T();
            color = Color.INDIANRED;
        } else if (nam.equals("Z_block")) {
            create_Z();
            color = Color.CADETBLUE;
        } else if (nam.equals("L_block")) {
            create_L();
            color = Color.DARKGOLDENROD;
        } else if (nam.equals("J_block")) {
            create_J();
            color = Color.HOTPINK;
        } else if (nam.equals("S_block")) {
            create_S();
            color = Color.FORESTGREEN;
        } else if (nam.equals("O_block")) {
            create_O();
            color = Color.SANDYBROWN;
        } else {
            create_I();
            color = Color.SLATEGRAY;
        }
        Create.a.setFill(color);
        Create.b.setFill(color);
        Create.c.setFill(color);
        Create.d.setFill(color);

    }

    public void create_O() {
        a.setX(x / 2 - size);
        a.setY(0);
        b.setX(x / 2);
        b.setY(0);
        c.setX(x / 2 - size);
        c.setY(size);
        d.setX(x / 2);
        d.setY(size);
        setName("O_block");
    }

    public void create_S() {
        a.setX(x / 2 + size);
        a.setY(0);
        b.setX(x / 2);
        b.setY(0);
        c.setX(x / 2);
        c.setY(size);
        d.setX(x / 2 - size);
        d.setY(size);
        setName("S_block");
    }
    public void create_Z() {
        a.setX(x / 2 + size);
        a.setY(0);
        b.setX(x / 2);
        b.setY(0);
        c.setX(x / 2 + size);
        c.setY(size);
        d.setX(x / 2 + size + size);
        d.setY(size);
        setName("Z_block");
    }
    public void create_J() {
        a.setX(x / 2 - size);
        a.setY(0);
        b.setX(x / 2 - size);
        b.setY(size);
        c.setX(x / 2);
        c.setY(size);
        d.setX(x / 2 + size);
        d.setY(size);
        setName("J_block");
    }
    public void create_L() {
        a.setX(x / 2 + size);
        a.setY(0);
        b.setX(x / 2 - size);
        b.setY(size);
        c.setX(x / 2);
        c.setY(size);
        d.setX(x / 2 + size);
        d.setY(size);
        setName("L_block");
    }
    public void create_I()
    {
        a.setX(x / 2 - (size * 2));
        a.setY(0);
        b.setX(x / 2 - size);
        b.setY(0);
        c.setX(x / 2);
        c.setY(0);
        d.setX(x / 2 + size);
        d.setY(0);
        setName("I_block");
    }
    public void create_T()
    {
        a.setX(x / 2 - size);
        a.setY(0);
        b.setX(x / 2);
        b.setY(0);
        c.setX(x / 2);
        c.setY(size);
        d.setX(x / 2 + size);
        d.setY(0);
        setName("T_block");
    }
    public static Create blocks()
    {
        a = new Rectangle(size - 1, size - 1);
        b = new Rectangle(size - 1, size - 1);
        c = new Rectangle(size - 1, size - 1);
        d = new Rectangle(size - 1, size - 1);
        int RandomNum = (int) (Math.random() * 120);
        String name = " ";
        if (RandomNum < 15) {
            a.setX(x / 2 - size);
            a.setY(0);
            b.setX(x / 2);
            b.setY(0);
            c.setX(x / 2 - size);
            c.setY(size);
            d.setX(x / 2);
            d.setY(size);
            setName("O_block");
        } else if (RandomNum > 15 && RandomNum < 45) {
            a.setX(x / 2 + size);
            a.setY(0);
            b.setX(x / 2);
            b.setY(0);
            c.setX(x / 2);
            c.setY(size);
            d.setX(x / 2 - size);
            d.setY(size);
            setName("S_block");
        } else if (RandomNum > 45 && RandomNum < 60) {
            a.setX(x / 2 + size);
            a.setY(0);
            b.setX(x / 2);
            b.setY(0);
            c.setX(x / 2 + size);
            c.setY(size);
            d.setX(x / 2 + size + size);
            d.setY(size);
            setName("Z_block");
        } else if (RandomNum > 60 && RandomNum < 75) {
            a.setX(x / 2 - size);
            a.setY(0);
            b.setX(x / 2 - size);
            b.setY(size);
            c.setX(x / 2);
            c.setY(size);
            d.setX(x / 2 + size);
            d.setY(size);
            setName("J_block");
        } else if (RandomNum > 75 && RandomNum < 90) {
            a.setX(x / 2 + size);
            a.setY(0);
            b.setX(x / 2 - size);
            b.setY(size);
            c.setX(x / 2);
            c.setY(size);
            d.setX(x / 2 + size);
            d.setY(size);
            setName("L_block");
        } else if (RandomNum > 90 && RandomNum < 105)
        {
            a.setX(x / 2 - (size * 2));
            a.setY(0);
            b.setX(x / 2 - size);
            b.setY(0);
            c.setX(x / 2);
            c.setY(0);
            d.setX(x / 2 + size);
            d.setY(0);
            setName("I_block");
        } else {
            a.setX(x / 2 - size);
            a.setY(0);
            b.setX(x / 2);
            b.setY(0);
            c.setX(x / 2);
            c.setY(size);
            d.setX(x / 2 + size);
            d.setY(0);
            setName("T_block");
        }
        return new Create(a, b, c, d, name);
    }
    public  void MoveRight() {
        if (a.getX() + Move < x && b.getX() + Move < x && c.getX() + Move < x && d.getX() + Move < x && a.getY() < y - Move && b.getY() < y - Move && c.getY() < y - Move && d.getY() < y - Move) {
            if (GameArea[(int) ((a.getX() / size) + 1)][(int) a.getY() / size] == 0 &&
                    GameArea[(int) ((b.getX() / size) + 1)][(int) b.getY() / size] == 0 &&
                    GameArea[(int) ((c.getX() / size) + 1)][(int) c.getY() / size] == 0 &&
                    GameArea[(int) ((d.getX() / size) + 1)][(int) d.getY() / size] == 0) {
                a.setX(a.getX() + Move);
                b.setX(b.getX() + Move);
                c.setX(c.getX() + Move);
                d.setX(d.getX() + Move);
            }
        }
    }
    public  void MoveLeft() {
        if (a.getX() > 0 && b.getX() > 0 && c.getX() > 0 && d.getX() > 0 && a.getY() < y - Move && b.getY() < y - Move && c.getY() < y - Move && d.getY() < y - Move) {
            if (GameArea[(int) ((a.getX() / size) - 1)][(int) a.getY() / size] == 0 &&
                    GameArea[(int) ((b.getX() / size) - 1)][(int) b.getY() / size] == 0 &&
                    GameArea[(int) ((c.getX() / size) - 1)][(int) c.getY() / size] == 0 &&
                    GameArea[(int) ((d.getX() / size) - 1)][(int) d.getY() / size] == 0) {
                a.setX(a.getX() - Move);
                b.setX(b.getX() - Move);
                c.setX(c.getX() - Move);
                d.setX(d.getX() - Move);
            }
        }
    }
    public  void MoveDown2() {
        if (a.getY() < y - size && b.getY() < y - size && c.getY() < y - size && d.getY() < y - size) {
            {
                a.setY(a.getY() + Move);
                b.setY(b.getY() + Move);
                c.setY(c.getY() + Move);
                d.setY(d.getY() + Move);
            }
            if (collide())
            {
                a.setY(a.getY() - Move);
                b.setY(b.getY() - Move);
                c.setY(c.getY() - Move);
                d.setY(d.getY() - Move);
            }
        }}
    public void MoveDown()
    {
        if (a.getY() < y - size && b.getY() < y - size && c.getY() < y - size && d.getY() < y - size) {
            {
                a.setY(a.getY() + Move);
                b.setY(b.getY() + Move);
                c.setY(c.getY() + Move);
                d.setY(d.getY() + Move);
            }
            if (collide()) {
                GameArea[(int) a.getX() / size][(int) a.getY() / size] = 1;
                GameArea[(int) b.getX() / size][(int) b.getY() / size] = 1;
                GameArea[(int) c.getX() / size][(int) c.getY() / size] = 1;
                GameArea[(int) d.getX() / size][(int) d.getY() / size] = 1;
            }
        }
    }
    public static boolean collide()
    {
        return a.getY() == y - size || b.getY() == y - size || c.getY() == y - size || d.getY() == y - size ||
                GameArea[(int) a.getX() / size][(int) (a.getY() / size) + 1] == 1 ||
                GameArea[(int) b.getX() / size][(int) (b.getY() / size) + 1] == 1 ||
                GameArea[(int) c.getX() / size][(int) (c.getY() / size) + 1] == 1 ||
                GameArea[(int) d.getX() / size][((int) d.getY() / size) + 1] == 1;
    }

    private void ChangeForm() {
        if (form!=4)
            form++;
        else
            form=1 ;
    }

    public void Rotation(Create current_block) {
        int current = form;
        switch (current_block.getName()) {
            case "J_block":
                if (current == 1 && CanRotate(a, 1, -1) && CanRotate(c, -1, -1) && CanRotate(d, -2, -2)) {
                    Rotate_RightA();
                    Rotate_DownA();
                    Rotate_DownC();
                    Rotate_LeftC();
                    Rotate_DownD();
                    Rotate_DownD();
                    Rotate_LeftD();
                    Rotate_LeftD();
                    this.ChangeForm();
                    break;
                }
                if (current == 2 && CanRotate(a, -1, -1) && CanRotate(c, -1, 1) && CanRotate(d, -2, 2)) {

                    Rotate_DownA();
                    Rotate_LeftA();
                    Rotate_LeftC();
                    Rotate_UPC();
                    Rotate_LeftD();
                    Rotate_LeftD();
                    Rotate_UPD();
                    Rotate_UPD();
                    this.ChangeForm();
                    break;
                }
                if (current == 3 && CanRotate(a, -1, 1) && CanRotate(c, 1, 1) && CanRotate(d, 2, 2)) {
                    Rotate_LeftA();
                    Rotate_UPA();
                    Rotate_UPC();
                    Rotate_RightC();
                    Rotate_UPD();
                    Rotate_UPD();
                    Rotate_RightD();
                    Rotate_RightD();
                    this.ChangeForm();
                    break;
                }
                if (current == 4 && CanRotate(a, 1, 1) && CanRotate(c, 1, -1) && CanRotate(d, 2, -2)) {
                    Rotate_UPA();
                    Rotate_RightA();
                    Rotate_RightC();
                    Rotate_DownC();
                    Rotate_RightD();
                    Rotate_RightD();
                    Rotate_DownD();
                    Rotate_DownD();
                    this.ChangeForm();
                    break;
                }
                break;
            case "L_block":
                if (current == 1 && CanRotate(a, 1, -1) && CanRotate(c, 1, 1) && CanRotate(b, 2, 2)) {

                    Rotate_RightA();
                    Rotate_DownA();
                    Rotate_UPC();
                    Rotate_RightC();
                    Rotate_UPB();
                    Rotate_UPB();
                    Rotate_RightB();
                    Rotate_RightB();
                    this.ChangeForm();
                    break;
                }
                if (current == 2 && CanRotate(a, -1, -1) && CanRotate(b, 2, -2) && CanRotate(c, 1, -1)) {
                    Rotate_DownA();
                    Rotate_LeftA();
                    Rotate_RightB();
                    Rotate_RightB();
                    Rotate_DownB();
                    Rotate_DownB();
                    Rotate_RightC();
                    Rotate_DownC();
                    this.ChangeForm();
                    break;
                }
                if (current == 3 && CanRotate(a, -1, 1) && CanRotate(c, -1, -1) && CanRotate(b, -2, -2)) {
                    Rotate_LeftA();
                    Rotate_UPA();
                    Rotate_DownC();
                    Rotate_LeftC();
                    Rotate_DownB();
                    Rotate_DownB();
                    Rotate_LeftB();
                    Rotate_LeftB();
                    this.ChangeForm();
                    break;
                }
                if (current == 4 && CanRotate(a, 1, 1) && CanRotate(b, -2, 2) && CanRotate(c, -1, 1)) {
                    Rotate_UPA();
                    Rotate_RightA();
                    Rotate_LeftB();
                    Rotate_LeftB();
                    Rotate_UPB();
                    Rotate_UPB();
                    Rotate_LeftC();
                    Rotate_UPC();
                    this.ChangeForm();
                    break;
                }
                break;
            case "O_block":
                break;
            case "S_block":
                if (current == 1 && CanRotate(a, -1, -1) && CanRotate(c, -1, 1) && CanRotate(d, 0, 2)) {
                    Rotate_DownA();
                    Rotate_LeftA();
                    Rotate_LeftC();
                    Rotate_UPC();
                    Rotate_UPD();
                    Rotate_UPD();
                    this.ChangeForm();
                    break;
                }
                if (current == 2 && CanRotate(a, 1, 1) && CanRotate(c, 1, -1) && CanRotate(d, 0, -2)) {
                    Rotate_UPA();
                    Rotate_RightA();
                    Rotate_RightC();
                    Rotate_DownC();
                    Rotate_DownD();
                    Rotate_DownD();
                    this.ChangeForm();
                    break;
                }
                if (current == 3 && CanRotate(a, -1, -1) && CanRotate(c, -1, 1) && CanRotate(d, 0, 2)) {
                    Rotate_DownA();
                    Rotate_LeftA();
                    Rotate_LeftC();
                    Rotate_UPC();
                    Rotate_UPD();
                    Rotate_UPD();
                    this.ChangeForm();
                    break;
                }
                if (current == 4 && CanRotate(a, 1, 1) && CanRotate(c, 1, -1) && CanRotate(d, 0, -2)) {
                    Rotate_UPA();
                    Rotate_RightA();
                    Rotate_RightC();
                    Rotate_DownC();
                    Rotate_DownD();
                    Rotate_DownD();
                    this.ChangeForm();
                    break;
                }
                break;
            case "Z_block":
                if (current == 1 && CanRotate(b, 1, 1) && CanRotate(c, -1, 1) && CanRotate(d, -2, 0)) {

                    Rotate_UPB();
                    Rotate_RightB();
                    Rotate_LeftC();
                    Rotate_UPC();
                    Rotate_LeftD();
                    Rotate_LeftD();
                    this.ChangeForm();
                    break;
                }
                if (current == 2 && CanRotate(b, -1, -1) && CanRotate(c, 1, -1) && CanRotate(d, 2, 0)) {
                    Rotate_DownB();
                    Rotate_LeftB();
                    Rotate_RightC();
                    Rotate_DownC();
                    Rotate_RightD();
                    Rotate_RightD();
                    this.ChangeForm();
                    break;
                }
                if (current == 3 && CanRotate(b, 1, 1) && CanRotate(c, -1, 1) && CanRotate(d, -2, 0)) {
                    Rotate_UPB();
                    Rotate_RightB();
                    Rotate_LeftC();
                    Rotate_UPC();
                    Rotate_LeftD();
                    Rotate_LeftD();
                    this.ChangeForm();
                    break;
                }
                if (current == 4 && CanRotate(b, -1, -1) && CanRotate(c, 1, -1) && CanRotate(d, 2, 0)) {
                    Rotate_DownB();
                    Rotate_LeftB();
                    Rotate_RightC();
                    Rotate_DownC();
                    Rotate_RightD();
                    Rotate_RightD();
                    this.ChangeForm();
                    break;
                }
                break;
            case "I_block":
                if (current == 1 && CanRotate(a, 2, 2) && CanRotate(b, 1, 1) && CanRotate(d, -1, -1)) {

                    Rotate_UPA();
                    Rotate_UPA();
                    Rotate_RightA();
                    Rotate_RightA();
                    Rotate_UPB();
                    Rotate_RightB();
                    Rotate_DownD();
                    Rotate_LeftD();
                    this.ChangeForm();
                    break;
                }
                if (current == 2 && CanRotate(a, -2, -2) && CanRotate(b, -1, -1) && CanRotate(d, 1, 1)) {
                    Rotate_DownA();
                    Rotate_DownA();
                    Rotate_LeftA();
                    Rotate_LeftA();
                    Rotate_DownB();
                    Rotate_LeftB();
                    Rotate_UPD();
                    Rotate_RightD();
                    this.ChangeForm();
                    break;
                }
                if (current == 3 && CanRotate(a, 2, 2) && CanRotate(b, 1, 1) && CanRotate(d, -1, -1)) {
                    Rotate_UPA();
                    Rotate_UPA();
                    Rotate_RightA();
                    Rotate_RightA();
                    Rotate_UPB();
                    Rotate_RightB();
                    Rotate_DownD();
                    Rotate_LeftD();
                    this.ChangeForm();
                    break;
                }
                if (current == 4 && CanRotate(a, -2, -2) && CanRotate(b, -1, -1) && CanRotate(d, 1, 1)) {
                    Rotate_DownA();
                    Rotate_DownA();
                    Rotate_LeftA();
                    Rotate_LeftA();
                    Rotate_DownB();
                    Rotate_LeftB();
                    Rotate_UPD();
                    Rotate_RightD();
                    this.ChangeForm();
                    break;
                }
                break;
            case "T_block":
                if (current == 1 && CanRotate(a, 1, 1) && CanRotate(d, -1, -1) && CanRotate(c, -1, 1)) {

                    Rotate_UPA();
                    Rotate_RightA();
                    Rotate_DownD();
                    Rotate_LeftD();
                    Rotate_LeftC();
                    Rotate_UPC();
                    this.ChangeForm();
                    break;
                }
                if (current == 2 && CanRotate(a, 1, -1) && CanRotate(d, -1, 1) && CanRotate(c, 1, 1)) {
                    Rotate_RightA();
                    Rotate_DownA();
                    Rotate_LeftD();
                    Rotate_UPD();
                    Rotate_UPC();
                    Rotate_RightC();
                    this.ChangeForm();
                    break;
                }
                if (current == 3 && CanRotate(a, -1, -1) && CanRotate(d, 1, 1) && CanRotate(c, 1, -1)) {
                    Rotate_DownA();
                    Rotate_LeftA();
                    Rotate_UPD();
                    Rotate_RightD();
                    Rotate_RightC();
                    Rotate_DownC();
                    this.ChangeForm();
                    break;
                }
                if (current == 4 && CanRotate(a, -1, 1) && CanRotate(d, 1, -1) && CanRotate(c, -1, -1)) {
                    Rotate_LeftA();
                    Rotate_UPA();
                    Rotate_RightD();
                    Rotate_DownD();
                    Rotate_DownC();
                    Rotate_LeftC();
                    this.ChangeForm();
                    break;
                }
        }


    }
    // Rotation Assets
    private boolean CanRotate(Rectangle rect, int x, int y) {
        boolean xB = false;
        boolean yB = false;
        if (x >= 0) xB|= rect.getX() + x * Move <= getX() -Create.size;
        if (x < 0) xB|= rect.getX() + x * Move >= 0;
        if (y >= 0) yB|= rect.getY() - y * Move > 0;
        if (y < 0) yB|= rect.getY() + y * getMove() < getY();
        return xB && yB && GameArea[(int) (rect.getX() / size) + x][((int) rect.getY() /Create.size) - y] == 0;


    }
    private void Rotate_RightA() {
        if (a.getX() + Move <= x - size)
            a.setX(a.getX() + Move);
    }
    private void Rotate_RightB() {
        if (b.getX() + Move <= x - size)
            b.setX(b.getX() + Move);
    }
    private void Rotate_RightC() {
        if (c.getX() + Move <= x - size)
            c.setX(c.getX() + Move);
    }
    private void Rotate_RightD() {
        if (d.getX() + Move <= x - size)
            d.setX(d.getX() + Move);
    }
    private void Rotate_LeftA() {
        if (a.getX() - Move >= 0)
            a.setX(a.getX() - Move);
    }
    private void Rotate_LeftB() {
        if (b.getX() - Move >= 0)
            b.setX(b.getX() - Move);
    }
    private void Rotate_LeftC() {
        if (c.getX() - Move >= 0)
            c.setX(c.getX() - Move);
    }
    private void Rotate_LeftD() {
        if (d.getX() - Move >= 0)
            d.setX(d.getX() - Move);
    }



    private void Rotate_UPA() {
        if (a.getY() - Move > 0)
            a.setY(a.getY() - Move);
    }
    private void Rotate_UPB() {
        if (b.getY() - Move > 0)
            b.setY(b.getY() - Move);
    }
    private void Rotate_UPC() {
        if (c.getY() - Move > 0)
            c.setY(c.getY() - Move);
    }
    private void Rotate_UPD() {
        if (d.getY() - Move > 0)
            d.setY(d.getY() - Move);
    }

    private void Rotate_DownA() {
        if (a.getY() + Move < y)
            a.setY(a.getY() + Move);
    }
    private void Rotate_DownB() {
        if (b.getY() + Move < y)
            b.setY(b.getY() + Move);
    }
    private void Rotate_DownC() {
        if (c.getY() + Move < y)
            c.setY(c.getY() + Move);
    }
    private void Rotate_DownD() {
        if (d.getY() + Move < y)
            d.setY(d.getY() + Move);
    }
}
