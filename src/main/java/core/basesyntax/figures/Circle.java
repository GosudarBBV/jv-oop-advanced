package core.basesyntax.figures;

import core.basesyntax.utils.Color;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(double area, Color color, double radius) {
        super(area, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, "
                + "area: " + Math.round(calculateArea() * 10) / 10
                + " sq. units, " + "radius: " + radius
                + " units, color: " + getColor().toString().toLowerCase());
    }
}
