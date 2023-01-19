package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like JAVA and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and",",")); // I like JAVA, Python, C. / and를 ,로 변환
        System.out.println(s.substring(7)); // 7번째 문자부터 시작하도록 변환
        System.out.println(s.substring(s.indexOf("JAVA"))); // 위와 마찬가지
        System.out.println(s.substring(s.indexOf("JAVA"),s.indexOf("."))); // 시작위치 JAVA 부터 끝위치 . 까지 가는데 .의 직전까지만 출력

        // 공백 제거
        s = "       I love JAVA.       ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞뒤 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1 + "," + s2); // Java,Python
        System.out.println(s1.concat(",").concat(s2)); // Java,Python

    }
}
