package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (OOP : Object-Oriented Programming)
        // 유지보수 용이
        // 높은 재사용성

        // 차량용 블랙박스
        // 우리가 만든 첫 번째 제품
        // 모델명, 해상도, 가격, 색상
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";

        // 새로운 제품 개발됨
        // 모델명, 해상도, 가격, 색상 또 필요함
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";

        // 또다른 제품 개발하면? , 새로운제품이 나올때마다 새로운 변수를 만드는건 효율이 떨어짐
        BlackBox bbox = new BlackBox(); // 여기서 BlackBox 클래스는 설계도 , bbox 는 설계도로 만들어진 결과물
        // 종이접기 책은 클래스 , 종이접기책을이용해서 만든 종이학은(인스턴스)객체
        // BlackBox 클래스로부터 bbox 객체 생성
        // bbox 객체는 BlackBox 클래스의 인스턴스
        BlackBox bbox2 = new BlackBox(); // 하나의 블랙박스 클래스를가지고 서로다른 객체 여러가지를 만들수있음
    }
}
