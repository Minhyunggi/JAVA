package chap_06;

public class _07_VariableScope {
    // 지역변수란 중괄호 안에서 선언된 변수나 매소드같은것을 다른곳에서 사용하지 못하는것을 의미함 , for문 i와 같은느낌
    // 때문에 파라미터같은것으로 사용하면 가능함
    public static void methodA(int number) {
        System.out.println(number);
    }

    public static void methodB() {
        int result = 1; // 지역변수
    }
    public static void main(String[] args) {
        int number = 3;
        methodA(5);
    }
}
