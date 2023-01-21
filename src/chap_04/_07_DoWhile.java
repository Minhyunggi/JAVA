package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25; // 전체거리 25
        int move = 0; // 현재거리 0
        int height = 2; // 키 2m
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동거리" + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착");
        System.out.println(" --- 반복문 #1 ---");

        move = 0;
        height = 25;

        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동거리" + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착");
        System.out.println(" --- 반복문 #2 ---");

        // Do while
        do {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동거리" + move);
            move += 3; // 3m 이동
        } while (move + height < distance);
        System.out.println("도착");
        // Do while 의 경우는 do에있는것을 한번 실행시키고나서 while 조건을 파악한다음 참이면 while 처럼 실행하고 거짓이면 반복문탈출
    }
}
