package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술연산자

        //일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2, 소수버려짐
        System.out.println(2 / 4); // 0.5에서 소수버려지고 0
        System.out.println(5 % 2); // 1, 나머지값구하기

        //우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8

        //변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;
        c = a + b;
//      int c = a + b; 로 해도 상관없음
        System.out.println(c); // 30
        c = a - b;
        System.out.println(c); // 10
        c = a * b;
        System.out.println(c); // 200
        c = a / b;
        System.out.println(c); // 2
        c = a % b;
        System.out.println(c); // 0

        // 증감 연산 ++ , --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11
        System.out.println(val); // 11
        // ++val 과 val++ 의 차이는 +가 먼저붙으면 먼저 연산하고나서 출력하지만 +가 뒤에붙으면 예를들어 프린트를 먼저 마치고 더해주게된다.
        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10
        System.out.println(val); // 11
        // --도 동일

        // 은행 대기표
        int waiting = 0;
        System.out.println("대기번호" + waiting++ + "번"); // 대기인원 0명
        System.out.println("대기번호" + waiting++ + "번"); // 대기인원 1명
        System.out.println("대기번호" + waiting++ + "번"); // 대기인원 2명
        System.out.println("총 대기 인원" + waiting); // 총 대기인원 3명




    }
}
