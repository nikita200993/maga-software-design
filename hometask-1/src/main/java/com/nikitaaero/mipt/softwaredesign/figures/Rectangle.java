package com.nikitaaero.mipt.softwaredesign.figures;

public class Rectangle implements Figure {

    private final double xSize;
    private final double ySize;

    public Rectangle(final double xSize, final double ySize) {
        if (xSize <= 0) {
            throw new IllegalArgumentException("size for x must be positive, but was " + xSize);
        }
        if (ySize <= 0) {
            throw new IllegalArgumentException("size for y must be positive, but was " + ySize);
        }
        this.xSize = xSize;
        this.ySize = ySize;
    }

    @Override
    public double calcArea() {
        return xSize * ySize;
    }
}
