package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {

        // 주차요금은 시간당 4000 원 (일일 최대 요금은 30000원)
        // 경차 또는 장애인 차량은 최종 요금에서 50% 할인
        // 일반 차량 5시간 주차 시 20000원
        // 경차 차량 10시간 주차 시 15000원
        // 실행결과 : 주차요금은 xx 만큼 나왔습니다

        int hour = 2;
        int day = 30000;
        boolean handicap = true;
        int fee = hour * 4000;
        if (fee > day) {
            fee = day;
        }
        if (handicap == true) {
            fee = fee / 2;
        }
        System.out.println("요금은" + fee + "만큼 나왔습니다");
    }
}
