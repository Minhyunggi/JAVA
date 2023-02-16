package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        Runnable partA = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("A상품" + i + "/5" + "준비");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("A상품 준비완료");
            }
        };
        Runnable partB = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("B상품" + i + "/5" + "준비");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("B상품 준비완료");
            }
        };
        Runnable partSet = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("세트상품" + i + "/5" + "준비");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("세트상품 준비완료");
            }
        };
        Thread partAThread = new Thread(partA);
        Thread partBThread = new Thread(partB);
        partAThread.start();
        partBThread.start();

        try {
            partAThread.join();
            partBThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 위의 조인 방법 대신에 .isAlive = 쓰레드가 살아있는지 확인하는메소드
//        while (partAThread.isAlive() || partBThread.isAlive()) {} 이 방법으로 스레드가 멈췄을때 다음동작을 하도록 해줄수있음
        Thread partSetThread = new Thread(partSet);
        partSetThread.start();
    }
}
