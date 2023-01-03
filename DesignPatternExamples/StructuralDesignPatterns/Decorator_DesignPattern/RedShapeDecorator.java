package StructuralDesignPatterns.Decorator_DesignPattern;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decorateShape) {
        super(decorateShape);
    }

    @Override
    public void display() {
        decorateShape.display();
        setRedBorder(decorateShape);
    }
    private void setRedBorder(Shape decorateShape)
    {
        System.out.println("Border Color : Red");
    }
}
