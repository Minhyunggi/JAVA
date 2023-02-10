package test;

public class InterfaceTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.move();
        cat.eat();
        cat.bark();
        System.out.println("-------------------");
        dog.move();
        dog.eat();
        dog.bark();
    }
}
