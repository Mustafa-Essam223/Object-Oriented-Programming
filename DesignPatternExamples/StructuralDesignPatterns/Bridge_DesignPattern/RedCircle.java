package StructuralDesignPatterns.Bridge_DesignPattern;

public class RedCircle implements DrawAPI{
    @Override
    public void DrawCircle(int radius, int x, int y) {
        System.out.println("Drawing StructuralDesignPatterns.Decorator_DesignPattern.Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");

    }
}
