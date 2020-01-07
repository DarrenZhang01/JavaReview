/*
A review on singleton design pattern.

A singleton object has a private constructor and only allows to be instantiated
once inside itself.

Reference: https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
*/

public class Singleton {

    public static void main (String[] args) {

        OneInstanceObject object = OneInstanceObject.getInstance();

        object.declareExistance();
    }
}
