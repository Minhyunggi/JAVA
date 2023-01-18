package chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        // 대입 연산자
        int num = 10;
        num = num + 2;
        System.out.println(num); // 12

        num = num - 2;
        System.out.println(num); // 10

        num = num * 2;
        System.out.println(num); // 20

        num = num / 2;
        System.out.println(num); // 10

        num = num % 2;
        System.out.println(num); // 0

        // 복합 대입 연산자
        num = 10;
        // num = num + 2
        num += 2; // num 이라는변수에 num + 2 같은경우는 다음과같이 줄일수있다.
        System.out.println(num); // 12
        // - , * , / , % 모두 동일하기때문에 생략
    }
}
