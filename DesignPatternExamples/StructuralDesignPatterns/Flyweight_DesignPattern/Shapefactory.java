package StructuralDesignPatterns.Flyweight_DesignPattern;

import java.util.HashMap;

public class Shapefactory {
    private static final HashMap<String, Circle> circleMap = new HashMap<>();


    public static Shape getCircle(String color) {
        Circle circle = circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
