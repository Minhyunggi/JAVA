package chap_10;

public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        HomeMadeburger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println("----------------------------");

        HomeMadeburger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();
        System.out.println("----------------------------");
    }

    private static HomeMadeburger getBroMadeBurger() {
        return new HomeMadeburger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 군대리아");
                System.out.println("재료 : 빵, 치킨패티, 양배추 샐러드, 딸기잼, 치즈, 삶은 계란");
            }
        };
    }

    public static HomeMadeburger getMomMadeBurger() {
        return new HomeMadeburger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제버거");
                System.out.println("재료 : 빵, 소고기패티, 해쉬브라운, 양상추, 마요네즈, 피클");
            }
        };
    }
}
abstract class HomeMadeburger {
    public abstract void cook();
}