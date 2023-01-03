package StructuralDesignPatterns.Bridge_DesignPattern;

public class GreenCircle implements DrawAPI{
    @Override
    public void DrawCircle(int radius, int x, int y) {
        System.out.println("Drawing StructuralDesignPatterns.Decorator_DesignPattern.Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
