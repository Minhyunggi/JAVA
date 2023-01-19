package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 10; // 오전 10시
        if (hour < 14)
            System.out.println("아이스 아메리카노 +1"); // if문 내에서 하나의 문장을 실행할때는 중괄호 없이도 가능

        // if 문을 이용해서 여러개의 문장을 실행할때는 중괄호 포함하여야 가능
        if (hour < 14) {  
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
            System.out.println("커피 주문 완료");
        }

        // 오후 2시 이전, 모닝커피를 마시지 않은 경우
        hour = 10;
        boolean morningCoffee = false; // 모닝커피
        if (hour < 14 && morningCoffee == false){
            System.out.println("시간도 괜찮고 모닝커피도 마시지 않았으니 아이스 아메리카노 +1");
        }

        // 오후 2시 이후이거나 모닝 커피를 마신 경우
        hour = 15;
        morningCoffee = true;
        if (hour >= 14 || morningCoffee == true){
            System.out.println("디카페인 아이스 아메라키노 +1");
        }


    }

}
