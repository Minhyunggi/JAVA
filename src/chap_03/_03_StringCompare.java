package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true 아니면 false
        System.out.println(s2.equals("python")); // 대소문자를 구분하기때문에 false
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분없이 문자열 내용이 같으면 true

        // 문자열 비교 심화
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // true

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false
        // 자바에서 문자열비교는 등호를 쓰지않고 그냥 equals를 써라.
    }
}
