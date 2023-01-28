package chap_06;

public class _02_Parameter {
    public static void power(int number) { // int number는 전달값 , Parameter , 매개변수라고함
        int result = number * number;
        System.out.println(number + "의 2승은 " + result);
    }
    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * number;
        }
        System.out.println(number + " 의 " + exponent + " 승은 " + result);
    }
    public static void main(String[] args) {
        // 전달값 파라미터
        power(5); // 5 * 5 = 25 , 안에들어간값은 Argument , 인수라고함
        power(3); // 3 * 3 = 9

        powerByExp(2,3); // 2x2x2 = 8
        powerByExp(3,3); // 3x3x3 = 27
    }
}
