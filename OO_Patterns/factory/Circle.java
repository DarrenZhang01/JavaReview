/*
An example of the factory design pattern. (For review purposes)

Reference: https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
*/



public class Circle implements Shape {
    @Override
    public void declareShape () {
        System.out.println("Now this is a circle!");
    }
}
