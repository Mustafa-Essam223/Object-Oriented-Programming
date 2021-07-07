package Controller;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.awt.*;

public  abstract class Shapes
{
    private static final int size=25;
    private static final int y=24*size;
    private static final int x=12*size;
    private static final int Move=25;
    //

    public static int getMove() {
        return Move;
    }
    public static int getSize() {
        return size;
    }
    public static int getX() {
        return x;
    }
    public static int getY() {
        return y;
    }

    //

    public abstract void create_O();
    public abstract void create_S();
    public abstract void create_Z();
    public abstract void create_J() ;
    public abstract void create_L();
    public abstract void create_I() ;
    public abstract void create_T();

    //
}
