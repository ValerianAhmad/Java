public class Main {
    public static void main(String[] args) {
        // Create an object of superClass
        SuperClass myDog = new Dog();
        myDog.sound();      // Output: Dog barks

        SuperClass myCat = new Cat();
        myCat.sound();     // Output: Cat meows

        SuperClass myAnimal = new SuperClass();
        myAnimal.sound();   // Output: Animal makes a sound
    }
}
