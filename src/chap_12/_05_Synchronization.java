package chap_12;

import chap_12.clean.Room;

public class _05_Synchronization {
    // 동기화는 메소드앞에 synchronized 를 붙여주면되고 같은메소드에 두가지쓰레드가 같이 접근하는것을 막는다. 1번방을 같이청소하는 경우를 막는것.
    public static void main(String[] args) {
        Room room = new Room();
        Runnable cleaner1 = new Runnable() {

            @Override
            public void run() {
                System.out.println("-- 직원1 청소 시작  --");
                for (int i = 1; i <= 5; i++) {
                    room.clean("직원1");
                }
                System.out.println("직원1 청소 끝 ");
            }
        };

        Runnable cleaner2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("-- 직원2 청소 시작  --");
                for (int i = 2; i <= 5; i++) {
                    room.clean("직원2");
                }
                System.out.println("직원2 청소 끝 ");
            }
        };
        Thread cleanerThread1 = new Thread(cleaner1);
        Thread cleanerThread2 = new Thread(cleaner2);
        cleanerThread1.start();
        cleanerThread2.start();
    }
}
