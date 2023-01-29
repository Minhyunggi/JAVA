package chap_06;

public class _05_Overloading {
    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number
    }

    public static int getPower(String strNumber) { // 만약 스트링형태의 숫자가 들어온다고 해도 위의 int getPower 처럼 계산해주고싶을때
        int number = Integer.parseInt(strNumber);
        return number * number;
    }
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩 (getPower , getPowerStr 과 같이 전달값이나 전달할 타입이나 전달값의 갯수가 다르지만 메소드 이름을 다르게 할 필요없이 같은이름으로 여러 개 만드는것)
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다를때
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(3,3)); // getPowerByExp 또한 getPower 로 메소드 오버로딩을 시켜서 같은이름으로 사용가능함
    }
}
