package test;

public class Cat implements Interface {

    @Override
    public void move() {
        System.out.println("슈슉");
    }

    @Override
    public void eat() {
        System.out.println("쿰척");
    }

    @Override
    public void bark() {
        System.out.println("냐옹");
    }
}
