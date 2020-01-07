/*
An example of the factory design pattern. (For review purposes)

Reference: https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
*/

/* Now, it is time to test the factory. */
public class FactoryExperiment {

    public static void main (String[] args) {
        // Create an instance of the factory.
        ShapeFactory factory = new ShapeFactory();
        // Create an instance of Circle.
        Shape circle = factory.createInstance("CIRCLE");
        // Check the type of the object.
        circle.declareShape();
        // Create an instance of Square.
        Shape square = factory.createInstance("SQUARE");
        // Check the type of the object.
        square.declareShape();
    }
}
