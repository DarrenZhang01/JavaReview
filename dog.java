/*
Create a simple class called "Dog" and realize some basic functionalities.
*/
class Dog {
    // Name is an attribute of any single dog.
    String name;
    // Define the main method of this class.
    public static void main (String[] args) {
        // Create a Dog object and access it.
        Dog dog = new Dog();
        dog.bark();
        dog.name = "Bart";

        // Create a Dog array
        Dog[] myDogs = new Dog[3];
        // Put some dog objects into the array.
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog;

        // Now access the Dog objects using the array pointers
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        // Now check the name of the last dog.
        System.out.print("The last Dog's name in the array is: ");
        System.out.println(myDogs[2].name);

        // Now iterate through all the dogs in the array and tell them to bark;
        for (int i = 0; i < myDogs.length; i++) {
            myDogs[i].bark();
        }
    }
    // Define the bark method below the main method.
    public void bark () {
        System.out.println(name + " says Ruff!");
    }
}
