package chap_12;

import chap_12.clean.CleanRunnable;

public class _02_Runnable {
    public static void main(String[] args) {
        // 쓰레드와 비슷하지만 런어블은 Runnable 인터페이스를 사용
        // 런어블을 쓰는 이유는 쓰레드같은경우에 쓰레드클래스를 상속받아야하지만 상속특성상 단일상속밖에안됨 그럴때 런어블 인터페이스를 사용하면됨 (인터페이스는 여러번구현가능 , 다중상속가능)
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        cleanByBoss();
    }
    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장)" + i + "번방 청소 중");
        }
        System.out.println("사장 청소 끝");
    }
}
