package StructuralDesignPatterns.Bridge_DesignPattern;

public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;


    }

    @Override
    public void Draw() {
        drawAPI.DrawCircle(radius, x, y);

    }
}
