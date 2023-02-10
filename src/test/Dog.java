package test;

public class Dog implements Interface {

    @Override
    public void move() {
        System.out.println("슥슥");
    }

    @Override
    public void eat() {
        System.out.println("챱챱");
    }

    @Override
    public void bark() {
        System.out.println("멍멍");
    }
}
