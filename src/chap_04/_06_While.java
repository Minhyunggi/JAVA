package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // While 반복문
        int distanse = 25; // 전체 거리 25
        int move = 0; // 현재 이동 거리 0
        while (move < distanse) { // 현재 이동 거리가 전체 거리보다 작다는 조건이 참일때만 반복수행
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재거리는" + move );
            move = move + 3;
        }
        System.out.println("도착");
    }
}
