package com.example.sealed;

public class Main {

    public static void main(String... args) {
        // write your code here
        Shape shape = new Circle(5.0);
        Shape anotherShape = new Rectangle();

        if (shape instanceof Circle c) {
            c.draw();
        }

        // pattern matching for instanceof
        if (anotherShape instanceof Circle c) {
            c.draw();
        } else if (anotherShape instanceof Rectangle r) {
            r.draw();
            r.erase();
        } else {
            System.out.println("Unexpected Shape");
        }

        switch (shape) {
            case null -> System.out.println("Shape is null");
            case Square s -> {
                s.draw();
                s.erase();
                System.out.println("Square area: " + s.area() + " Square parameter: " + s.parameter());
            }
            case Rectangle r -> {
                r.draw();
                System.out.println("Rectangle area: " + r.area() + " Rectangle parameter: " + r.parameter());
            }
            // guarded pattern for further refinement
            case Circle c when c.getRadius() == 0.0 -> {
                c.draw();
                System.out.println("Circle area: " + c.area() + " Circle parameter: " + c.parameter() + " radius: is 0.0");
            }
            case Circle c -> {
                c.draw();
                System.out.println("Circle area: " + c.area() + " Circle parameter: " + c.parameter() + " radius: " + c.getRadius());
            }
            case Triangle t -> {
                t.draw();
                System.out.println("Triangle area: " + t.area() + " Triangle parameter: " + t.parameter());
            }
            default -> {
                System.out.println("Unexpected Type");
            }
        }
    }
}
