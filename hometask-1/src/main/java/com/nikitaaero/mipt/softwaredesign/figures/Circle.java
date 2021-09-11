package com.nikitaaero.mipt.softwaredesign.figures;

public final class Circle implements Figure {

    private final double radius;

    public Circle(final double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive, but was " + radius);
        }
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return 2 * Math.PI * radius;
    }
}
