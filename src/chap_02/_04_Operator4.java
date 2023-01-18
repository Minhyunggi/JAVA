package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = false;
        // || 는 or   && 는 and
        System.out.println(김치찌개 || 계란말이 || 제육볶음); // true

        boolean 된장찌개 = true;
        boolean 오뎅볶음 = true;
        boolean 가지무침 = true;
        // || 는 or   && 는 and
        System.out.println(된장찌개 && 오뎅볶음 && 가지무침); // true

        // 정수연산
        System.out.println((5 > 3) && (7 > 3)); // true
        System.out.println((5 > 3) && (7 < 3)); // false

        System.out.println((5 > 3) || (7 > 3)); // true
        System.out.println((5 > 3) || (7 < 3)); // true
        System.out.println((5 < 3) || (7 < 3)); // false

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
    }
}
