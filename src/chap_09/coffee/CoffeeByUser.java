package chap_09.coffee;

import chap_09.user.User;

public class CoffeeByUser <T extends User> { // 어떤형태의 타입을쓰던 상관없는데 User 클래스를 상속하는 클래스만 들어올수있음

    public T user;
    public CoffeeByUser(T user) {
        this.user = user;
    }
    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }

}
