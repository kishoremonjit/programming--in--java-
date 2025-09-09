// Base class
class AnimalLab9 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog class overrides sound()
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Cat class overrides sound()
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Cow class overrides sound()
class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos");
    }
}

// Main class to test the behavior
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myCow = new Cow();

        myDog.sound(); // Output: Dog barks
        myCat.sound(); // Output: Cat meows
        myCow.sound(); // Output: Cow moos
    }
}
