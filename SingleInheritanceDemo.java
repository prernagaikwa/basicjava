// Superclass (Parent Class)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass (Child Class)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to demonstrate the inheritance
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited method from Animal class
        myDog.bark(); // Method defined in Dog class
    }
}
