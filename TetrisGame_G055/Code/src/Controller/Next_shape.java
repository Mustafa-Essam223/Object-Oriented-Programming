package Controller;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

    public class Next_shape extends Shapes {

    private static Rectangle a, b, c, d;
    private static String name;
    private Color color;
    public static void setA(Rectangle a) {
        Next_shape.a = a;
    }
    public static void setB(Rectangle b) {
        Next_shape.b = b;
    }
    public static void setC(Rectangle c) {
        Next_shape.c = c;
    }
    public static void setD(Rectangle d) {
        Next_shape.d = d;
    }

    //

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
        Next_shape.name = name;
    }
    public String getName() {
        return name;
    }
    public Next_shape(Rectangle a, Rectangle b, Rectangle c, Rectangle d, String name) {
        String nam = getName();
        Next_shape.a = a;
        Next_shape.b = b;
        Next_shape.c = c;
        Next_shape.d = d;
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
        Next_shape.a.setFill(color);
        Next_shape.b.setFill(color);
        Next_shape.c.setFill(color);
        Next_shape.d.setFill(color);
    }
    public Next_shape(String nam)
    {
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
        Next_shape.a.setFill(color);
        Next_shape.b.setFill(color);
        Next_shape.c.setFill(color);
        Next_shape.d.setFill(color);

    }
    public void create_O() {
        a.setX(425);
        a.setY(50);
        b.setX(450);
        b.setY(50);
        c.setX(425);
        c.setY(75);
        d.setX(450);
        d.setY(75);
        setName("O_block");
    }
    public void create_S()
    {
        a.setX(475);
        a.setY(50);
        b.setX(450);
        b.setY(50);
        c.setX(450);
        c.setY(75);
        d.setX(425);
        d.setY(75);
        setName("S_block");
    }
    public void create_Z() {
        a.setX( 475);
        a.setY(50);
        b.setX(450);
        b.setY(50);
        c.setX(475);
        c.setY(75);
        d.setX(500);
        d.setY(75);
        setName("Z_block");
    }
    public void create_J() {
        a.setX(425);
        a.setY(50);
        b.setX(425);
        b.setY(75);
        c.setX(450);
        c.setY(75);
        d.setX(475);
        d.setY(75);
        setName("J_block");
    }
    public void create_L() {
        a.setX(475);
        a.setY(50);
        b.setX(425);
        b.setY(75);
        c.setX(450);
        c.setY(75);
        d.setX(475);
        d.setY(75);
        setName("L_block");
    }
    public void create_I() {
        a.setX(400);
        a.setY(50);
        b.setX(425);
        b.setY(50);
        c.setX(450);
        c.setY(50);
        d.setX(475);
        d.setY(50);
        setName("I_block");
    }
    public void create_T() {
        a.setX(425);
        a.setY(50);
        b.setX(450);
        b.setY(50);
        c.setX(450);
        c.setY(75);
        d.setX(475);
        d.setY(50);
        setName("T_block");
    }
    public static Next_shape blocks() {
        a = new Rectangle(Shapes.getSize() - 1, Shapes.getSize() - 1);
        b = new Rectangle(Shapes.getSize() - 1, Shapes.getSize() - 1);
        c = new Rectangle(Shapes.getSize() - 1, Shapes.getSize() - 1);
        d = new Rectangle(Shapes.getSize() - 1, Shapes.getSize() - 1);
        int RandomNum = (int) (Math.random() * 120);
        String name = " ";
        if (RandomNum < 15) {
            a.setX(425);
            a.setY(50);
            b.setX(450);
            b.setY(50);
            c.setX(425);
            c.setY(75);
            d.setX(450);
            d.setY(75);
            setName("O_block");
        } else if (RandomNum > 15 && RandomNum < 45) {
            a.setX(475);
            a.setY(50);
            b.setX(450);
            b.setY(50);
            c.setX(450);
            c.setY(75);
            d.setX(425);
            d.setY(75);
            setName("S_block");
        } else if (RandomNum > 45 && RandomNum < 60) {
            a.setX( 475);
            a.setY(50);
            b.setX(450);
            b.setY(50);
            c.setX(475);
            c.setY(75);
            d.setX(500);
            d.setY(75);
            setName("Z_block");
        } else if (RandomNum > 60 && RandomNum < 75) {
            a.setX(425);
            a.setY(50);
            b.setX(425);
            b.setY(75);
            c.setX(450);
            c.setY(75);
            d.setX(475);
            d.setY(75);
            setName("J_block");
        } else if (RandomNum > 75 && RandomNum < 90) {
            a.setX(475);
            a.setY(50);
            b.setX(425);
            b.setY(75);
            c.setX(450);
            c.setY(75);
            d.setX(475);
            d.setY(75);
            setName("L_block");
        } else if (RandomNum > 90 && RandomNum < 105) {
            a.setX(400);
            a.setY(50);
            b.setX(425);
            b.setY(50);
            c.setX(450);
            c.setY(50);
            d.setX(475);
            d.setY(50);
            setName("I_block");
        } else {
            a.setX(425);
            a.setY(50);
            b.setX(450);
            b.setY(50);
            c.setX(450);
            c.setY(75);
            d.setX(475);
            d.setY(50);
            setName("T_block");
        }
        return new Next_shape(a, b, c, d, name);
    }
}
