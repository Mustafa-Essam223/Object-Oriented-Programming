package StructuralDesignPatterns.Decorator_DesignPattern;

public abstract class ShapeDecorator implements Shape {
    protected Shape decorateShape;

    public ShapeDecorator(Shape decorateShape) {
        this.decorateShape = decorateShape;
    }

    public void display() {
        decorateShape.display();
    }

}
