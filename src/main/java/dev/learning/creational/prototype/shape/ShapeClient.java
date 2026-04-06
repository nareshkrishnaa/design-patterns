package dev.learning.creational.prototype.shape;

public class ShapeClient {
    private Shape shapePrototype;

    // When you create a client, you give it a prototype (a shape).
    public ShapeClient(Shape shapePrototype) {
        System.out.println("Shape Client input : "+shapePrototype.hashCode());
        this.shapePrototype = shapePrototype;
    }

    // This method creates a new shape using the prototype.
    public Shape createShape() {
        System.out.println("prototype "+shapePrototype.hashCode()+" cloning");
        return shapePrototype.clone();
    }
}
