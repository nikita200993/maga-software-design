package com.nikitaaero.mipt.softwaredesign.figures;

public final class Square implements Figure {

    private final double size;

    public Square(final int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("size should be positive, but was " + size);
        }
        this.size = size;
    }

    @Override
    public double calcArea() {
        return size * size;
    }
}
