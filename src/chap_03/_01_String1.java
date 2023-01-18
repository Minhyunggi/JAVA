package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like JAVA and Python and C.";
        //문자열의 길이
        System.out.println(s.length());
        //대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //포함 관계
        System.out.println(s.contains("JAVA")); //포함하면 true 포함하지않으면 false
        System.out.println(s.contains("C#")); //false
        System.out.println(s.indexOf("JAVA")); // 위치정보
        System.out.println(s.indexOf("C#")); // 포함하지 않는다면 -1
        System.out.println(s.indexOf("and")); // and를 찾는건데 두가지중 앞에꺼먼저찾음
        System.out.println(s.lastIndexOf("and")); // and를 찾지만 맨뒤에꺼를 찾는방식
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true 아니면 false 반환
        System.out.println(s.endsWith("C.")); // 이 문자열로 끝나면 true 아니면 false 반환

    }
}
