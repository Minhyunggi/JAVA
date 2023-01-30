package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number , int exponenrt) {
        int result = 1;
        for (int i = 0; i < exponenrt; i++) {
            result *= number;
        }
        return result;
    }

    // 만약 그냥 제곱만 구하고싶은데 새로운 매소드를 만들지않고 만들어놨던 매소드를 이용하는방법 , 매소드에서 다른 매소드를 불러올수있음
    public static int getPower(int number) {
        return getPower(number,2);
    }

    public static void main(String[] args) {
        // 메소드 필요한 이유

        // 2의 2승을 구하기
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result);

        // 3의 3승 구하기
        result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        System.out.println(result);

        // 4의 2승 구하기
        result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 4;
        }
        System.out.println(result);

        // getPower , 메소드를 이용하는 이유는 반복적으로 만들어야하는건 간소화시킬수있음
        System.out.println(getPower(3,3));

        // 제곱만구하기
        System.out.println(getPower(5));
    }
}
