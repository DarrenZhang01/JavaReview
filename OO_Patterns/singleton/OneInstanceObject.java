/*
A review on singleton design pattern.

A singleton object has a private constructor and only allows to be instantiated
once inside itself.

Reference: https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
*/

public class OneInstanceObject {

    /* Construct a private constructor such that this class cannot be instantiated
    outside itself. */
    private OneInstanceObject () {}

    // Instantiate this object only once.
    private static OneInstanceObject object = new OneInstanceObject();

    /* A method for getting the only instance. */
    public static OneInstanceObject getInstance () {
        return object;
    }

    /* Declare the existence of the object. */
    public static void declareExistance () {
        System.out.println("I am the only instance of this class!");
    }
}
