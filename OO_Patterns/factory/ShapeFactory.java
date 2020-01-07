/*
An example of the factory design pattern. (For review purposes)

Reference: https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
*/

/* Next, declare a factory class for generating Shape objects. */
public class ShapeFactory {

    public Shape createInstance (String name) {

        if (name.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        else if (name.equalsIgnoreCase("Square")) {
            return new Square();
        }

        return null;
    }
}
