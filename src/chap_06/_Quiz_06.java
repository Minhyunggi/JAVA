package chap_06;

public class _Quiz_06 {
    public static void information(String name, String number, String phoneNumber) {
        System.out.println("이름 : " + name.substring(0,1) + "**");
        System.out.println("주민등록번호 : " + number.substring(0,8) + "*******");
        System.out.println("전화번호 : " + phoneNumber.substring(0,9) + "****");
    }
    public static void main(String[] args) {
        information("민형기" , "970214-1234567" , "010-1234-5678");
    }
}
