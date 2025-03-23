class Animal {
    void eat() {
        System.out.println("Animal can eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog can bark");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog mydog = new Dog();
        mydog.eat();   
        mydog.bark();
 }
}


/* OUTPUT
Animal can eat
Dog can bark
*/