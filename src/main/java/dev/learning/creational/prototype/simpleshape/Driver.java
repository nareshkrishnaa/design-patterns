package dev.learning.creational.prototype.simpleshape;



public class Driver {
    static void main() {
        Shape s1 = new Shape("red");
        s1.draw();

        Shape s2 = s1.clone();
        s2.draw();

    }
}
