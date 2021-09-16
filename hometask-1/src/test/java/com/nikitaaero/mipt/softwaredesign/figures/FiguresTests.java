package com.nikitaaero.mipt.softwaredesign.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FiguresTests {

    @Test
    void testCircleAreaCalc() {
        Assertions.assertEquals(2 * Math.PI, new Circle(1).calcArea());
    }

    @Test
    void testSquareAreaCalc() {
        Assertions.assertEquals(4, new Square(2).calcArea());
    }

    @Test
    void testRectangleAreaCalc() {
        Assertions.assertEquals(6, new Rectangle(3, 2).calcArea());
    }
}